/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mockclasses;

import edu.chl.calendarplusplus.model.Contact;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author erikforsberg
 */
public class MockActivity {
    
    private Calendar startTime;
    private Calendar endTime;
    
    private String name;
    private String description;
    private String location;
    
    private ArrayList<Contact> attendees;
    
    //public Notification eventNot;
    
    public MockActivity(Calendar st, Calendar et, String name,
            String desc, String loc, ArrayList<Contact> att) {
        
        if(st.getTimeInMillis() < et.getTimeInMillis()){
            this.startTime = st;
            this.endTime = et;
        }else{
            // TODO: How to handle illegal start and end times?
        }
        
        this.name = name;
        this.description = desc;
        this.location = loc;
        
        if(att == null){
            this.attendees = new ArrayList<>();
        }else{
            this.attendees = att;
        }
        
    }
}
