/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.controller;

import edu.chl.calendarplusplus.model.IAlarm;
import edu.chl.calendarplusplus.model.ICalendarPlus;
import edu.chl.calendarplusplus.view.AlarmCard;
import edu.chl.calendarplusplus.view.ProjectView;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author Johan
 */
public class AlarmSingleController implements PropertyChangeListener {
    
    private ICalendarPlus cal;
    private ProjectView projV;
    private AlarmCard al;

    public static AlarmSingleController create(ICalendarPlus cal, ProjectView projV, AlarmCard al) {
        return new AlarmSingleController(cal, projV, al);
    }

    private AlarmSingleController(ICalendarPlus cal, ProjectView projV, AlarmCard al) {
        this.cal = cal;
        this.projV = projV;
        this.al = al;
        projV.addPropertyChangeListener(this);
    }
    
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        String evtName = evt.getPropertyName();
        if (evtName.equalsIgnoreCase("EditAlarmClicked")) {
            System.out.println("Edit Alarm Clicked.");
            IAlarm alarm = (IAlarm) evt.getNewValue();
            projV.editAlarm(alarm);
        } else if(evtName.equalsIgnoreCase("RemoveAlarmClicked")) {
            System.out.println("Remove Alarm Clicked.");
            //IAlarm alarm = (IAlarm) evt.getNewValue();
            //projV.removeAlarm(alarm);
        }
    }
    
}
