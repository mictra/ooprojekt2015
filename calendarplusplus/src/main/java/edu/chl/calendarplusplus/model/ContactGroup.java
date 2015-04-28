/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.chl.calendarplusplus.model;
import java.util.ArrayList;


/**
 *
 * @author johan
 */
public class ContactGroup implements IContactGroup {
    
    private String name;
    private final ArrayList<Contact> members;
    
    public ContactGroup(String name){
        this.name = name;
        members = new ArrayList<>();
    }
    
    public void setGroupName(String name){
        this.name = name;
    }
    
    public String getGroupName(){
        return name;
    }
    
    public void addContact(Contact member){
        members.add(member);
    }
    
    public ArrayList<Contact> getContacts(){
        return members;
    }
    
}
