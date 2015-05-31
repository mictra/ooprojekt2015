/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.activity.model;

import edu.chl.calendarplusplus.contact.model.IContact;
import java.util.List;

/**
 *
 * @author Michael
 */
public interface IActivityManager {
    
    public void addActivityToList(List<IActivity> activities, IActivity a);
    public void setContactActivities(IContact c, List<IActivity> activities);
    public List<IActivity> getContactActivities(IContact c);
    public void removeContact(IContact c);
    void addNewGroup(IContact c, IActivity a);
    void removeActivityFromContact(IContact c, IActivity a);
    
}
