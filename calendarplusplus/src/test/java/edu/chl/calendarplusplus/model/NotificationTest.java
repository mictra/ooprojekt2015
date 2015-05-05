/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.model;

import java.util.Calendar;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Johan
 */
public class NotificationTest {
    
    @Test
    public void addNotification(){
        Calendar time = Calendar.getInstance();
        Activity a = new Activity(time, time, "An Activity","", "", null);
        Notification n = new Notification(time, "A Notification", a);
        Assert.assertEquals(a, n.getActivity());
    }
    
    // Here, the Notification should not be merged with the activity, since
    // this notification appears AFTER the activity's start.
    @Test
    public void invalidNotification(){
        Calendar time = Calendar.getInstance();
        Calendar alarm = Calendar.getInstance();
        alarm.set(Calendar.HOUR_OF_DAY, 2);
        Activity a = new Activity(time, time, "An Activity", "", "", null);
        Notification n = new Notification(alarm, "A Notification", a);
        Assert.assertNull(n.getActivity());
    }
    
    @Test
    public void editNotificationName(){
        Calendar time = Calendar.getInstance();
        Activity a = new Activity(time, time, "An Activity","", "", null);
        Notification n = new Notification(time, "Old Notification", a);
        n.setAlarmName("New Notification");
        Assert.assertEquals("New Notification", n.getAlarmName());
    }
    
    @Test
    public void addNotificationDesc(){
        Calendar time = Calendar.getInstance();
        Activity a = new Activity(time, time, "An Activity","", "", null);
        Notification n = new Notification(time, "Old Notification", a);
        n.setDescName("New Notification");
        Assert.assertEquals("New Notification", n.getDescName());
    }
}