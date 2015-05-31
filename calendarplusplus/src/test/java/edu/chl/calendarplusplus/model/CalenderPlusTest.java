/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.model;

import edu.chl.calendarplusplus.CalendarPlus;
import edu.chl.calendarplusplus.alarmnotification.IAlarm;
import edu.chl.calendarplusplus.contact.IContact;
import edu.chl.calendarplusplus.activity.Activity;
import edu.chl.calendarplusplus.activity.IActivity;
import java.util.ArrayList;
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
    IActivity a3;
    IActivity a4;
    Calendar t1 = Calendar.getInstance();
    Calendar t2 = Calendar.getInstance();
    Calendar t3 = Calendar.getInstance();
    Calendar t4 = Calendar.getInstance();
    Calendar start = Calendar.getInstance();
    Calendar end = Calendar.getInstance();
    IContact c1;
    IContact c2;
    IAlarm al1;
    
    public CalenderPlusTest(){
        cal = new CalendarPlus();
        
        t1.set(2015, 4, 25, 13, 0);
        t2.set(2015, 4, 25, 14, 0);
        t3.set(2015, 4, 28, 12, 30);
        t4.set(2015, 4, 28, 15, 30);
        start.set(2015, 4, 25, 13, 30);
        end.set(2015, 4, 25, 14, 30);
        
        
        this.a1 = new MockActivity() ;
        this.a2 = new MockActivity();
        
        this.a3 = new Activity(t1, t2, "Act1", "", "", new ArrayList<>()) ;
        this.a4 = new Activity(t3, t4, "Act2", "", "", null);
        
        this.c1 = new MockContact();
        this.c2 = new MockContact();
        
        this.al1 = new MockAlarm();
        
    }
    
    
    
   // @Test
    public void testAddActivity(){
        Assert.assertTrue(cal.getActivityList().isEmpty());
        cal.addActivity(a1);
        Assert.assertTrue(cal.getActivityList().size() == 1);
        cal.addActivity(a2);
        Assert.assertTrue(cal.getActivityList().size() == 2);
    }
    
  //  @Test
    public void testRemoveActivity(){
        cal.addActivity(a1);
        cal.addActivity(a2);
        Assert.assertTrue(cal.getActivityList().size() == 2);
        cal.removeActivity(a1);
        Assert.assertTrue(cal.getActivityList().size() == 1);
        cal.removeActivity(a2);
        Assert.assertTrue(cal.getActivityList().isEmpty());
    }
    
   // @Test
    public void testAddAlarm(){
        cal.addAlarm(al1);
        Assert.assertTrue(cal.getAlarmList().size() == 1);
    }
    
    //@Test
    public void testRemoveAlarm(){
        cal.addAlarm(al1);
        Assert.assertTrue(cal.getAlarmList().size() == 1);
        cal.removeAlarm(al1);
        Assert.assertTrue(cal.getAlarmList().isEmpty());
    }
    
    //@Test
    public void testGetActivitiesByHour(){
        cal.addActivity(a3);
        cal.addActivity(a4);
        Assert.assertTrue(cal.getActivitiesByTimeInterval(start, end).size() == 1 );
        Assert.assertTrue(cal.getActivitiesByTimeInterval(start, t4).size() == 2 );
        Assert.assertTrue(cal.getActivitiesByTimeInterval(end, t4).size() == 1 );
        Assert.assertTrue(cal.getActivitiesByTimeInterval(start, t3).size() == 1 );

        System.out.println("LISTAN: " + cal.getActivitiesByTimeInterval(start, t4));
    }
    
}
