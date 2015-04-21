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


/* For now: The notification class includes all of the methods from the Alarm
   class, since Alarm is an abstract class. For now: This class does not have
   any unique method.
*/
public class Notification extends Alarm {
    
    //private final Activity activity;

    public Notification(Date d, String n) {
        super(d, n);
    }
    
    @Override
    public void setAlarm(Date time){
        this.alarmTime = time;
    }
    
    @Override
    public Date getAlarm(){
        return alarmTime;
    }
    
    @Override
    public void setAlarmName(String name){
        this.name = name;
    }
    
    @Override
    public String getAlarmName(){
        return name;
    }
    
    @Override
    public void setDescName(String desc){
        this.description = desc;
    }
    
    @Override
    public String getDescName(){
        return name;
    }
    
    
}
