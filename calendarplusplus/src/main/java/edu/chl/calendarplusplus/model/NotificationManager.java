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
public class NotificationManager implements INotificationManager{

    HashMap<IActivity, INotification> notificationManager;
    
    public NotificationManager(){
        notificationManager = new HashMap<>();
    }
    
    public void setNotification(IActivity a, INotification n){
        if(getNotification(a) != null){
            notificationManager.remove(n.getActivity());
        }
        notificationManager.put(a, n);
    }
    
    public INotification getNotification(IActivity a){
        return notificationManager.get(a);
    }
    
    public void removeNotification(IActivity a){
        notificationManager.remove(a);
    }
    
}
