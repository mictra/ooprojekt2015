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

    List<IContactGroup> getContactGroups(IContact c);
    
    void setContactGroups(IContact c, List<IContactGroup> groupList);
    
    void addNewGroup(IContact c, IContactGroup cg);
    
    void removeGroup(IContact c, IContactGroup cg);
    
    void clearGroups(IContact c);
    
    void removeContact(IContact c);
    
}
