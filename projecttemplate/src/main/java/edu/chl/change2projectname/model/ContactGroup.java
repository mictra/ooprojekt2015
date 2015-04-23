/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.chl.change2projectname.model;
import java.util.ArrayList;


/**
 *
 * @author johan
 */
public class ContactGroup {
    
    //Implementing the variables right over here.
    private String name;
    private ArrayList<Contact> members;
    
    public ContactGroup(String name){
        this.name = name;
        members = new ArrayList<>();
    }
    
    //Set- & get-methods for the name-variable...
    public void setGroupName(String name){
        this.name = name;
    }
    
    public String getGroupName(){
        return name;
    }
    
    /* Here we request the group as well as adding a contact to a group.
       We might want to change the add()-method so that it includes a parameter
       that takes an integer in order to sort the list depending on the First
       name for instance.
    */
    public void addContact(Contact member){
        members.add(member);
    }
    
    public ArrayList<Contact> getContacts(){
        return members;
    }
    
}
