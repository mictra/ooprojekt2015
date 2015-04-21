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
public class Activity {
    
    public Calendar startTime;
    public Calendar endTime;
    
    public String name;
    public String description;
    public String location;
    
    public ArrayList<Contact> atendees;
    
    //public Notification eventNot;
    
    public Activity(Calendar st, Calendar et, String name) {
        this.startTime = st;
        this.endTime = et;
        this.name = name;
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
        
    public void addAtendee(Contact contact){
         this.atendees.add(contact);
    }
    
    public void removeAtendee(Contact contact){
        this.atendees.remove(contact);
    }
}
