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
public class Notification extends Alarm {
    
    private Activity activity;

    public Notification(Calendar d, String n, Activity a) {
        super(d, n);
        if (d.before(a.getEndTime()) || d.equals(a.getEndTime())){
            activity = a;
        }
    }
      
    public Activity getActivity(){
        return activity;
    }
    
    public void setActivity(Activity act){
        this.activity = act;
    }
    
}
