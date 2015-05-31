/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.alarmnotification.model;

import edu.chl.calendarplusplus.activity.model.IActivity;


/**
 *
 * @author Johan
 */
public interface INotificationManager {
    
    public void setNotification(IActivity a, INotification n);
    public INotification getNotification(IActivity a);
    public void removeNotification(IActivity a);
    
}
