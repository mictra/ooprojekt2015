/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.view;

import edu.chl.calendarplusplus.model.Activity;
import edu.chl.calendarplusplus.model.IActivity;
import edu.chl.calendarplusplus.model.INotification;
import java.beans.PropertyChangeSupport;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author cain
 */
public class ListViewElement extends javax.swing.JPanel {

    private boolean buttonPressed;
    private PropertyChangeSupport pcs;
    private IActivity a;
    private INotification not;
    
    /**
     * Creates new form ListViewElement
     */
    public ListViewElement(IActivity a, INotification not) {
        initComponents();
        this.a = a;
        this.not = not;
        nameLabel.setText(a.getName());
        Calendar c = a.getStartTime();
        String date = c.get(c.DAY_OF_MONTH) + "." + (c.get(c.MONTH)+1) + "." + c.get(c.YEAR) + " kl. " + c.get(c.HOUR_OF_DAY) + ":" + (c.get(c.MINUTE) <= 5 ? "0" + c.get(c.MINUTE) : c.get(c.MINUTE));
        dateLabel.setText(date);
        locationLabel.setText(a.getLocation());
        if (not == null) {
            notificationLabel.setText("(No notification set)");
        } else {
            long diff = a.getStartTime().getTimeInMillis() - not.getAlarm().getTimeInMillis();
            int nottime = (int) (diff/(1000*60));
            System.out.println(nottime);
            switch (nottime) {
                case 0: notificationLabel.setText("(Notification when activity starts)"); break;
                case 5: notificationLabel.setText("(Notification 5 minutes before)"); break;
                case 10: notificationLabel.setText("(Notification 10 minutes before)"); break;
                case 15: notificationLabel.setText("(Notification 15 minutes before)"); break;
                case 30: notificationLabel.setText("(Notification 30 minutes before)"); break;
                case 60: notificationLabel.setText("(Notification 60 minutes before)"); break;
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
        dateLabel = new javax.swing.JLabel();
        locationLabel = new javax.swing.JLabel();
        notificationLabel = new javax.swing.JLabel();
        removeButton = new javax.swing.JLabel();
        editButton = new javax.swing.JLabel();

        setBackground(new java.awt.Color(121, 134, 203));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        nameLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 24)); // NOI18N
        nameLabel.setForeground(java.awt.Color.white);
        nameLabel.setText("#NAME");
        nameLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                labelMouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelMouseExited(evt);
            }
        });

        dateLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        dateLabel.setForeground(java.awt.Color.white);
        dateLabel.setText("#DATE");

        locationLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        locationLabel.setForeground(java.awt.Color.white);
        locationLabel.setText("#LOCATION");

        notificationLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        notificationLabel.setForeground(java.awt.Color.white);
        notificationLabel.setText("#NOTIFICATION");

        removeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/removeButton.png"))); // NOI18N
        removeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                labelMouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelMouseExited(evt);
            }
        });

        editButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/editButton.png"))); // NOI18N
        editButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                labelMouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelMouseExited(evt);
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(editButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dateLabel)
                                .addGap(18, 18, 18)
                                .addComponent(notificationLabel))
                            .addComponent(locationLabel))
                        .addGap(0, 456, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(removeButton)
                    .addComponent(editButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateLabel)
                    .addComponent(notificationLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(locationLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                pcs.firePropertyChange("EditActivityClicked", evt, a);
            }
            if (evt.getSource() == removeButton) {
                int op = JOptionPane.showConfirmDialog(this,
                        "Are you sure you want to delete this activity?",
                        "Remove the Activity?",
                        JOptionPane.YES_NO_OPTION);
                if (op == JOptionPane.YES_OPTION) {
                    pcs.firePropertyChange("RemoveActivityClicked", evt, a);
                }
            }
            if (evt.getSource() == nameLabel) {
                pcs.firePropertyChange("ActivityNameLabelLabelClicked", evt, a);
            }
        }
    }//GEN-LAST:event_labelMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel editButton;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel notificationLabel;
    private javax.swing.JLabel removeButton;
    // End of variables declaration//GEN-END:variables

    public void addListener(PropertyChangeSupport pcs) {
        this.pcs = pcs;
    }
    
}
