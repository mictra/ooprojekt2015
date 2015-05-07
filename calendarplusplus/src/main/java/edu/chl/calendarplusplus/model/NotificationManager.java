/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.model;

import java.util.HashMap;

/**
 *
 * @author Johan
 */
public class NotificationManager {

    HashMap<Activity, Notification> notificationManager;
    
    public NotificationManager(){
        notificationManager = new HashMap<>();
    }
    
    public void setNotification(Activity a, Notification n){
        notificationManager.put(a, n);
    }
    
    public Notification getNotification(Activity a){
        return notificationManager.get(a);
    }
    
    public void removeNotification(Activity a){
        notificationManager.remove(a);
    }
    
}
