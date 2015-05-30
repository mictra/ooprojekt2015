/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.model;

import edu.chl.calendarplusplus.persistence.ActivityDAO;
import edu.chl.calendarplusplus.persistence.AlarmDAO;
import edu.chl.calendarplusplus.persistence.ContactDAO;
import edu.chl.calendarplusplus.persistence.ContactGroupDAO;
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
public class CalendarPlus implements ICalendarPlus {

    private List<IActivity> activities;
    private List<IContactGroup> groups;
    private List<IAlarm> alarms;
    private IContactManager contactManager;
    private IActivityManager activityManager;
    private INotificationManager notificationManager;
    private ContactGroupDAO cgDAO;
    private ContactDAO cDAO;
    private ActivityDAO aDAO;
    private AlarmDAO alarmDAO;
    private IContactGroup defaultGroup;

    public CalendarPlus() {
        cgDAO = new ContactGroupDAO();
        cDAO = new ContactDAO();
        aDAO = new ActivityDAO();
        alarmDAO = new AlarmDAO();
        activities = aDAO.findAll();
        if(activities.isEmpty()){
            activities = new ArrayList<>();
        }
        groups = cgDAO.findAll();
        if (groups.isEmpty()) {
            cgDAO.create(new ContactGroup("Default"));
            groups = cgDAO.findAll();
        }
        alarms = alarmDAO.findAll();
        if(alarms.isEmpty()){
            alarms = new ArrayList<>();
        }
        contactManager = new ContactManager();
        activityManager = new ActivityManager();
        notificationManager = new NotificationManager();
        /*
        * Go through all contacts and see which groups and activities they're in. 
        * Add them as a key-value pair into the ContactManager and ActivityManager.
        * All data retrieved from the database.
        */
        for(IContact c : cDAO.findAll()){
            List<IContactGroup> contactGroups = new ArrayList<>();
            List<IActivity> attendActivities = new ArrayList<>();
            System.out.println("Contact: " + c.getName() + " has groups:");
            for(IContactGroup cg : groups){
                if(cg.hasContact(c)){
                    contactGroups.add(cg);
                    System.out.println(cg.getGroupName());
                }
            }
            System.out.println("Contact: " + c.getName() + " is in activities:");
            for(IActivity a : activities){
                if(a.hasContact(c)){
                    attendActivities.add(a);
                    System.out.println(a.getName());
                }
            }
            
            contactManager.setContactGroups(c, contactGroups);
            activityManager.setContactActivities(c, attendActivities);
        }
        defaultGroup = getContactGroupByName("Default");
    }

    public void addActivity(IActivity a, List<IContact> attendees) {
        aDAO.create(a);
        activities.add(a);
        for(IContact c : attendees){
            activityManager.addNewGroup(c, a);
        }
    }

    public void addContact(IContact contact, List<IContactGroup> contactGroups) {
        cDAO.create(contact);
        for (IContactGroup cg : contactGroups) {
            cg.addContact(contact);
            cgDAO.update(cg);
        }
        groups = cgDAO.findAll();
        contactManager.setContactGroups(contact, contactGroups);
    }

    public void addContactGroup(IContactGroup group) {
        //Remove the contact members in the group from the Default group.
        for(IContact c : group.getContacts()){
            boolean isRemoved = defaultGroup.remove(c);
            if(isRemoved){
                contactManager.removeGroup(c, defaultGroup);
            }
            contactManager.addNewGroup(c, group);
        }
        cgDAO.update(defaultGroup);
        cgDAO.create(group);
        groups = cgDAO.findAll();
    }
    
    public void updateContactGroup(IContactGroup group){
        cgDAO.update(group);
        groups = cgDAO.findAll();
    }
    
    public void removeContactGroup(IContactGroup cg){
        for(IContact c : cg.getContacts()){
            contactManager.removeGroup(c, cg);
            //TODO: FIX! IT IS NULL ONLY IF U ADD GROUPS DIRECTLY WHEN CREATING A CONTACT!
            if(contactManager.getContactGroups(c).isEmpty()){
                defaultGroup.addContact(c);
                contactManager.addNewGroup(c, defaultGroup);
            }
        }
        cgDAO.update(defaultGroup);
        cgDAO.delete(cg.getId());
        groups = cgDAO.findAll();
    }

    public void addAlarm(IAlarm a) {
        alarmDAO.create(a);
        alarms = alarmDAO.findAll();
        //alarms.add(a);
    }
    
    public void updateAlarm(IAlarm a) {
        alarmDAO.update(a);
        //update the list
        alarms = alarmDAO.findAll();
    }

    public void removeActivity(IActivity a) {
        activities.remove(a);
    }

    public void removeAlarm(IAlarm a) {
        alarmDAO.delete(a.getId());
        alarms = alarmDAO.findAll();
    }

    public void setActivityList(ArrayList l) {
        activities = l;
    }

    public void setContactGroupList(ArrayList l) {
        groups = l;
    }

    public void setAlarmList(ArrayList l) {
        alarms = l;
    }

    public List<IActivity> getActivityList() {
        return activities;
    }

    public List<IContactGroup> getContactGroupList() {
        return groups;
    }

    //TODO: Check that there are no duplicate group names...
    public IContactGroup getContactGroupByName(String name) {
        for (IContactGroup cg : groups) {
            if (cg.getGroupName().equals(name)) {
                return cg;
            }
        }
        return groups.get(0);
    }

    public List<IAlarm> getAlarmList() {
        return alarms;
    }

    public List<IContact> getAllContacts() {
        //return contactManager.getAllContacts();
        return cDAO.findAll();
    }

    public IContactManager getContactManager() {
        return contactManager;
    }

    public IActivityManager getActivityManager() {
        return activityManager;
    }
    
    public INotificationManager getNotificationManager(){
        return notificationManager;
    }

    public List<IActivity> getActivitiesByHour(Calendar start, Calendar end) {
        List<IActivity> tempActList = new ArrayList<>();
        for (IActivity act : activities) {
            if ((act.getStartTime().getTimeInMillis() >= start.getTimeInMillis()
                    && act.getStartTime().getTimeInMillis() < end.getTimeInMillis())                    
                    || (act.getEndTime().getTimeInMillis() > start.getTimeInMillis()
                    && act.getEndTime().getTimeInMillis() < end.getTimeInMillis())
                    || (act.getStartTime().getTimeInMillis() < start.getTimeInMillis()
                    && act.getEndTime().getTimeInMillis() > end.getTimeInMillis())) {
                tempActList.add(act);
            }
        }

        return tempActList;
    }

}
