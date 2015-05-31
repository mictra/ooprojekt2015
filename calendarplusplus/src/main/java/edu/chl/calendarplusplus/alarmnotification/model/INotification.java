/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.alarmnotification.model;

import edu.chl.calendarplusplus.activity.model.IActivity;
import java.util.Calendar;

/**
 *
 * @author erikforsberg
 */
public interface INotification {
    
    public void setAlarm(Calendar time);
    
    public void setId(int id);
    
    public int getId();
    
    public Calendar getAlarm();
    
    public void setAlarmName(String name);
    
    public String getAlarmName();
    
    public void setDescName(String desc);
    
    public String getDescName();
    
    public void setActivity(IActivity act);
    
    public IActivity getActivity();
    
}
