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
    private ContactGroupDAO cgDAO;
    private ContactDAO cDAO;
    private ActivityDAO aDAO;
    private AlarmDAO alarmDAO;

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
        contactManager.setContactGroups(contact, contactGroups);
    }

    public void addContactGroup(IContactGroup group) {
        cgDAO.create(group);
        groups = cgDAO.findAll();
    }

    public void addAlarm(IAlarm a) {
        System.out.println("ADD ALARM IS CALLED");
        alarmDAO.create(a);
        alarms = alarmDAO.findAll();
        //alarms.add(a);
    }
    
    public void updateAlarm(IAlarm a) {
        System.out.println("UPDATE ALARM IS CALLED");
        System.out.println("ALARM ID OF UPDATED ALARM: " + a.getId());
        alarmDAO.update(a);
        //update the list
        alarms = alarmDAO.findAll();
    }

    public void removeActivity(IActivity a) {
        activities.remove(a);
    }

    public void removeContactGroup(IContactGroup g) {
        groups.remove(g);
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
