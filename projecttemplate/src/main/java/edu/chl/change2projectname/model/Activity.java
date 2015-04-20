/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.change2projectname.model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author erikforsberg
 */
public class Activity {
    
    public Date startTime;
    public Date endTime;
    
    public String name;
    public String description;
    public String location;
    
    public ArrayList<Contact> atendees;
    
    //public Notification eventNot;
    
    
    // Setters and getters
    
    public void setStartTIime(Date st){
        this.startTime = st;
    }
    
    public Date getStartTime(){
        return this.startTime;
    }
    
    public void setEndTime(Date et){
        this.endTime = et;   
    }
    
    public Date getEndTime(){
        return this.endTime;
    }

 //////////////////////////////////////////////////////////////   
    
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
}
