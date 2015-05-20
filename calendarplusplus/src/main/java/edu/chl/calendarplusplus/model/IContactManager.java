/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.model;

import java.util.List;

/**
 *
 * @author erikforsberg
 */
public interface IContactManager{

    List<ContactGroup> getContactGroups(IContact c);
    
    void setContactGroups(IContact c, List<ContactGroup> groupList);
    
    void addNewGroup(IContact c, ContactGroup cg);
    
    void removeGroup(IContact c, ContactGroup cg);
    
    void clearGroups(IContact c);
    
    List<IContact> getAllContacts();
        
    void removeContact(IContact c);
    
}
