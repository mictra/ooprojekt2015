/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package edu.chl.calendarplusplus.model;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author erikforsberg
 */
public class Activity implements IActivity {
    
    private Calendar startTime;
    private Calendar endTime;
    
    private String name;
    private String description;
    private String location;
    
    private ArrayList<Contact> attendees;
    
    //public Notification eventNot;
    
    public Activity(Calendar st, Calendar et, String name,
            String desc, String loc, ArrayList<Contact> att) {
        
        if(st.getTimeInMillis() < et.getTimeInMillis()){
            this.startTime = st;
            this.endTime = et;
        }else{
            // TODO: How to handle illegal start and end times?
        }
        
        this.name = name;
        this.description = desc;
        this.location = loc;
        
        if(att == null){
            this.attendees = new ArrayList<>();
        }else{
            this.attendees = att;
        }
        
    }
    
    Activity(String act1, String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    // Setters and getters
    
    public void setStartTime(Calendar st){
        if(st.getTimeInMillis() < this.getEndTime().getTimeInMillis()){
            this.startTime = st;
        }
    }
    
    public Calendar getStartTime(){
        return this.startTime;
    }
    
    public void setEndTime(Calendar et){
        if(this.getStartTime().getTimeInMillis() < et.getTimeInMillis()){
            this.endTime = et;
        }
    }
    
    public Calendar getEndTime(){
        return this.endTime;
    }
    
    public void setName(String n){
        this.name = n;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setDescription(String d){
        this.description = d;
    }
    
    public String getDescription(){
        return this.description;
    }
    
    public void setLocation(String l){
        this.location = l;
    }
    
    public String getLocation(){
        return this.location;
    }
    
    public void addAttendee(Contact contact){
        this.attendees.add(contact);
    }
    
    public void removeAttendee(Contact contact){
        this.attendees.remove(contact);
    }
    
    public ArrayList<Contact> getAttendees(){
        return this.attendees;
    }
    
}
