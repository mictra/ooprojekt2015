/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.model;

import java.util.Calendar;

/**
 *
 * @author erikforsberg
 */
public interface INotification {
    
    public void setAlarm(Calendar time);
    
    public Calendar getAlarm();
    
    public void setAlarmName(String name);
    
    public String getAlarmName();
    
    public void setDescName(String desc);
    
    public String getDescName();
    
    public void setActivity(IActivity act);
    
    public IActivity getActivity();
    
}
