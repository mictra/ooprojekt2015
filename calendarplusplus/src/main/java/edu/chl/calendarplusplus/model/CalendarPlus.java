/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author erikforsberg
 * 
 * Class to represent a calendar object.
 * 
 */
public class CalendarPlus implements ICalendarPlus{
    
    private ArrayList<Activity> activities;
    private ArrayList<ContactGroup> groups;
    private ArrayList<Alarm> alarms;
    private ContactManager contactManager;
    private ActivityManager activityManager;
    
    public CalendarPlus(){
        activities = new ArrayList<>();
        groups = new ArrayList<>();
        alarms = new ArrayList<>();
        ContactGroup defaultGroup = new ContactGroup("Default");
        groups.add(defaultGroup);
        contactManager = new ContactManager();
        activityManager = new ActivityManager();
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
    
    public ContactGroup getContactGroupByName(String name){
        for(ContactGroup cg : groups){
            if(cg.getGroupName().equals(name)){
                return cg;
            }
        }
        return groups.get(0);
    }
    
    public List<Alarm> getAlarmList(){
        return alarms;
    }
    
    public List<Contact> getAllContacts(){
        /*
        ArrayList<Contact> contacts = new ArrayList<>();
        for(ContactGroup cg : groups){
            for(Contact c : cg.getContacts()){
                contacts.add(c);
            }
        }
        return contacts;
                */
        return contactManager.getAllContacts();
    }
    
    public ContactManager getContactManager(){
        return contactManager;
    }
    
    public ActivityManager getActivityManager(){
        return activityManager;
    }
    
}
