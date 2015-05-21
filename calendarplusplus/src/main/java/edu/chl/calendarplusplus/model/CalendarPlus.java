/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package edu.chl.calendarplusplus.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author erikforsberg
 *
 * Class to represent a calendar object.
 *
 */
public class CalendarPlus implements ICalendarPlus{
    
    private ArrayList<IActivity> activities;
    private ArrayList<IContactGroup> groups;
    private ArrayList<IAlarm> alarms;
    private IContactManager contactManager;
    private IActivityManager activityManager;
    
    public CalendarPlus(){
        activities = new ArrayList<>();
        groups = new ArrayList<>();
        alarms = new ArrayList<>();
        IContactGroup defaultGroup = new ContactGroup("Default");
        groups.add(defaultGroup);
        contactManager = new ContactManager();
        activityManager = new ActivityManager();
    }
    
    public void addActivity(IActivity a){
        activities.add(a);
    }
    
    public void addContactGroup(IContactGroup group){
        groups.add(group);
    }
    
    public void addAlarm(IAlarm a){
        alarms.add(a);
    }
    
    public void removeActivity(IActivity a){
        activities.remove(a);
    }
    
    public void removeContactGroup(IContactGroup g){
        groups.remove(g);
    }
    
    public void removeAlarm(IAlarm a){
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
    
    public List<IActivity> getActivityList(){
        return activities;
    }
    
    public List<IContactGroup> getContactGroupList(){
        return groups;
    }
    
    public IContactGroup getContactGroupByName(String name){
        for(IContactGroup cg : groups){
            if(cg.getGroupName().equals(name)){
                return cg;
            }
        }
        return groups.get(0);
    }
    
    public List<IAlarm> getAlarmList(){
        return alarms;
    }
    
    public List<IContact> getAllContacts(){
        return contactManager.getAllContacts();
        /*
        ArrayList<IContact> contacts = new ArrayList<>();
        for(IContactGroup cg : groups){
            for(IContact c : cg.getContacts()){
                if (!contacts.contains(c))
                    contacts.add(c);
            }
        }
        return contacts;
        */
    }
    
    public IContactManager getContactManager(){
        return contactManager;
    }
    
    public IActivityManager getActivityManager(){
        return activityManager;
    }
    
    public List<IActivity> getActivitiesByHour(Calendar start, Calendar end){
        List<IActivity> tempActList = new ArrayList<>();
        for(IActivity act : activities)
            if((act.getStartTime().getTimeInMillis() < start.getTimeInMillis() &&
                    act.getEndTime().getTimeInMillis() > start.getTimeInMillis()) ||
                    
                    (act.getStartTime().getTimeInMillis() >= start.getTimeInMillis() &&
                    act.getEndTime().getTimeInMillis() <= end.getTimeInMillis()) ||
                    
                    (act.getStartTime().getTimeInMillis() < end.getTimeInMillis() &&
                    act.getEndTime().getTimeInMillis() >= end.getTimeInMillis())){
                tempActList.add(act);
            }
        
        
        return tempActList;
    }
    
}
