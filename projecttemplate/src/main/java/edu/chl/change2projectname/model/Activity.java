/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.change2projectname.model;

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
    
    public Activity(Calendar st, Calendar et, String name) {
        this.startTime = st;
        this.endTime = et;
        this.name = name;
        this.attendees = new ArrayList<>();
    }
    
    // Setters and getters
    
    public void setStartTIime(Calendar st){
        this.startTime = st;
    }
    
    public Calendar getStartTime(){
        return this.startTime;
    }
    
    public void setEndTime(Calendar et){
        this.endTime = et;   
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
    
}
