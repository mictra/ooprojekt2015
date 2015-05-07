/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.model;

import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Michael
 */
public class ActivityManager implements IActivityManager {
    
    HashMap<Contact, List<Activity>> activityManager;
    
    public ActivityManager(){
        activityManager = new HashMap<>();
    }
    
    public void addActivityToList(List<Activity> activities, Activity a){
        // Begin by checking if that one activity already is implemented.
        for (Activity n : activities){
            if (n.equals(a)){
                return;
            }
        }
        // Here we check if the time for activity already has passed.
        if (a.getEndTime().before(Calendar.getInstance())
                || a.getEndTime().equals(Calendar.getInstance())){
            return;
        }
        // And lastly, we will add them depending on when they appear.
        // The closer to the current time, the sooner they will be added.
        for (int i = 0; i < activities.size(); i++){
            if (a.getStartTime().before(activities.get(i).getStartTime())){
                activities.add(i,a);
                return;
            }
        }
        activities.add(a);
    }
    
    public void setContactActivities(Contact c, List<Activity> activities){
        for (Activity a : activities) {
            a.addAttendee(c);
        }
        activityManager.put(c, activities);
    }
    
    public List<Activity> getContactActivities(Contact c){
        return activityManager.get(c);
    }
    
    public void removeContact(Contact c){
        activityManager.remove(c);
    }
    
}
