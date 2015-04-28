/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.model;

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
    
    public void setContactActivities(Contact c, List<Activity> activities){
        activityManager.put(c, activities);
    }
    
    public List<Activity> getContactActivities(Contact c){
        return activityManager.get(c);
    }
    
    public void removeContact(Contact c){
        activityManager.remove(c);
    }
    
}
