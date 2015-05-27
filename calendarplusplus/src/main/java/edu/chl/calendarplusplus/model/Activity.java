/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package edu.chl.calendarplusplus.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author erikforsberg
 */
@Entity
public class Activity implements IActivity, Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    
    private Calendar startTime;
    private Calendar endTime;
    
    private String name;
    private String description;
    private String location;
    @OneToMany(targetEntity = Contact.class)
    private List<IContact> attendees;

    public Activity() {
    }
    
    //public Notification eventNot;
    
    public Activity(Calendar st, Calendar et, String name,
            String loc, String desc, List<IContact> att) {
        
        if(st.getTimeInMillis() < et.getTimeInMillis()){
            this.startTime = st;
            this.endTime = et;
        }else{
            System.out.println("Illegal times in activity!");
        }
        
        if(!name.equals("")){
            this.name = name;
        }else{
            System.out.println("name of activty invalid!");
        }
        
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
    
    public int getId(){
        return id;
    }
    
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
    
    public void addAttendee(IContact contact){
        this.attendees.add(contact);
    }
    
    public void removeAttendee(IContact contact){
        this.attendees.remove(contact);
    }
    
    public List<IContact> getAttendees(){
        return this.attendees;
    }
    
    //Using this method instead of contains method, because we wan't the values comparisson
    public boolean hasContact(IContact contact){
        for(IContact c : attendees){
            if(contact.getId() == c.getId() && contact.getName().equals(c.getName())){
                return true;
            }
        }
        return false;
    }
    
}
