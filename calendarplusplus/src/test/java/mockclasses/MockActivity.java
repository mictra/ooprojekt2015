/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mockclasses;

import edu.chl.calendarplusplus.model.Contact;
import edu.chl.calendarplusplus.model.IActivity;
import edu.chl.calendarplusplus.model.IContact;
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
        endTime.set(2015, 4, 31, 14, 0);
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
    public void addAttendee(IContact contact) {
    }

    @Override
    public void removeAttendee(IContact contact) {
    }

    @Override
    public ArrayList<IContact> getAttendees() {
        return new ArrayList<IContact>();
    }

    @Override
    public boolean hasContact(IContact contact) {
        return false; //Temporary
    }

    @Override
    public void removeAllAttendees() {
        
    }

    @Override
    public void setId(int id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public boolean remove(IContact contact) {
        return true;
    }

    @Override
    public int compareTo(IActivity act) {
<<<<<<< HEAD
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
=======
        return 0;
>>>>>>> origin/master
    }
}
