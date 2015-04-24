/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.change2projectname.model;

import java.util.ArrayList;

/**
 *
 * @author erikforsberg
 */
public interface IContactGroup {
    
    public void setGroupName(String name);
    
    public String getGroupName();
        
    public void addContact(Contact member);
    
    public ArrayList<Contact> getContacts();
    
}
