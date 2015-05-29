/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.controller;

import edu.chl.calendarplusplus.model.ContactGroup;
import edu.chl.calendarplusplus.model.IAlarm;
import edu.chl.calendarplusplus.model.ICalendarPlus;
import edu.chl.calendarplusplus.model.IContactGroup;
import edu.chl.calendarplusplus.view.AlarmCard;
import edu.chl.calendarplusplus.view.ContactGroupCard;
import edu.chl.calendarplusplus.view.ProjectView;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author cain
 */
public class ContactGroupSingleController implements PropertyChangeListener {
    
    private ICalendarPlus cal;
    private ProjectView projV;
    private ContactGroupCard cgc;

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
        IContactGroup cg = (IContactGroup) evt.getNewValue();
        if (evtName.equalsIgnoreCase("EditContractGroupClicked")) {
            System.out.println("Edit ContactGroup Clicked.");
        } 
        if(evtName.equalsIgnoreCase("RemoveContactGroupClicked")) {
            System.out.println("Remove ContractGroup Clicked.");
        }
    }
    
}

