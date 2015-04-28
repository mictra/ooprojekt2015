/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.change2projectname.model;

import java.util.List;

/**
 *
 * @author erikforsberg
 */
public interface IContactManager{

    List<ContactGroup> getContactGroups(Contact c);
    
    void setContactGroups(Contact c, List<ContactGroup> groupList);
    
    void addNewGroup(Contact c, ContactGroup cg);
    
    void removeGroup(Contact c, ContactGroup cg);
    
    void clearGroups(Contact c);
    
    void removeContact(Contact c);
    
}
