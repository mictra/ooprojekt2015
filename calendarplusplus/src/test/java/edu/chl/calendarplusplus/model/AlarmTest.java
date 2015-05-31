/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.model;

import edu.chl.calendarplusplus.alarmnotification.Alarm;
import edu.chl.calendarplusplus.alarmnotification.IAlarm;
import java.util.Calendar;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Johan
 */
public class AlarmTest {
    Calendar time_1 = Calendar.getInstance();
    Calendar time_2 = Calendar.getInstance();
    IAlarm a;
    
    public AlarmTest(){
        a = new Alarm(time_1, "An Alarm", null);
    }
    
    //@Test
    public void createAlarm(){
        Assert.assertEquals(time_1, a.getAlarm());
    }
    
    @Test
    public void editAlarm(){
        time_2.add(Calendar.HOUR_OF_DAY, -2);
        a.setAlarm(time_2);
        Assert.assertEquals(time_2, a.getAlarm());
        Assert.assertNotSame(time_1, a.getAlarm());
    }
 
    //@Test
    public void noAlarmName(){
        a = new Alarm(time_1, "", null);
        Assert.assertNull(a.getAlarm());
        Assert.assertNull(a.getAlarmName());
    }
    
    // The alarm should be invalid if the time/date has already passed.
   // @Test
    public void invalidAlarm(){
        time_1.add(Calendar.HOUR_OF_DAY, -12);
        a = new Alarm(time_1, "An Alarm", null);
        Assert.assertNull(a.getAlarm());
        Assert.assertNull(a.getAlarmName());
    }
    
    @Test
    public void editAlarmName(){
        a.setAlarmName("New Alarm name");
        Assert.assertEquals("New Alarm name", a.getAlarmName());
        
    }
    
    @Test
    public void addAlarmDesc(){
        a.setDescName("This is a fun alarm!");
        Assert.assertEquals("This is a fun alarm!", a.getDescName());
    }
    
}
