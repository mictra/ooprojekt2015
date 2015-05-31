/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package edu.chl.calendarplusplus;

import edu.chl.calendarplusplus.alarmnotification.INotificationManager;
import edu.chl.calendarplusplus.alarmnotification.INotification;
import edu.chl.calendarplusplus.alarmnotification.IAlarm;
import edu.chl.calendarplusplus.contact.IContactManager;
import edu.chl.calendarplusplus.contact.IContact;
import edu.chl.calendarplusplus.contact.IContactGroup;
import edu.chl.calendarplusplus.activity.IActivityManager;
import edu.chl.calendarplusplus.activity.IActivity;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author erikforsberg
 */
public interface ICalendarPlus {
    
    public void addActivity(IActivity a);
    
    public void updateActivity(IActivity a, List<IContact> removedAttendees);
    
    public void addNotification(INotification not);
    
    public void updateNotification(INotification not, IActivity a);
    
    public void addContact(IContact contact, List<IContactGroup> contactGroups);
    
    public void updateContact(IContact contact, List<IContactGroup> addedGroups, List<IContactGroup> removedGroups);
    
    public void removeContact(IContact contact);
    
    public void addContactGroup(IContactGroup group);
    
    public void addAlarm(IAlarm a);
    
    public void updateAlarm(IAlarm a);
    
    public void removeActivity(IActivity a);
    
    public void removeContactGroup(IContactGroup g);
    
    public void removeAlarm(IAlarm a);
    
    public void setActivityList(ArrayList l);
    
    public void setContactGroupList(ArrayList l);
    
    public void setAlarmList(ArrayList l);
    
    public List<IActivity> getActivityList();
    
    public List<IActivity> getActivitiesByTimeInterval(Calendar start, Calendar end);
    
    public List<IContactGroup> getContactGroupList();
    
    List<IAlarm> getAlarmList();
    
    List<IContact> getAllContacts();
    
    IContactManager getContactManager();
    
    IActivityManager getActivityManager();
    
    INotificationManager getNotificationManager();
    
}
