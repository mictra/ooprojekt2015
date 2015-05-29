/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.controller;

import edu.chl.calendarplusplus.model.ICalendarPlus;
import edu.chl.calendarplusplus.model.IContact;
import edu.chl.calendarplusplus.view.ContactCard;
import edu.chl.calendarplusplus.view.ProjectView;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author cain
 */
public class ContactSingleController implements PropertyChangeListener {
    
    private final ICalendarPlus cal;
    private final ProjectView projV;
    private final ContactCard cc;

    public static ContactSingleController create(ICalendarPlus cal, ProjectView projV, ContactCard cc) {
        return new ContactSingleController(cal, projV, cc);
    }

    private ContactSingleController(ICalendarPlus cal, ProjectView projV, ContactCard cc) {
        this.cal = cal;
        this.projV = projV;
        this.cc = cc;
        projV.addPropertyChangeListener(this);
    }
    
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        String evtName = evt.getPropertyName();
        IContact c = (IContact) evt.getNewValue();
        if (evtName.equalsIgnoreCase("EditContactClicked")) {
            System.out.println(c.getName() + "Edit Contact Clicked.");
        } 
        if (evtName.equalsIgnoreCase("RemoveContactClicked")) {
            System.out.println(c.getName() + "Remove Contact Clicked.");
        }
    }
    
}
