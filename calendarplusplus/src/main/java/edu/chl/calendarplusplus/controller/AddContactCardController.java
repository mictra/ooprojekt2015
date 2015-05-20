/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.controller;

import edu.chl.calendarplusplus.model.CalendarPlus;
import edu.chl.calendarplusplus.model.Contact;
import edu.chl.calendarplusplus.model.ContactGroup;
import edu.chl.calendarplusplus.model.ICalendarPlus;
import edu.chl.calendarplusplus.model.IContact;
import edu.chl.calendarplusplus.model.IContactGroup;
import edu.chl.calendarplusplus.view.AddContactCard;
import edu.chl.calendarplusplus.view.ProjectView;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Michael
 */
public class AddContactCardController implements PropertyChangeListener {

    private ICalendarPlus cal;
    private ProjectView projV;
    private AddContactCard cc;

    public static AddContactCardController create(ICalendarPlus cal, ProjectView projV, AddContactCard cc) {
        return new AddContactCardController(cal, projV, cc);
    }

    private AddContactCardController(ICalendarPlus cal, ProjectView projV, AddContactCard cc) {
        this.cal = cal;
        this.projV = projV;
        this.cc = cc;
        projV.addPropertyChangeListener(this);
    }
    
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        String evtName = evt.getPropertyName();
        if (evtName.equalsIgnoreCase("AddContact")) {
            Contact contact = cc.getAsContact();
            //List<String> stringGroups = cc.getContactGroups();
            List<ContactGroup> contactGroups = new ArrayList<>();
            contactGroups = cc.getContactGroups();
            for(ContactGroup cg : contactGroups){
//                if(stringGroups.contains(cg.getGroupName())){
//                    contactGroups.add(cg);
                    cg.addContact(contact);
//                }
            }
            cal.getContactManager().setContactGroups(contact, contactGroups);
            //cal.getContactGroupList().get(0).addContact(contact);
            cc.resetFields();
        } else if (evtName.equalsIgnoreCase("AddGroup")) {
            cc.addMemberGroup();
        } else if (evtName.equalsIgnoreCase("RemoveGroup")) {
            cc.removeMemberGroup();
        }
    }


//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == contactSave) {
//            Contact contact = cc.getAsContact();
//            cal.getContactGroupList().get(0).addContact(contact);
//        } else if (e.getSource() == contactCancel) {
//            //TODO: Something...
//        } else if (e.getSource() == contactAddGroup) {
//            cc.addMemberGroup();
//        }
//        if (e.getSource() == contactRemoveGroup) {
//            cc.removeMemberGroup();
//        }
//    }

}
