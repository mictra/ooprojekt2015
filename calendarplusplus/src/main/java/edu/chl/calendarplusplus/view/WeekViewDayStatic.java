/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.view;

import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author cain
 */
public class WeekViewDayStatic extends javax.swing.JPanel {

    private Calendar cal;
    
    /**
     * Creates new form WeekViewDayStatic
     */

    WeekViewDayStatic(Calendar c) {
        initComponents();
        this.cal = c;
        dayLabel.setText(c.getDisplayName(c.DAY_OF_WEEK, c.SHORT, Locale.ENGLISH) + " " + c.get(c.DAY_OF_MONTH));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dayLabel = new javax.swing.JLabel();

        dayLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        dayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dayLabel.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dayLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dayLabel)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dayLabel;
    // End of variables declaration//GEN-END:variables
}