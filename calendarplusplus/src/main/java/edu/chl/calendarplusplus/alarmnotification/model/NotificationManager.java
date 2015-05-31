/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.alarmnotification.model;

import edu.chl.calendarplusplus.activity.model.IActivity;
import java.util.HashMap;

/**
 *
 * @author Johan
 */
public class NotificationManager implements INotificationManager {

    HashMap<IActivity, INotification> notificationManager;

    public NotificationManager() {
        notificationManager = new HashMap<>();
    }

    public void setNotification(IActivity a, INotification n) {
        /*
         if(getNotification(a) != null){
         notificationManager.remove(n.getActivity());
         }
         */
        notificationManager.put(a, n);
    }

    public INotification getNotification(IActivity a) {
        //Normal equals doesn't work, since we use JPA
        for (IActivity act : notificationManager.keySet()) {
            if (a.getId() == act.getId()) {
                return notificationManager.get(act);
            }
        }
        return null;
    }

    public void removeNotification(IActivity a) {
        for (IActivity act : notificationManager.keySet()) {
            if (a.getId() == act.getId()) {
                notificationManager.remove(act);
            }
        }
    }

}
