/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.change2projectname.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author erikforsberg
 * 
 * Class to represent a calendar object.
 * 
 */
public class CalendarPlus {
    
    private ArrayList<Activity> activities;
    private ArrayList<ContactGroup> groups;
    private ArrayList<Alarm> alarms;
    
    public CalendarPlus(){
        activities = new ArrayList<>();
        groups = new ArrayList<>();
        alarms = new ArrayList<>();
        ContactGroup defaultGroup = new ContactGroup("Default");
        groups.add(defaultGroup);
    }
    
    public void addActivity(Activity a){
        activities.add(a);
    }
    
    public void addContactGroup(ContactGroup group){
        groups.add(group);
    }
    
    public void addAlarm(Alarm a){
        alarms.add(a);
    }
    
    public void removeActivity(Activity a){
        activities.remove(a);
    }
    
    public void removeContactGroup(ContactGroup g){
        groups.remove(g);
    }
    
    public void removeAlarm(Alarm a){
        alarms.remove(a);
    }
    
    public void setActivityList(ArrayList l){
        activities = l;
    }
    
    public void setContactGroupList(ArrayList l){
        groups = l;
    }
    
    public void setAlarmList(ArrayList l){
        alarms = l;
    }
    
    public List<Activity> getActivityList(){
        return activities;
    }
    
    public List<ContactGroup> getContactGroupList(){
        return groups;
    }
    
    public List<Alarm> getAlarmList(){
        return alarms;
    }
    
}
