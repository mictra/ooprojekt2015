/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.view;

import edu.chl.calendarplusplus.model.CalendarPlus;
import edu.chl.calendarplusplus.model.IActivity;
import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import javax.swing.JLabel;

/**
 *
 * @author cain
 */
public class WeekViewDayElement extends javax.swing.JPanel {

    private final Calendar start, end;
    private List<IActivity> activitylist;
    private final List<JLabel> labellist;
    private String minute = "";
    
    /**
     * Creates new form WeekViewDayElement
     */
    WeekViewDayElement(CalendarPlus cal, Calendar c) {
        initComponents();
        start = Calendar.getInstance(TimeZone.getTimeZone("Europe/Stockholm"), Locale.ENGLISH);
        start.setTimeInMillis(c.getTimeInMillis());        
        end = Calendar.getInstance(TimeZone.getTimeZone("Europe/Stockholm"), Locale.ENGLISH);
        end.setTimeInMillis(start.getTimeInMillis());
        end.add(end.HOUR_OF_DAY, 1);
        activitylist = new ArrayList<>();
        activitylist = cal.getActivitiesByHour(start, end);
        labellist = new ArrayList<>();
        for (IActivity act: activitylist) {
            minute = act.getStartTime().get(act.getStartTime().MINUTE) <= 5 ? "0"+Integer.toString(act.getStartTime().get(act.getStartTime().MINUTE)) : Integer.toString(act.getStartTime().get(act.getStartTime().MINUTE));
            JLabel label = new JLabel(act.getStartTime().get(act.getStartTime().HOUR_OF_DAY)+":"+minute+" "+act.getName());
            label.setPreferredSize(new Dimension(120,15));
            label.setOpaque(true);
            label.setBackground(Color.green);
            labellist.add(label);
        }
        for (JLabel label: labellist) {
            containerPanel.add(label);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        containerPanel = new javax.swing.JPanel();

        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        setPreferredSize(new java.awt.Dimension(132, 50));

        containerPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(containerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel containerPanel;
    // End of variables declaration//GEN-END:variables
}
