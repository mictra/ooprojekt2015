/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.activity;

import edu.chl.calendarplusplus.activity.Activity;
import edu.chl.calendarplusplus.CalendarPlus;
import edu.chl.calendarplusplus.contact.Contact;
import edu.chl.calendarplusplus.activity.IActivity;
import edu.chl.calendarplusplus.ICalendarPlus;
import edu.chl.calendarplusplus.alarmnotification.INotification;
import edu.chl.calendarplusplus.alarmnotification.Notification;
import edu.chl.calendarplusplus.activity.AddActivityCard;
import edu.chl.calendarplusplus.ProjectView;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Calendar;
import javax.swing.JButton;

/**
 *
 * @author Michael
 */
public class AddActivityCardController implements PropertyChangeListener {

    private ICalendarPlus cal;
    private ProjectView projV;
    private AddActivityCard ac;
    private JButton activityCardSave;
    private JButton activityCardCancel;

    public static AddActivityCardController create(ICalendarPlus cal, ProjectView projV, AddActivityCard ac) {
        return new AddActivityCardController(cal, projV, ac);
    }

    private AddActivityCardController(ICalendarPlus cal, ProjectView projV, AddActivityCard ac) {
        this.cal = cal;
        this.projV = projV;
        this.ac = ac;
        projV.addPropertyChangeListener(this);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        String evtName = evt.getPropertyName();
        if (evtName.equalsIgnoreCase("AddActivity")) {
            IActivity act = ac.getAsActivity();
            cal.addActivity(act);
            INotification not = ac.getAsNotification(act);
            if (not != null) {
                cal.addNotification(not);
            }
            ac.resetFields();
            projV.showActivitySingle(act);
        } else if (evtName.equalsIgnoreCase("AddActivityCardAddAttendee")) {
            ac.addAttendee();
        } else if (evtName.equalsIgnoreCase("AddActivityCardRemoveAttendee")) {
            ac.removeAttendee();
        } else if (evtName.equalsIgnoreCase("EditActivity")) {
            IActivity act = (IActivity) evt.getNewValue();
            cal.updateActivity(act, act.getAttendees());
            INotification not = ac.getAsNotification(act);
            cal.updateNotification(not, act);
            ac.resetFields();
            projV.showActivitySingle(act);
        } else if (evtName.equalsIgnoreCase("AddActivityCardCancelButtonClicked")) {
            projV.changeCard("ListViewCard");
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
