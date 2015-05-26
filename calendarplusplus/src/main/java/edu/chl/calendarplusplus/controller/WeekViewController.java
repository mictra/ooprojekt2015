/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.controller;

import edu.chl.calendarplusplus.model.IActivity;
import edu.chl.calendarplusplus.model.ICalendarPlus;
import edu.chl.calendarplusplus.view.ProjectView;
import edu.chl.calendarplusplus.view.WeekViewCard;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author cain
 */
public class WeekViewController implements PropertyChangeListener {

    private final ICalendarPlus cal;
    private final ProjectView projV;
    private final WeekViewCard wvc;
    
    public static WeekViewController create(ICalendarPlus cal, ProjectView projV, WeekViewCard wvc) {
        return new WeekViewController(cal, projV, wvc);
    }
    
    private WeekViewController(ICalendarPlus cal, ProjectView projV, WeekViewCard wvc) {
        this.cal = cal;
        this.projV = projV;
        this.wvc = wvc;
        projV.addPropertyChangeListener(this);
    }
    
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        String evtName = evt.getPropertyName();
        if (evtName.equalsIgnoreCase("WeekViewLabelClicked")) {
            IActivity act = (IActivity) evt.getNewValue();
            projV.showActivitySingle(act);
        }
    }
    
}
