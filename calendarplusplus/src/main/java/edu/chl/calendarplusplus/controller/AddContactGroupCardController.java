/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.controller;

import edu.chl.calendarplusplus.model.CalendarPlus;
import edu.chl.calendarplusplus.view.AddContactGroupCard;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Michael
 */
public class AddContactGroupCardController implements ActionListener {

    private CalendarPlus cal;
    private AddContactGroupCard cgc;
    private JButton contactGroupSave;
    private JButton contactGroupCancel;

    public static AddContactGroupCardController create(CalendarPlus cal, AddContactGroupCard cgc) {
        return new AddContactGroupCardController(cal, cgc);
    }

    private AddContactGroupCardController(CalendarPlus cal, AddContactGroupCard cgc) {
        this.cal = cal;
        this.cgc = cgc;
        initComponents();
        addListeners();
    }

    private void initComponents() {
        contactGroupSave = cgc.getSaveButton();
        contactGroupCancel = cgc.getCancelButton();
    }

    private void addListeners() {
        contactGroupSave.addActionListener(this);
        contactGroupCancel.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == contactGroupSave) {
            cal.addContactGroup(cgc.getAsContactGroup());
        } else if (e.getSource() == contactGroupCancel) {
            //TODO: Something...
        }
    }

}
