/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mockclasses;

import edu.chl.calendarplusplus.model.IContact;
import edu.chl.calendarplusplus.model.IContactGroup;
import java.util.ArrayList;

/**
 *
 * @author erikforsberg
 */
public class MockContactGroup implements IContactGroup {
    
    private String name;
    private final ArrayList<IContact> members;
    
    public MockContactGroup(){
        this.name = "test";
        members = new ArrayList<>();
    }
    
    public void setGroupName(String name){
    }
    
    public String getGroupName(){
        return "groupname";
    }
    
    public void addContact(IContact member){
        members.add(member);
    }
    
    public ArrayList<IContact> getContacts(){
        return members;
    }
    
    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean hasContact(IContact contact) {
        return false; //Temporary
    }

    @Override
    public void removeAllContacts() {
        members.clear();
    }

    @Override
    public void setId(int id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getId() {
        return 0;
    }
    
}
    

