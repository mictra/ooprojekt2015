/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.controller;

import edu.chl.calendarplusplus.model.IActivity;
import edu.chl.calendarplusplus.model.ICalendarPlus;
import edu.chl.calendarplusplus.view.ActivitySingleCard;
import edu.chl.calendarplusplus.view.ProjectView;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author cain
 */
public class ActivitySingleController implements PropertyChangeListener {

    private final ICalendarPlus cal;
    private final ProjectView projV;
    private final ActivitySingleCard asc;
    
    public static ActivitySingleController create(ICalendarPlus cal, ProjectView projV, ActivitySingleCard asc) {
        return new ActivitySingleController(cal, projV, asc);
    }
    
    private ActivitySingleController(ICalendarPlus cal, ProjectView projV, ActivitySingleCard asc) {
        this.cal = cal;
        this.projV = projV;
        this.asc = asc;
        projV.addPropertyChangeListener(this);
    }
    
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        String evtName = evt.getPropertyName();
        if (evtName.equalsIgnoreCase("EditActivityClicked")) {
//            IActivity act = (IActivity) evt.getNewValue();
//            projV.showActivitySingle(act);
            IActivity act = (IActivity) evt.getNewValue();
            System.out.println(act.getName() + " Edit button clicked");
            projV.editActivity(act, cal.getNotificationManager().getNotification(act));
        }
        if (evtName.equalsIgnoreCase("RemoveActivityClicked")) {
            IActivity act = (IActivity) evt.getNewValue();
            System.out.println(act.getName() + " Remove button clicked");
            cal.removeActivity(act);
            projV.updateListView(cal.getActivityList());

        }
    }
    
}
