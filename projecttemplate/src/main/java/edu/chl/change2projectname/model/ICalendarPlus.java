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
 */
public interface ICalendarPlus {
    
    public void addActivity(Activity a);
    
    public void addContactGroup(ContactGroup group);
    
    public void addAlarm(Alarm a);
    
    public void removeActivity(Activity a);
    
    public void removeContactGroup(ContactGroup g);
    
    public void removeAlarm(Alarm a);
    
    public void setActivityList(ArrayList l);
    
    public void setContactGroupList(ArrayList l);
    
    public void setAlarmList(ArrayList l);
    
    public List<Activity> getActivityList();
    
    public List<ContactGroup> getContactGroupList();
    
    public List<Alarm> getAlarmList();
    
    public List<Contact> getAllContacts();
    
}
