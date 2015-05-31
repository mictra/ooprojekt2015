/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.alarmnotification.controller;

import edu.chl.calendarplusplus.model.ICalendarPlus;
import edu.chl.calendarplusplus.alarmnotification.model.IAlarm;
import edu.chl.calendarplusplus.alarmnotification.view.AddAlarmCard;
import edu.chl.calendarplusplus.view.ProjectView;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author Johan
 */
public class AddAlarmCardController implements PropertyChangeListener {

    private ICalendarPlus cal;
    private ProjectView projV;
    private AddAlarmCard ac;

    public static AddAlarmCardController create(ICalendarPlus cal, ProjectView projV, AddAlarmCard ac) {
        return new AddAlarmCardController(cal, projV, ac);
    }

    private AddAlarmCardController(ICalendarPlus cal, ProjectView projV, AddAlarmCard ac) {
        this.cal = cal;
        this.projV = projV;
        this.ac = ac;
        projV.addPropertyChangeListener(this);
    }
    
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        String evtName = evt.getPropertyName();
        if (evtName.equalsIgnoreCase("AddAlarm")) {
            IAlarm al = ac.getAsAlarm();
            if (al.getAlarm() != null && al.getAlarmName() != null){
                cal.addAlarm(al);
            }
            projV.changeCard("AlarmCard");
        } else if (evtName.equalsIgnoreCase("EditAlarm")) {
            IAlarm al = ac.getAsAlarm();
            if (al.getAlarm() != null && al.getAlarmName() != null){
                cal.updateAlarm(al);
            }
            projV.changeCard("AlarmCard");
        } else if (evtName.equalsIgnoreCase("BackToAlarm")) {
            projV.changeCard("AlarmCard");
        }
        ac.resetFields();
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
