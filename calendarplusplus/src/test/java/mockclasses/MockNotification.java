/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mockclasses;

import edu.chl.calendarplusplus.activity.Activity;
import edu.chl.calendarplusplus.activity.IActivity;
import edu.chl.calendarplusplus.alarmnotification.INotification;
import java.util.Calendar;

/**
 *
 * @author erikforsberg
 */
public class MockNotification extends MockAlarm implements INotification {

    private Activity activity;

    public MockNotification(Calendar d, String n, IActivity a) {
    }

    @Override
    public void setActivity(IActivity act) {
    }

    @Override
    public Activity getActivity() {
        return this.activity;
    }
}
