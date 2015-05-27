/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.view;

import edu.chl.calendarplusplus.model.IAlarm;
import java.beans.PropertyChangeSupport;
import java.util.Calendar;

/**
 *
 * @author cain
 */
public class AlarmElement extends javax.swing.JPanel {

    private PropertyChangeSupport pcs;
    private boolean buttonPressed;
    
    /**
     * Creates new form ListViewElement
     */
    public AlarmElement(IAlarm a) {
        initComponents();
        nameLabel.setText(a.getAlarmName());
        Calendar c = a.getAlarm();
        String date = c.get(c.DAY_OF_MONTH) + "." + (c.get(c.MONTH)+1) + "." + c.get(c.YEAR) + " - kl. " + c.get(c.HOUR_OF_DAY) + ":" + (c.get(c.MINUTE) <= 5 ? "0" + c.get(c.MINUTE) : c.get(c.MINUTE));
        dateLabel.setText(date);
        descriptionLabel.setText(a.getDescName());
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
        descriptionLabel = new javax.swing.JLabel();
        editButton = new javax.swing.JLabel();
        removeButton = new javax.swing.JLabel();

        setBackground(new java.awt.Color(121, 134, 203));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        setPreferredSize(new java.awt.Dimension(661, 138));

        nameLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 24)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("#NAME");

        dateLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        dateLabel.setForeground(new java.awt.Color(255, 255, 255));
        dateLabel.setText("#DATE");

        descriptionLabel.setBackground(new java.awt.Color(121, 134, 203));
        descriptionLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        descriptionLabel.setForeground(new java.awt.Color(255, 255, 255));
        descriptionLabel.setText("#DESCRIPTION");

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 477, Short.MAX_VALUE)
                        .addComponent(editButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(removeButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateLabel)
                            .addComponent(descriptionLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel)
                    .addComponent(editButton)
                    .addComponent(removeButton))
                .addGap(18, 18, 18)
                .addComponent(dateLabel)
                .addGap(27, 27, 27)
                .addComponent(descriptionLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void labelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMousePressed
        buttonPressed = true;
    }//GEN-LAST:event_labelMousePressed

    private void labelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMouseReleased
        if(buttonPressed) {
            if (evt.getSource() == editButton) {
                //System.out.println(labelMap.get(label).getName());
                pcs.firePropertyChange("EditAlarmClicked", null, null);
            } else if (evt.getSource() == removeButton) {
                //System.out.println(labelMap.get(label).getName());
                pcs.firePropertyChange("RemoveAlarmClicked", null, null);
            }
        }
    }//GEN-LAST:event_labelMouseReleased

    private void labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMouseExited
        buttonPressed = false;
    }//GEN-LAST:event_labelMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JLabel editButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel removeButton;
    // End of variables declaration//GEN-END:variables

    public void addListener (PropertyChangeSupport pcs) {
        this.pcs = pcs;
    }
}