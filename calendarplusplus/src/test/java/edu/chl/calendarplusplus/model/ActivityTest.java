/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package edu.chl.calendarplusplus.model;

import java.util.ArrayList;
import java.util.Calendar;
import mockclasses.MockContact;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author erikforsberg
 */
public class ActivityTest {
    //CalendarPlus cal;
    IActivity a1;
    IActivity a2;
    IActivity a3;
    IActivity nullAct;
    Calendar t1 = Calendar.getInstance();
    Calendar t2 = Calendar.getInstance();
    Calendar t3 = Calendar.getInstance();
    Calendar t4 = Calendar.getInstance();
    IContact c1;
    IContact c2;
    
    public ActivityTest() {
        // cal = new CalendarPlus();
        t1.set(2015, 4, 25, 13, 0);
        t2.set(2015, 4, 25, 14, 0);
        t3.set(2015, 4, 28, 12, 30);
        t4.set(2015, 4, 28, 15, 30);
        
        this.a1 = new Activity(t1, t2, "Act1", "", "", new ArrayList<>()) ;
        this.a2 = new Activity(t3, t4, "Act2", "", "", null);
        
        this.c1 = new MockContact();
        this.c2 = new MockContact();
        
    }
    
    
//     test not very useful at the moment
//
//
//     first assert: make sure null values are set to empty string in model
//     second assert: make sure empty list of attendees are set with null parameter
//
//
   
    
    
    @Test
    public void testChangeParameters(){
        a1.setName("newAct1");
        Assert.assertTrue(a1.getName().equals("newAct1"));
        a1.setLocation("Test");
        Assert.assertTrue(a1.getLocation().equals("Test"));
        a1.setDescription("Test");
        Assert.assertTrue(a1.getLocation().equals("Test"));
    }
    
    @Test
    public void testAttendees(){
        a1.addAttendee(c1);
        Assert.assertTrue(a1.getAttendees().size() == 1);
        a1.addAttendee(c2);
        Assert.assertTrue(a1.getAttendees().size() == 2);
        a1.removeAttendee(c1);
        a1.removeAttendee(c2);
        Assert.assertTrue(a1.getAttendees().isEmpty());
    }
    
    @Test
    public void failTest(){
        a1.setEndTime(t1);
        a1.setStartTime(t2);  
        
        //Illegal time changes. StartTime and EndTime should remain as they were.
        Assert.assertTrue(a1.getStartTime().equals(t1));
        Assert.assertTrue(a1.getEndTime().equals(t2));
    }
}
