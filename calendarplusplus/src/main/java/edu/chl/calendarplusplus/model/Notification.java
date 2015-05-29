/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.chl.calendarplusplus.model;
import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


/**
 *
 * @author johan
 */


/* The notification class includes all of the methods from the Alarm
   class, since Alarm is an abstract class. But it also gives an activity.
*/
@Entity
public class Notification extends Alarm implements INotification, Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    
    @OneToOne(targetEntity = Activity.class)
    private IActivity activity;

    public Notification() {
    }

    public Notification(Calendar d, String n, IActivity a) {
        super(d, n, null);
        
        if (d.before(a.getEndTime()) || d.equals(a.getEndTime())){
            activity = a;
        }
    }
    
    @Override
    public int getId(){
        return id;
    }
      
    @Override
    public IActivity getActivity(){
        return activity;
    }
    
    @Override
    public void setActivity(IActivity act){
        this.activity = act;
    }
    
}
