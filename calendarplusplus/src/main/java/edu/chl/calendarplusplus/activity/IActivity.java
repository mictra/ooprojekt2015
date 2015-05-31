/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.activity;

import edu.chl.calendarplusplus.contact.IContact;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author erikforsberg
 */
public interface IActivity extends Comparable<IActivity> {
    
    public void setId(int id);
    
    public int getId();
    
    public void setStartTime(Calendar st);
    
    public Calendar getStartTime();
    
    public void setEndTime(Calendar et);
    
    public Calendar getEndTime();
    
    public void setName(String n);
    
    public String getName();
    
    public void setDescription(String d);
    
    public String getDescription();
    
    public void setLocation(String l);
    
    public String getLocation();
        
    public void addAttendee(IContact contact);
    
    public void removeAttendee(IContact contact);
    
    public void removeAllAttendees();
    
    public List<IContact> getAttendees();
    
    public boolean hasContact(IContact contact);
    
    public boolean remove(IContact contact);
    
    @Override
    public int compareTo(IActivity act);
    
}
