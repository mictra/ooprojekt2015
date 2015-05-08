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
 * @author erikforsberg
 */
public class CalenderPlusTest {
    
    CalendarPlus cal;
    Activity a1;
    Activity a2;
    Calendar t1 = Calendar.getInstance();
    Calendar t2 = Calendar.getInstance();
    Calendar t3 = Calendar.getInstance();
    Calendar t4 = Calendar.getInstance();
    Contact c1;
    Contact c2;
    Alarm al1;
    
    public CalenderPlusTest(){
        cal = new CalendarPlus();
        
        t1.set(2015, 4, 25, 13, 0);
        t2.set(2015, 4, 25, 14, 0);
        t3.set(2015, 4, 28, 12, 30);
        t4.set(2015, 4, 28, 15, 30);
        
        this.a1 = new Activity(t1, t2, "Act1", "", "", null) ;
        this.a2 = new Activity(t3, t4, "Act2", "", "", null);
        
        this.c1 = new Contact("Erik", "Phone1", "Mail1");
        this.c2 = new Contact("Jenny", "Phone2", "Mail2");
        
        this.al1 = new Alarm(t1, "alarm1");
        
    }
    
    
    
    @Test
    public void testAddActivity(){
        Assert.assertTrue(cal.getActivityList().isEmpty());
        cal.addActivity(a1);
        Assert.assertTrue(cal.getActivityList().size() == 1);
        cal.addActivity(a2);
        Assert.assertTrue(cal.getActivityList().size() == 2);
    }
    
    @Test
    public void testRemoveActivity(){
        cal.addActivity(a1);
        cal.addActivity(a2);
        Assert.assertTrue(cal.getActivityList().size() == 2);
        cal.removeActivity(a1);
        Assert.assertTrue(cal.getActivityList().size() == 1);
        cal.removeActivity(a2);
        Assert.assertTrue(cal.getActivityList().isEmpty());
    }
    
    @Test
    public void testAddAlarm(){
        cal.addAlarm(al1);
        Assert.assertTrue(cal.getAlarmList().size() == 1);
    }
    
    @Test
    public void testRemoveAlarm(){
        cal.addAlarm(al1);
        Assert.assertTrue(cal.getAlarmList().size() == 1);
        cal.removeAlarm(al1);
        Assert.assertTrue(cal.getAlarmList().isEmpty());
    }
    
    
}
