/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mockclasses;

import edu.chl.calendarplusplus.model.Activity;
import java.util.Calendar;

/**
 *
 * @author erikforsberg
 */
public class MockNotification extends MockAlarm {

    private Activity activity;

    public MockNotification(Calendar d, String n, Activity a) {
        super(d, n);
        if (d.before(a.getEndTime()) || d.equals(a.getEndTime())){
            activity = a;
        }
    }
}
