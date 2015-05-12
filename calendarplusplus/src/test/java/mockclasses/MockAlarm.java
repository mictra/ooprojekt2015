/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mockclasses;

import java.util.Calendar;

/**
 *
 * @author erikforsberg
 */
public class MockAlarm {
    
    private Calendar alarmTime;
    private String name;
    private String description;
    
    public MockAlarm(Calendar d, String n){
        if (n.isEmpty()) { return; }
        if (d.after(Calendar.getInstance()) || d.equals(Calendar.getInstance())){
            this.alarmTime = d;
            this.name = n;
        }
    }
    
}
