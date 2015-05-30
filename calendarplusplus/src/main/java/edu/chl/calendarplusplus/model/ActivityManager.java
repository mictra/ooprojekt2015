/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Michael
 */
public class ActivityManager implements IActivityManager {
    
    HashMap<IContact, List<IActivity>> activityManager;
    
    public ActivityManager(){
        activityManager = new HashMap<>();
    }
    
    public void addActivityToList(List<IActivity> activities, IActivity a){
        // Begin by checking if that one activity already is implemented.
        for (IActivity n : activities){
            if (n.equals(a)){
                return;
            }
        }
        // Here we check if the time for activity already has passed.
//        if (a.getEndTime().before(Calendar.getInstance())
//                || a.getEndTime().equals(Calendar.getInstance())){
//            return;
//        }
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
    
    public void setContactActivities(IContact c, List<IActivity> activities){
        /*for (IActivity a : activities) {  We get NullPointerException by
            a.addAttendee(c);               setting null in our Activity-
        }                                   variables. */
        activityManager.put(c, activities);
    }
    
    public List<IActivity> getContactActivities(IContact c){
        return activityManager.get(c);
    }
    
    public void addNewGroup(IContact c, IActivity a){
        List<IActivity> temp = activityManager.get(c);
        if(temp == null){
            temp = new ArrayList<>();
        }
        temp.add(a);
        activityManager.put(c, temp);
    }
    
    public void removeActivityFromContact(IContact c, IActivity a){
        List<IActivity> temp = activityManager.get(c);
        if (temp != null) {
            temp.remove(c);
            activityManager.put(c, temp);
        }
    }
    
    public void removeContact(IContact c){
        activityManager.remove(c);
    }
    
}
