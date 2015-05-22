package edu.chl.calendarplusplus.persistence;

import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Michael
 */
/**
 * Basic CRUD interface implemented by all DAO (Facade) classes
 *
 * @param <T> Type
 * @param <K> Primary key
 */
public interface IDAO<T, K> {
    
    public EntityManager getEntityManager();

    public void create(T t);

    public void delete(K id);

    public void update(T t);

    public T find(K id);

    public List<T> findAll();

    public List<T> findRange(int first, int n);

    public int count();

}
