/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.controller;

import edu.chl.calendarplusplus.model.CalendarPlus;
import edu.chl.calendarplusplus.model.Contact;
import edu.chl.calendarplusplus.view.AddContactCard;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Michael
 */
public class AddContactCardController implements ActionListener {

    private CalendarPlus cal;
    private AddContactCard cc;
    private JButton contactSave;
    private JButton contactCancel;
    private JButton contactAddGroup;
    private JButton contactRemoveGroup;

    public static AddContactCardController create(CalendarPlus cal, AddContactCard cc) {
        return new AddContactCardController(cal, cc);
    }

    private AddContactCardController(CalendarPlus cal, AddContactCard cc) {
        this.cal = cal;
        this.cc = cc;
        initComponents();
        addListeners();
    }

    private void initComponents() {
        contactSave = cc.getSaveButton();
        contactCancel = cc.getCancelButton();
        contactAddGroup = cc.getAddGroupButton();
        contactRemoveGroup = cc.getRemoveGroupButton();
    }

    private void addListeners() {
        contactSave.addActionListener(this);
        contactCancel.addActionListener(this);
        contactAddGroup.addActionListener(this);
        contactRemoveGroup.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == contactSave) {
            Contact contact = cc.getAsContact();
            cal.getContactGroupList().get(0).addContact(contact);
        } else if (e.getSource() == contactCancel) {
            //TODO: Something...
        } else if (e.getSource() == contactAddGroup) {
            cc.addMemberGroup();
        }
        if (e.getSource() == contactRemoveGroup) {
            cc.removeMemberGroup();
        }
    }

}
