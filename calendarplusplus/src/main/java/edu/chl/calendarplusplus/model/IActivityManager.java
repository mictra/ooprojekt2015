/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.model;

import java.util.List;

/**
 *
 * @author Michael
 */
public interface IActivityManager {
    
    public void setContactActivities(Contact c, List<Activity> activities);
    public List<Activity> getContactActivities(Contact c);
    public void removeContact(Contact c);
    
}
