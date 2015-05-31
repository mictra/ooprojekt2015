/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.model;

import java.util.ArrayList;
import java.util.Calendar;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Johan
 */
public class ActivityManagerTest {
    Calendar time_1 = Calendar.getInstance();
    Calendar time_2 = Calendar.getInstance();
    Calendar time_3 = Calendar.getInstance();
    IActivity a1, a2, a3;
    IContact c;
    ArrayList<IActivity> activities;
    IActivityManager a;
    
    public ActivityManagerTest(){
        c = new Contact("Carl", "", "");
        activities = new ArrayList<>();
        a = new ActivityManager();
        time_2.add(Calendar.MINUTE, 10);
    }
    
    @Test
    public void checkActivities(){
        a1 = new Activity(time_1, time_2, "First Activity", "", "", null);
        a2 = new Activity(time_1, time_2, "Second Activity","", "", null);
        
        a.addActivityToList(activities,a1); a.addActivityToList(activities,a2);
        a.setContactActivities(c, activities);
        Assert.assertEquals(2, a.getContactActivities(c).size());
    }
    
    // Here we try to see if we can add the exact same activity twice.
    // This should not be able to happen. So we just ignore duplicates.
    @Test
    public void addActivityTwice(){
        a1 = new Activity(time_1, time_2, "An Activity", "", "", null);
        
        a.addActivityToList(activities,a1); a.addActivityToList(activities,a1);
        a.setContactActivities(c, activities);
        Assert.assertEquals(1, a.getContactActivities(c).size());
    }
    
    // The Activity-list should be sorted based on the which time is closest
    // to the current time, as long as the activity has not passed.
    // "activity" should be equal to {Second Activity, Third Activity, First Activity}
    @Test
    public void sortedActivityList(){
        time_1.add(Calendar.MINUTE, -20);
        time_2.add(Calendar.MINUTE, 40);
        time_3.add(Calendar.HOUR_OF_DAY, 1);
        a1 = new Activity(time_2, time_3, "First Activity", "", "", null);
        a2 = new Activity(time_1, time_2, "Second Activity", "", "", null);
        a3 = new Activity(time_1, time_3, "Third Activity", "", "", null);
        
        a.addActivityToList(activities, a1);
        a.addActivityToList(activities, a2);
        a.addActivityToList(activities, a3);
        a.setContactActivities(c, activities);
        Assert.assertEquals("Third Activity",
                a.getContactActivities(c).get(1).getName());
        Assert.assertEquals(3, a.getContactActivities(c).size());
    }
    
    @Test
    public void removedContact(){
        a.setContactActivities(c, activities);
        a.removeContact(c);
        Assert.assertEquals(null, a.getContactActivities(c));
    }
}
