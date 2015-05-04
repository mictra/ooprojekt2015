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
public class AlarmTest {
 
    @Test
    public void createAlarm(){
        Calendar time = Calendar.getInstance();
        Alarm a = new Alarm(time, "An Alarm");
        Assert.assertEquals(time, a.getAlarm());
    }
    
    @Test
    public void editAlarm(){
        Calendar time_1 = Calendar.getInstance();
        Calendar time_2 = Calendar.getInstance();
        time_2.set(Calendar.HOUR_OF_DAY, -2);
        Alarm a = new Alarm(time_1, "An Alarm");
        a.setAlarm(time_2);
        Assert.assertEquals(time_2, a.getAlarm());
        Assert.assertNotSame(time_1, a.getAlarm());
    }
    
    @Test
    public void editAlarmName(){
        Alarm a = new Alarm(Calendar.getInstance(), "Old Alarm name");
        a.setAlarmName("New Alarm name");
        Assert.assertEquals("New Alarm name", a.getAlarmName());
        
    }
    
    @Test
    public void addAlarmDesc(){
        Alarm a = new Alarm(Calendar.getInstance(), "An Alarm");
        a.setDescName("This is a fun alarm!");
        Assert.assertEquals("This is a fun alarm!", a.getDescName());
    }
    
}
