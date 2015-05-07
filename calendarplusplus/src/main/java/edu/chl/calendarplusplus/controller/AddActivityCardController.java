/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.controller;

import edu.chl.calendarplusplus.model.Activity;
import edu.chl.calendarplusplus.model.CalendarPlus;
import edu.chl.calendarplusplus.model.Notification;
import edu.chl.calendarplusplus.view.AddActivityCard;
import edu.chl.calendarplusplus.view.ProjectView;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Calendar;
import javax.swing.JButton;

/**
 *
 * @author Michael
 */
public class AddActivityCardController implements PropertyChangeListener {

    private CalendarPlus cal;
    private ProjectView projV;
    private AddActivityCard ac;
    private JButton activityCardSave;
    private JButton activityCardCancel;

    public static AddActivityCardController create(CalendarPlus cal, ProjectView projV, AddActivityCard ac) {
        return new AddActivityCardController(cal, projV, ac);
    }

    private AddActivityCardController(CalendarPlus cal, ProjectView projV, AddActivityCard ac) {
        this.cal = cal;
        this.projV = projV;
        this.ac = ac;
        projV.addPropertyChangeListener(this);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        String evtName = evt.getPropertyName();
        if (evtName.equalsIgnoreCase("AddActivity")) {
            Activity act = ac.getAsActivity();
            cal.addActivity(act);
            Notification not = ac.getAsNotification(act);
            if (not != null) {
                //Add notification to manager or update or remove
            }
            ac.resetFields();
        }
    }


//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == activityCardSave) {
//            cal.addActivity(ac.getAsActivity());
//        } else if (e.getSource() == activityCardCancel) {
//            for (Activity a : cal.getActivityList()) {
//                System.out.println("Name: " + a.getName());
//            }
//        }
//    }

}
