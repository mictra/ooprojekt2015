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
public interface IContactGroup extends Comparable<IContactGroup> {
    
    public void setId(int id);
    
    public int getId();
    
    public void setGroupName(String name);
    
    public String getGroupName();
        
    public void addContact(IContact member);
    
    public boolean hasContact(IContact contact);
    
    public List<IContact> getContacts();
    
    public boolean remove(IContact contact);

    public void removeAllContacts();
    
    @Override
    public int compareTo(IContactGroup cg);
}
