/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mockclasses;

import edu.chl.calendarplusplus.model.IAlarm;
import java.util.Calendar;

/**
 *
 * @author erikforsberg
 */
public class MockAlarm implements IAlarm {
    
    private int id;
    private Calendar alarmTime;
    private String name;
    private String description;
    
    public MockAlarm(){
    }

    @Override
    public int getId() {
        return id;
    }
    
    @Override
    public void setAlarm(Calendar time) {
    }

    @Override
    public Calendar getAlarm() {
        return Calendar.getInstance();
    }

    @Override
    public void setAlarmName(String name) {
    }

    @Override
    public String getAlarmName() {
        return null ;
    }

    @Override
    public void setDescName(String desc) {
    }

    @Override
    public String getDescName() {
        return this.description;
    }
    
}
