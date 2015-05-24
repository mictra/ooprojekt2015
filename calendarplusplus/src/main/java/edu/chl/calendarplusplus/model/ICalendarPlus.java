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
 */
public interface ICalendarPlus {
    
    public void addActivity(IActivity a, List<IContact> attendees);
    
    public void addContact(IContact contact, List<IContactGroup> contactGroups);
    
    public void addContactGroup(IContactGroup group);
    
    public void addAlarm(IAlarm a);
    
    public void removeActivity(IActivity a);
    
    public void removeContactGroup(IContactGroup g);
    
    public void removeAlarm(IAlarm a);
    
    public void setActivityList(ArrayList l);
    
    public void setContactGroupList(ArrayList l);
    
    public void setAlarmList(ArrayList l);
    
    public List<IActivity> getActivityList();
    
    public List<IContactGroup> getContactGroupList();
    
    List<IAlarm> getAlarmList();
    
    List<IContact> getAllContacts();
    
    IContactManager getContactManager();
    
    IActivityManager getActivityManager();
    
    
    
}
