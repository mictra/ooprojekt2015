/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.model;


/**
 *
 * @author Johan
 */
public interface INotificationManager {
    
    public void setNotification(IActivity a, INotification n);
    public Notification getNotification(IActivity a);
    public void removeNotification(IActivity a);
    
}
