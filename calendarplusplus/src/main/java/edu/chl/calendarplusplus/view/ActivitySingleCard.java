/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.view;

import edu.chl.calendarplusplus.model.CalendarPlus;
import edu.chl.calendarplusplus.model.IActivity;
import edu.chl.calendarplusplus.model.IContact;
import edu.chl.calendarplusplus.model.INotification;
import java.awt.Dimension;
import java.beans.PropertyChangeSupport;
import java.util.Calendar;
import javax.swing.JLabel;

/**
 *
 * @author cain
 */
public class ActivitySingleCard extends javax.swing.JPanel {

    String start, end;
    Calendar startdate, enddate;
    private PropertyChangeSupport pcs;
    private boolean buttonPressed;
    private IActivity act;
    private CalendarPlus cal;
    
    /**
     * Creates new form ActivitySingleCard
     */
    ActivitySingleCard(CalendarPlus cal) {
        initComponents();
        this.cal = cal;        
        attendeeScrollPane.getVerticalScrollBar().setUnitIncrement(20);
    }
    
    public void setFields(IActivity act) {
        this.act = act;
        nameLabel.setText(act.getName());
        startdate = act.getStartTime();
        enddate = act.getEndTime();
        start = startdate.get(startdate.DAY_OF_MONTH) + "." + (startdate.get(startdate.MONTH)+1) + "." + startdate.get(startdate.YEAR) + " kl. " + startdate.get(startdate.HOUR_OF_DAY) + ":" + (startdate.get(startdate.MINUTE) <= 5 ? "0" + startdate.get(startdate.MINUTE) : startdate.get(startdate.MINUTE));
        end = enddate.get(enddate.DAY_OF_MONTH) + "." + (enddate.get(enddate.MONTH)+1) + "." + enddate.get(enddate.YEAR) + " kl. " + enddate.get(enddate.HOUR_OF_DAY) + ":" + (enddate.get(enddate.MINUTE) <= 5 ? "0" + enddate.get(enddate.MINUTE) : enddate.get(enddate.MINUTE));
        dateLabel.setText(start + " -- " + end);
        locationLabel.setText(act.getLocation());
        descriptionTextArea.setText(act.getDescription());
        descriptionTextArea.setEditable(false);
        attendeesPanel.removeAll();
        attendeesPanel.setPreferredSize(new Dimension(500,act.getAttendees().size()*(20+5)));
        for (IContact c : act.getAttendees()) {
            JLabel label = new JLabel(c.getName());
            label.setPreferredSize(new Dimension(500,20));
            attendeesPanel.add(label);
        }
        INotification not = cal.getNotificationManager().getNotification(act);
        if (not == null) {
            notificationLabel.setText("None");
        } else {
            long diff = act.getStartTime().getTimeInMillis() - not.getAlarm().getTimeInMillis();
            int nottime = (int) (diff/(1000*60));
            System.out.println(nottime);
            switch (nottime) {
                case 0: notificationLabel.setText("When activity starts"); break;
                case 5: notificationLabel.setText("5 minutes before"); break;
                case 10: notificationLabel.setText("10 minutes before"); break;
                case 15: notificationLabel.setText("15 minutes before"); break;
                case 30: notificationLabel.setText("30 minutes before"); break;
                case 60: notificationLabel.setText("60 minutes before"); break;
            }
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

        nameLabel = new javax.swing.JLabel();
        staticDateLabel = new javax.swing.JLabel();
        staticLocationLabel = new javax.swing.JLabel();
        staticDescriptionLabel = new javax.swing.JLabel();
        staticNotificationLabel = new javax.swing.JLabel();
        staticAttendeesLabel = new javax.swing.JLabel();
        descriptionScrollPane = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        dateLabel = new javax.swing.JLabel();
        notificationLabel = new javax.swing.JLabel();
        locationLabel = new javax.swing.JLabel();
        attendeeScrollPane = new javax.swing.JScrollPane();
        attendeesPanel = new javax.swing.JPanel();
        editButton = new javax.swing.JLabel();
        removeButton = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1008, 640));

        nameLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 24)); // NOI18N
        nameLabel.setText("#NAME");

        staticDateLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        staticDateLabel.setText("Date:");

        staticLocationLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        staticLocationLabel.setText("Location:");

        staticDescriptionLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        staticDescriptionLabel.setText("Description:");

        staticNotificationLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        staticNotificationLabel.setText("Notification:");

        staticAttendeesLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        staticAttendeesLabel.setText("Attendees:");

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        descriptionTextArea.setLineWrap(true);
        descriptionTextArea.setRows(5);
        descriptionScrollPane.setViewportView(descriptionTextArea);

        dateLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        dateLabel.setText("#DATE");

        notificationLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        notificationLabel.setText("#NOTIFICATION");

        locationLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        locationLabel.setText("#LOCATION");

        attendeeScrollPane.setBorder(null);
        attendeeScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        attendeesPanel.setBorder(null);
        attendeesPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING));
        attendeeScrollPane.setViewportView(attendeesPanel);

        editButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editButton.png"))); // NOI18N
        editButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                labelMouseReleased(evt);
            }
        });

        removeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/removeButton.png"))); // NOI18N
        removeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                labelMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameLabel)
                        .addGap(18, 18, 18)
                        .addComponent(editButton)
                        .addGap(18, 18, 18)
                        .addComponent(removeButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(staticNotificationLabel)
                            .addComponent(staticDescriptionLabel)
                            .addComponent(staticDateLabel)
                            .addComponent(staticLocationLabel)
                            .addComponent(staticAttendeesLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(locationLabel)
                            .addComponent(dateLabel)
                            .addComponent(descriptionScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                            .addComponent(notificationLabel)
                            .addComponent(attendeeScrollPane))))
                .addContainerGap(373, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nameLabel)
                        .addComponent(editButton))
                    .addComponent(removeButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(staticDateLabel)
                    .addComponent(dateLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(staticLocationLabel)
                    .addComponent(locationLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(staticDescriptionLabel)
                    .addComponent(descriptionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(staticNotificationLabel)
                    .addComponent(notificationLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(staticAttendeesLabel)
                        .addGap(0, 309, Short.MAX_VALUE))
                    .addComponent(attendeeScrollPane))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMouseExited
        buttonPressed = false;
    }//GEN-LAST:event_labelMouseExited

    private void labelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMousePressed
        buttonPressed = true;
    }//GEN-LAST:event_labelMousePressed

    private void labelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMouseReleased
        if (buttonPressed) {
            if (evt.getSource() == editButton) {
                pcs.firePropertyChange("EditActivityClicked", evt, act);
            }
            if (evt.getSource() == removeButton) {
                pcs.firePropertyChange("RemoveActivityClicked", evt, act);
            }
        }
    }//GEN-LAST:event_labelMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane attendeeScrollPane;
    private javax.swing.JPanel attendeesPanel;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JScrollPane descriptionScrollPane;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JLabel editButton;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel notificationLabel;
    private javax.swing.JLabel removeButton;
    private javax.swing.JLabel staticAttendeesLabel;
    private javax.swing.JLabel staticDateLabel;
    private javax.swing.JLabel staticDescriptionLabel;
    private javax.swing.JLabel staticLocationLabel;
    private javax.swing.JLabel staticNotificationLabel;
    // End of variables declaration//GEN-END:variables
    
    
    public void addListener(PropertyChangeSupport pcs) {
        this.pcs = pcs;
    }

}
