/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.alarmnotification;

import edu.chl.calendarplusplus.alarmnotification.IAlarm;
import edu.chl.calendarplusplus.ICalendarPlus;
import edu.chl.calendarplusplus.alarmnotification.AlarmCard;
import edu.chl.calendarplusplus.ProjectView;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JOptionPane;

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
            IAlarm alarm = (IAlarm) evt.getNewValue();
            projV.editAlarm(alarm);
        } else if(evtName.equalsIgnoreCase("RemoveAlarmClicked")) {
            IAlarm alarm = (IAlarm) evt.getNewValue();
            int op = JOptionPane.showConfirmDialog
                    (projV, 
                    "Are you sure you want to delete this alarm?",
                    "Remove the Alarm?",
                    JOptionPane.YES_NO_OPTION);
            if(op == JOptionPane.YES_OPTION){
                cal.removeAlarm(alarm);
                projV.updateAlarms(cal.getAlarmList());
            }
        }
    }
    
}
