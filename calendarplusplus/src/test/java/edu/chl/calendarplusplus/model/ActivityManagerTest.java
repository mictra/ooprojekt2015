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
        Contact c = new Contact("Olof");
        Activity a1 = new Activity(time, time, "First Activity");
        Activity a2 = new Activity(time, time, "Second Activity");
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
        Contact c = new Contact("Filip");
        Activity a1 = new Activity(time, time, "An Activity");
        ArrayList<Activity> activities = new ArrayList<>();
        ActivityManager a = new ActivityManager();
        
        activities.add(a1); activities.add(a1);
        a.setContactActivities(c, activities);
        Assert.assertEquals(1, a.getContactActivities(c).size());
    }
    
    @Test
    public void removedContact(){
        Contact c = new Contact("Karl");
        ArrayList<Activity> activities = new ArrayList<>();
        ActivityManager a = new ActivityManager();
        a.setContactActivities(c, activities);
        a.removeContact(c);
        Assert.assertEquals(null, a.getContactActivities(c));
        
    }
}
