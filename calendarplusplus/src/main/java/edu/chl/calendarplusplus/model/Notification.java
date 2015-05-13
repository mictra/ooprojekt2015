/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.chl.calendarplusplus.model;
import java.util.Calendar;


/**
 *
 * @author johan
 */


/* The notification class includes all of the methods from the Alarm
   class, since Alarm is an abstract class. But it also gives an activity.
*/
public class Notification extends Alarm implements INotification {
    
    private IActivity activity;

    public Notification(Calendar d, String n, IActivity a) {
        super(d, n);
        
        if (d.before(a.getEndTime()) || d.equals(a.getEndTime())){
            activity = a;
        }
    }

      
    public IActivity getActivity(){
        return activity;
    }
    
    public void setActivity(IActivity act){
        this.activity = act;
    }
    
}
