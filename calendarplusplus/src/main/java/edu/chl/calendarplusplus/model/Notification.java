/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.chl.calendarplusplus.model;
import java.util.Calendar;


/**
 *
 * @author johan
 */


/* The notification class includes all of the methods from the Alarm
   class, since Alarm is an abstract class. But it also gives an activity.
*/
public class Notification extends Alarm {
    
    private Calendar alarmTime;
    private String name;
    private String description;
    private Activity activity;

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
        return description;
    }
    
    public Activity getActivity(){
        return activity;
    }
    
    public void setActivity(Activity act){
        this.activity = act;
    }
    
}
