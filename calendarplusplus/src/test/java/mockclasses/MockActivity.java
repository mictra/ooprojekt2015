/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mockclasses;

import edu.chl.calendarplusplus.model.Contact;
import edu.chl.calendarplusplus.model.IActivity;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author erikforsberg
 */
public class MockActivity implements IActivity {
    
    private Calendar startTime;
    private Calendar endTime;
        
    public MockActivity() {
    }

    @Override
    public void setStartTime(Calendar st) {
    }
    

    @Override
    public Calendar getStartTime() {
        startTime = Calendar.getInstance();
        startTime.set(2015, 4, 31, 13, 0);
        return this.startTime;
    }

    @Override
    public void setEndTime(Calendar et) {
    }

    @Override
    public Calendar getEndTime() {
        endTime = Calendar.getInstance();
        endTime.set(2015, 4, 31, 13, 0);
        return this.endTime;
    }

    @Override
    public void setName(String n) {
    }

    @Override
    public String getName() {
        return "act";
    }

    @Override
    public void setDescription(String d) {
    }

    @Override
    public String getDescription() {
        return "desc";
    }

    @Override
    public void setLocation(String l) {
    }

    @Override
    public String getLocation() {
        return "loc";
    }

    @Override
    public void addAttendee(Contact contact) {
    }

    @Override
    public void removeAttendee(Contact contact) {
    }

    @Override
    public ArrayList<Contact> getAttendees() {
        return new ArrayList<Contact>();
    }
}
