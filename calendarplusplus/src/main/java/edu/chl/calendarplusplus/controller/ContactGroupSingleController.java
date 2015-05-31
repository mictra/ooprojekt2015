/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.controller;

import edu.chl.calendarplusplus.model.ICalendarPlus;
import edu.chl.calendarplusplus.model.IContactGroup;
import edu.chl.calendarplusplus.view.ContactGroupCard;
import edu.chl.calendarplusplus.view.ProjectView;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author cain
 */
public class ContactGroupSingleController implements PropertyChangeListener {
    
    private final ICalendarPlus cal;
    private final ProjectView projV;
    private final ContactGroupCard cgc;

    public static ContactGroupSingleController create(ICalendarPlus cal, ProjectView projV, ContactGroupCard cgc) {
        return new ContactGroupSingleController(cal, projV, cgc);
    }

    private ContactGroupSingleController(ICalendarPlus cal, ProjectView projV, ContactGroupCard cgc) {
        this.cal = cal;
        this.projV = projV;
        this.cgc = cgc;
        projV.addPropertyChangeListener(this);
    }
    
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        String evtName = evt.getPropertyName();
        if (evtName.equalsIgnoreCase("EditContactGroupButtonClicked")) {
            IContactGroup cg = (IContactGroup) evt.getNewValue();
            projV.editContactGroup(cg);
            //System.out.println(cg.getGroupName() + " Edit ContactGroup Clicked.");
        } 
        if(evtName.equalsIgnoreCase("RemoveContactGroupButtonClicked")) {
            IContactGroup cg = (IContactGroup) evt.getNewValue();
            System.out.println(cg.getGroupName() + " Remove ContactGroup Clicked.");
            cal.removeContactGroup(cg);
            projV.updateContactGroups(cal.getContactGroupList());
            //ToDo remove group from lists and database
        }
    }
    
}

