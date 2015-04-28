/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package edu.chl.calendarplusplus.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author erikforsberg
 *
 * Manager for contact groups. HashMap with a specific contact as key and a list
 * with its groups as value.
 *
 */
public class ContactManager implements IContactManager{
    
    
    
   private Map<Contact, List<ContactGroup>> groups;
    
    public ContactManager(){
        groups = new HashMap<Contact, List<ContactGroup>>();
    }
    
    public List<ContactGroup> getContactGroups(Contact c){
        return groups.get(c);
    }
    
    public void setContactGroups(Contact c, List<ContactGroup> groupList){
        groups.put(c, groupList);
        
    }
    
    public void addNewGroup(Contact c, ContactGroup cg){
        List<ContactGroup> temp = groups.get(c);
        temp.add(cg);
        groups.put(c, temp);
    }
    
    public void removeGroup(Contact c, ContactGroup cg){
        List<ContactGroup> temp = groups.get(c);
        temp.remove(cg);
        groups.put(c, temp);
    }
    
    public void clearGroups(Contact c){
        List<ContactGroup> temp = groups.get(c);
        temp.clear();
        groups.put(c, temp);
    }
    
    public void removeContact(Contact c){
        groups.remove(c);
    }
    
}
