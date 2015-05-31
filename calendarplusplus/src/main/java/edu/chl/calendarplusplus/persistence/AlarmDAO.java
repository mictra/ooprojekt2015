/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.persistence;

import edu.chl.calendarplusplus.model.Alarm;
import edu.chl.calendarplusplus.model.IAlarm;
import java.util.List;

/**
 *
 * @author Michael
 */
public class AlarmDAO extends AbstractDAO<IAlarm, Integer> {

    public AlarmDAO() {
        super(IAlarm.class);
    }
    
    @Override
    public List<IAlarm> findAll(){
        return em.createQuery("select a from Alarm a", IAlarm.class).getResultList();
    }
    
    public void deleteAll(){
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Alarm a").executeUpdate();
        em.getTransaction().commit();
    }
    
    public void delete(int id){
        Alarm alarm = em.getReference(Alarm.class, id);
        em.getTransaction().begin();
        em.remove(alarm);
        em.getTransaction().commit();
    }
    
}
