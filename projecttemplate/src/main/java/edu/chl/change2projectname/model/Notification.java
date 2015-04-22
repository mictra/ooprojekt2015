/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.chl.change2projectname.model;
import java.util.Calendar;


/**
 *
 * @author johan
 */


/* For now: The notification class includes all of the methods from the Alarm
   class, since Alarm is an abstract class. For now: This class does not have
   any unique method.
*/
public class Notification extends Alarm {
    
    private Calendar alarmTime;
    private String name;
    private String description;
    private final Activity activity;

    public Notification(Calendar d, String n, Activity a) {
        super(d, n);
        activity = a;
    }
    
    @Override
    public void setAlarm(Calendar time){
        this.alarmTime = time;
    }
    
    @Override
    public Calendar getAlarm(){
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
