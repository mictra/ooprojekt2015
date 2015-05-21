/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.chl.calendarplusplus.model;
import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author johan
 */

/* The alarm will be set by the user later on. So that will be the case to
   use the setAlarm()-method. When it comes to the String-variables, we would
   like to have a set- and a get-method for each one of them. So that we can
   both modify them and receive its data, since that is the purpose after all.
*/
@Entity
public class Alarm implements IAlarm, Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    
    private Calendar alarmTime;
    private String name;
    private String description;

    public Alarm() {
    }
    
    public Alarm(Calendar d, String n){
        if (n.isEmpty()) { return; }
        if (d.after(Calendar.getInstance()) || d.equals(Calendar.getInstance())){
            this.alarmTime = d;
            this.name = n;
        }
    }
    
    public int getId(){
        return id;
    }
    
    public void setAlarm(Calendar time){
        this.alarmTime = time;
    }
    
    public Calendar getAlarm(){
        return alarmTime;
    }
    
    public void setAlarmName(String name){
        this.name = name;
    }
    
    public String getAlarmName(){
        return name;
    }
    
    public void setDescName(String desc){
        this.description = desc;
    }
    
    public String getDescName(){
        return description;
    }
}
