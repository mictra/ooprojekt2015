/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.controller;

import edu.chl.calendarplusplus.model.CalendarPlus;
import edu.chl.calendarplusplus.view.AddActivityCard;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Michael
 */
public class AddActivityCardController implements ActionListener {
    
    private CalendarPlus cal;
    private AddActivityCard ac;
    private JButton activityCardSave;
    private JButton activityCardCancel;
    
    public static AddActivityCardController create(CalendarPlus cal, AddActivityCard ac) {
        return new AddActivityCardController(cal, ac);
    }

    private AddActivityCardController(CalendarPlus cal, AddActivityCard ac) {
        this.cal = cal;
        this.ac = ac;
        initComponents();
        addListeners();
    }
    
    private void initComponents(){
        activityCardSave = ac.getSaveButton();
        activityCardCancel = ac.getCancelButton();
    }
    
    private void addListeners(){
        activityCardSave.addActionListener(this);
        activityCardCancel.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
