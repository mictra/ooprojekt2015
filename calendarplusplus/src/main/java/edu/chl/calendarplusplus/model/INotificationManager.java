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
    
    public void setNotification(Activity a, Notification n);
    public Notification getNotification(Activity a);
    public void removeNotification(Activity a);
    
}
