/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.model;

import java.util.Calendar;
import mockclasses.MockActivity;
import mockclasses.MockAlarm;
import mockclasses.MockContact;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author erikforsberg
 */
public class CalenderPlusTest {
    
    CalendarPlus cal;
    IActivity a1;
    IActivity a2;
    Calendar t1 = Calendar.getInstance();
    Calendar t2 = Calendar.getInstance();
    Calendar t3 = Calendar.getInstance();
    Calendar t4 = Calendar.getInstance();
    IContact c1;
    IContact c2;
    IAlarm al1;
    
    public CalenderPlusTest(){
        cal = new CalendarPlus();
        
        t1.set(2015, 4, 25, 13, 0);
        t2.set(2015, 4, 25, 14, 0);
        t3.set(2015, 4, 28, 12, 30);
        t4.set(2015, 4, 28, 15, 30);
        
        this.a1 = new MockActivity() ;
        this.a2 = new MockActivity();
        
        this.c1 = new MockContact();
        this.c2 = new MockContact();
        
        this.al1 = new MockAlarm();
        
    }
    
    
    
    @Test
    public void testAddActivity(){
        Assert.assertTrue(cal.getActivityList().isEmpty());
        cal.addActivity((Activity) a1);
        Assert.assertTrue(cal.getActivityList().size() == 1);
        cal.addActivity((Activity) a2);
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
