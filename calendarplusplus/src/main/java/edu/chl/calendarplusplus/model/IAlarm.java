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
public interface IAlarm {
    
    int getId();
    
    void setAlarm(Calendar time);
    
    Calendar getAlarm();
    
    void setAlarmName(String name);
    
    String getAlarmName();
    
    void setDescName(String desc);
    
    String getDescName();
    
}
