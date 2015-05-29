/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.controller;

import edu.chl.calendarplusplus.model.CalendarPlus;
import edu.chl.calendarplusplus.model.IContactGroup;
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
    private AddContactGroupCard acgc;

    private AddContactGroupCardController(CalendarPlus cal, ProjectView projectView, AddContactGroupCard acgc) {
        this.cal = cal;
        this.projV = projectView;
        this.acgc = acgc;
        projV.addPropertyChangeListener(this);
    }
    
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        String evtName = evt.getPropertyName();
        if (evtName.equalsIgnoreCase("AddContactGroup")) {
            cal.addContactGroup(acgc.getAsContactGroup());
            acgc.resetFields();
        } else if (evtName.equalsIgnoreCase("BackToContactGroups")) {
             projV.changeCard("ContactGroupCard");
        } else if (evtName.equalsIgnoreCase("AddContactGroupCardAddMember")) {
            acgc.addMember();
        } else if (evtName.equalsIgnoreCase("AddContactGroupCardRemoveMember")) {
            acgc.removeMember();
        } else if (evtName.equalsIgnoreCase("EditContactGroup")) {
            IContactGroup cg = (IContactGroup) evt.getNewValue();
            System.out.println(cg.getGroupName()+ " shall be updated now");
            cal.updateContactGroup(cg);
            // ToDo Update lists and database for this group
        } else if (evtName.equalsIgnoreCase("RemoveContactGroup")) {
            IContactGroup cg = (IContactGroup) evt.getNewValue();
            System.out.println(cg.getGroupName()+ " shall be removed now");
            cal.removeContactGroup(cg);
            // ToDo remove group
        }
    }

}
