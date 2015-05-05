/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.controller;

import edu.chl.calendarplusplus.model.CalendarPlus;
import edu.chl.calendarplusplus.view.AddContactGroupCard;
import edu.chl.calendarplusplus.view.ProjectView;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author Michael
 */
public class AddContactGroupCardController implements PropertyChangeListener {

    public static AddContactGroupCardController create(CalendarPlus cal, ProjectView projectView, AddContactGroupCard contactGroupCard) {
        return new AddContactGroupCardController(cal, projectView, contactGroupCard);
    }

    private CalendarPlus cal;
    private ProjectView projV;
    private AddContactGroupCard cgc;

    private AddContactGroupCardController(CalendarPlus cal, ProjectView projectView, AddContactGroupCard cgc) {
        this.cal = cal;
        this.projV = projectView;
        this.cgc = cgc;
        projV.addPropertyChangeListener(this);
    }
    
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        String evtName = evt.getPropertyName();
        if (evtName.equalsIgnoreCase("AddContactGroup")) {
            cal.addContactGroup(cgc.getAsContactGroup());
            cgc.resetFields();
        }
    }

}
