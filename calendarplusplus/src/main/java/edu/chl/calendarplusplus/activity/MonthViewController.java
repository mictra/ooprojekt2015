/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.activity;

import edu.chl.calendarplusplus.ICalendarPlus;
import edu.chl.calendarplusplus.activity.ActivitySingleCard;
import edu.chl.calendarplusplus.contact.AddContactCard;
import edu.chl.calendarplusplus.activity.MonthViewCard;
import edu.chl.calendarplusplus.ProjectView;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Calendar;

/**
 *
 * @author erikforsberg
 */
public class MonthViewController implements PropertyChangeListener {
    
    private final ICalendarPlus cal;
    private final ProjectView projV;
    private final MonthViewCard mvc;
    
    public static MonthViewController create(ICalendarPlus cal, ProjectView projV, MonthViewCard mvc) {
        return new MonthViewController(cal, projV, mvc);
    }
    
    private MonthViewController(ICalendarPlus cal, ProjectView projV, MonthViewCard mvc) {
        this.cal = cal;
        this.projV = projV;
        this.mvc = mvc;
        projV.addPropertyChangeListener(this);
    }
    
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        String evtName = evt.getPropertyName();
        if (evtName.equals("MonthViewDayPressed")) {
            projV.monthToWeek((Integer) evt.getNewValue());
        }
    }
    
}
