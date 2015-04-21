/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.chl.change2projectname.model;
import java.util.Date;

/**
 *
 * @author johan
 */

/* The alarm will be set by the user later on. So that will be the case to
   use the setAlarm()-method. When it comes to the String-variables, we would
   like to have a set- and a get-method for each one of them. So that we can
   both modify them and receive its data, since that is the purpose after all.
*/
public abstract class Alarm {
    
    Date alarmTime = new Date();
    String name, description;
    
    public Alarm(Date d, String n){
        this.alarmTime = d;
        this.name = n;
    }
    
    public void setAlarm(Date time){
        this.alarmTime = time;
    }
    
    public Date getAlarm(){
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
        return name;
    }
}
