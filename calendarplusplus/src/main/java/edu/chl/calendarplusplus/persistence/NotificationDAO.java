/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.persistence;

import edu.chl.calendarplusplus.alarmnotification.INotification;
import edu.chl.calendarplusplus.alarmnotification.Notification;
import java.util.List;

/**
 *
 * @author Michael
 */
public class NotificationDAO extends AbstractDAO<INotification, Integer> {

    public NotificationDAO() {
        super(INotification.class);
    }
    
    @Override
    public List<INotification> findAll(){
        return em.createQuery("select n from Notification n", INotification.class).getResultList();
    }
    
    public void deleteAll(){
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Notification n").executeUpdate();
        em.getTransaction().commit();
    }
    
    public void delete(int id){
        Notification not = em.getReference(Notification.class, id);
        em.getTransaction().begin();
        em.remove(not);
        em.getTransaction().commit();
    }
    
}
