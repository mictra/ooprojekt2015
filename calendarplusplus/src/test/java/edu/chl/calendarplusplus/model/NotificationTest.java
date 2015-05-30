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
    Calendar time_1 = Calendar.getInstance();
    Calendar time_2 = Calendar.getInstance();
    IActivity a;
    INotification n;
    
    public NotificationTest(){
        time_2.add(Calendar.MINUTE, 30);
        a = new Activity(time_1, time_2, "An Activity", "", "", null);
        n = new Notification(time_1, "A Notification", "A Description", a);
    }
    
    @Test
    public void addNotification(){
        Assert.assertEquals(a, n.getActivity());
    }
    
    // Here, the Notification should not be merged with the activity, since
    // this notification appears AFTER the activity's start.
    @Test
    public void invalidNotification(){
        Calendar alarm = Calendar.getInstance();
        alarm.add(Calendar.HOUR_OF_DAY, 2);
        n = new Notification(alarm, "A Notification", "A Description", a);
        Assert.assertNull(n.getActivity());
    }
    
    @Test
    public void editNotificationName(){
        n = new Notification(time_1, "Old Notification", "A Description", a);
        n.setAlarmName("New Notification");
        Assert.assertEquals("New Notification", n.getAlarmName());
    }
    
    @Test
    public void addNotificationDesc(){
        n = new Notification(time_1, "Old Notification", "Old Description", a);
        n.setDescName("New Notification");
        Assert.assertEquals("New Notification", n.getDescName());
    }
}
