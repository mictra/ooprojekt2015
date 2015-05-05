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
    
    @Test
    public void checkActivities(){
        Calendar time = Calendar.getInstance();
        Contact c = new Contact("Olof", "", "");
        Activity a1 = new Activity(time, time, "First Activity", "", "", null);
        Activity a2 = new Activity(time, time, "Second Activity","", "", null);
        ArrayList<Activity> activities = new ArrayList<>();
        ActivityManager a = new ActivityManager();
        
        activities.add(a1); activities.add(a2);
        a.setContactActivities(c, activities);
        Assert.assertEquals(2, a.getContactActivities(c).size());
    }
    
    // Here we try to see if we can add the exact same activity twice.
    // This should not be able to happen. So we just ignore duplicates.
    @Test
    public void addActivityTwice(){
        Calendar time = Calendar.getInstance();
        Contact c = new Contact("Filip", "", "");
        Activity a1 = new Activity(time, time, "An Activity", "", "", null);
        ArrayList<Activity> activities = new ArrayList<>();
        ActivityManager a = new ActivityManager();
        
        activities.add(a1); activities.add(a1); //ARRAYLIST CONTROLS THIS!
        a.setContactActivities(c, activities);
        Assert.assertEquals(1, a.getContactActivities(c).size());
    }
    
    // The Activity-list should be sorted based on the which time is closest
    // to the current time, as long as the activity has not passed.
    // "activity" should be equal to {Third Activity, First Activity}
    @Test
    public void sortedActivityList(){
        Contact c = new Contact("Cathryn", "", "");
        ArrayList<Activity> activities = new ArrayList<>();
        Calendar time_1 = Calendar.getInstance();
        time_1.set(Calendar.MINUTE, -20);
        Calendar time_2 = Calendar.getInstance();
        time_2.set(Calendar.MINUTE, 40);
        Calendar time_3 = Calendar.getInstance();
        time_3.set(Calendar.HOUR_OF_DAY, 1);
        Activity a1 = new Activity(time_2, time_3, "First Activity", "", "", null);
        Activity a2 = new Activity(time_1, time_1, "Second Activity", "", "", null);
        Activity a3 = new Activity(time_1, time_3, "Third Activity", "", "", null);
        ActivityManager a = new ActivityManager();
        
        activities.add(a1); activities.add(a2); activities.add(a3);
        a.setContactActivities(c, activities);
        Assert.assertEquals("First Activity",
                a.getContactActivities(c).get(1).getName());
        Assert.assertEquals(2, a.getContactActivities(c).size());
    }
    
    @Test
    public void removedContact(){
        Contact c = new Contact("Karl", "", "");
        ArrayList<Activity> activities = new ArrayList<>();
        ActivityManager a = new ActivityManager();
        a.setContactActivities(c, activities);
        a.removeContact(c);
        Assert.assertEquals(null, a.getContactActivities(c));
        
    }
}
