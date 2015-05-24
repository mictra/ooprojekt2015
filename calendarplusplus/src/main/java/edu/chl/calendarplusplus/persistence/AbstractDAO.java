package edu.chl.calendarplusplus.persistence;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TransactionRequiredException;
import javax.persistence.TypedQuery;

/**
 *
 * @author Michael
 */
/**
 * Base class for any persisting collection DAO = Data access object (also
 * called a Facade)
 *
 * NOTE:
 *
 * @param <T> Type
 * @param <K> Primary key (username)
 *
 */
public abstract class AbstractDAO<T, K> implements IDAO<T, K> {

    private final Class<T> clazz;

    protected final String PERSISTENCE_UNIT_NAME = "calendar_pu";
    protected final EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    protected final EntityManager em = factory.createEntityManager();

    protected AbstractDAO(Class<T> clazz) {
        this.clazz = clazz;
    }
    
    public EntityManager getEntityManager(){
        return em;
    }

    @Override
    public void create(T t) {
        em.getTransaction().begin();
        try {
            em.persist(t);
        } catch (EntityExistsException | TransactionRequiredException e1) {
            e1.printStackTrace(); // Ignore those exception for now.
        } catch (Exception e) {
            throw e;
        }
        em.getTransaction().commit();
    }

    @Override
    public void delete(K id) {
        T t = em.getReference(clazz, id);
        em.remove(t);
    }

    /**
     * Using out parameter
     *
     * @param t
     */
    @Override
    public void update(T t) {
        em.getTransaction().begin();
        em.merge(t);
        em.getTransaction().commit();
    }

    @Override
    public T find(K id) {
        return em.find(clazz, id);
    }

    @Override
    public List<T> findAll() {
        return get(true, -1, -1);
    }

    @Override
    public List<T> findRange(int first, int n) {
        return get(false, first, n);
    }

    //@SuppressWarnings("")
    private List<T> get(boolean all, int first, int n) {
        List<T> found = new ArrayList<>();
        // Warning because typename not found in string (clazz.getSimpleName())
        // Criteria API better, possible misstakes in String, NOTE space before t
        TypedQuery<T> q = em.createQuery("select t from " + clazz.getSimpleName() + " t", clazz);
        if (!all) {
            q.setFirstResult(first);
            q.setMaxResults(n);
        }
        found.addAll(q.getResultList());
        return found;
    }

    @Override
    public int count() {
        // Warning because typename not found in string (clazz.getSimpleName())
        // Criteria API better, possible misstakes in String, NOTE space before t      
        Long n = em.createQuery("select count(t) from " + clazz.getSimpleName() + " t", Long.class)
                .getSingleResult();
        return n.intValue();
    }
    
}
