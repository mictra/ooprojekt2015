/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.persistence;

import edu.chl.calendarplusplus.activity.Activity;
import edu.chl.calendarplusplus.activity.IActivity;
import java.util.List;

/**
 *
 * @author Michael
 */
public class ActivityDAO extends AbstractDAO<IActivity, Integer> {

    public ActivityDAO() {
        super(IActivity.class);
    }
    
    @Override
    public List<IActivity> findAll(){
        return em.createQuery("select a from Activity a", IActivity.class).getResultList();
    }
    
    public void deleteAll(){
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Activity a").executeUpdate();
        em.getTransaction().commit();
    }
    
    public void delete(int id){
        Activity act = em.getReference(Activity.class, id);
        em.getTransaction().begin();
        em.remove(act);
        em.getTransaction().commit();
    }
    
}
