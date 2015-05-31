/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.model;

import edu.chl.calendarplusplus.alarmnotification.model.Notification;
import edu.chl.calendarplusplus.alarmnotification.model.INotificationManager;
import edu.chl.calendarplusplus.alarmnotification.model.INotification;
import edu.chl.calendarplusplus.alarmnotification.model.NotificationManager;
import edu.chl.calendarplusplus.activity.model.Activity;
import edu.chl.calendarplusplus.activity.model.IActivity;
import java.util.Calendar;
import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author Johan
 */
public class NotificationManagerTest {
    
    Calendar time_1 = Calendar.getInstance();
    Calendar time_2 = Calendar.getInstance();
    IActivity a1;
    INotification n1;
    INotificationManager n;
    
    public NotificationManagerTest(){
        n = new NotificationManager();
        time_2.add(Calendar.MINUTE, 5);
        time_2.add(Calendar.MINUTE, 10);
    }
    
    @Test
    public void getNotification(){
        a1 = new Activity(time_1, time_2, "An Activity", "", "", null);
        n1 = new Notification(time_1, "A Notification", "A Description", a1);
        n.setNotification(a1, n1);
        
        Assert.assertEquals(n1, n.getNotification(a1));
    }
    
    //@Test
    public void editNotification(){
        a1 = new Activity(time_1, time_2, "An Activity", "", "", null);
        n1 = new Notification(time_1, "Old Notification", "A Description",a1);
        n.setNotification(a1, n1);
        Assert.assertEquals(n1, n.getNotification(a1));
        Notification n2 = new Notification(time_1, "New Notification", "A Description", a1);
        n.setNotification(a1, n2);
        Assert.assertEquals(n2, n.getNotification(a1));
    }
    
}
