/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.view;

import edu.chl.calendarplusplus.model.Alarm;
import edu.chl.calendarplusplus.model.IAlarm;
import java.awt.Color;
import java.beans.PropertyChangeSupport;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author cain
 */
public class AddAlarmCard extends javax.swing.JPanel {

    /**
     * Creates new form AddActivityCard
     */
    public AddAlarmCard() {
        initComponents();
        initComboBoxes();
        resetFields();
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
        nameTextField = new javax.swing.JTextField();
        startDateLabel = new javax.swing.JLabel();
        dayComboBox = new javax.swing.JComboBox();
        monthComboBox = new javax.swing.JComboBox();
        yearComboBox = new javax.swing.JComboBox();
        hourComboBox = new javax.swing.JComboBox();
        minuteComboBox = new javax.swing.JComboBox();
        descriptionLabel = new javax.swing.JLabel();
        descriptionScrollPane = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        saveButton = new javax.swing.JLabel();
        cancelButton = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(600, 600));

        nameLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        nameLabel.setText("Alarm name*");

        startDateLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        startDateLabel.setText("Startdate*");

        dayComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1" }));

        monthComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        yearComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2015" }));

        hourComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        minuteComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55" }));

        descriptionLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        descriptionLabel.setText("Description");

        descriptionScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        descriptionTextArea.setColumns(20);
        descriptionTextArea.setLineWrap(true);
        descriptionTextArea.setRows(5);
        descriptionScrollPane.setViewportView(descriptionTextArea);

        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/saveButton.png"))); // NOI18N
        saveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                labelMouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveButtonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveButtonMouseEntered(evt);
            }
        });

        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cancelButton.png"))); // NOI18N
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                labelMouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelButtonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelButtonMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startDateLabel)
                    .addComponent(descriptionLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(dayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(hourComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(minuteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(nameTextField))
                    .addComponent(descriptionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancelButton)
                        .addGap(18, 18, 18)
                        .addComponent(saveButton)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hourComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minuteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startDateLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descriptionLabel)
                    .addComponent(descriptionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveButton)
                    .addComponent(cancelButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseEntered
        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/saveButtonHover.png")));
    }//GEN-LAST:event_saveButtonMouseEntered

    private void saveButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveButtonMouseExited
        saveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/saveButton.png")));
        buttonPressed = false;
    }//GEN-LAST:event_saveButtonMouseExited

    private void cancelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseEntered
        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cancelButtonHover.png")));
    }//GEN-LAST:event_cancelButtonMouseEntered

    private void cancelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseExited
        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cancelButton.png")));
        buttonPressed = false;
    }//GEN-LAST:event_cancelButtonMouseExited

    private void labelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMousePressed
        buttonPressed = true;
    }//GEN-LAST:event_labelMousePressed

    private void labelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMouseReleased
        if (buttonPressed) {
            if (evt.getSource() == saveButton && !isEdit) {
                if (checkAlarm()) {
                    pcs.firePropertyChange("AddAlarm", null, null);
                }
            } else if (evt.getSource() == saveButton && isEdit) {
                if (checkAlarm()) {
                    pcs.firePropertyChange("EditAlarm", null, null);
                }
            } else if (evt.getSource() == cancelButton) {
                pcs.firePropertyChange("BackToAlarm", null, null);
            }
        }
    }//GEN-LAST:event_labelMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cancelButton;
    private javax.swing.JComboBox dayComboBox;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JScrollPane descriptionScrollPane;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JComboBox hourComboBox;
    private javax.swing.JComboBox minuteComboBox;
    private javax.swing.JComboBox monthComboBox;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel saveButton;
    private javax.swing.JLabel startDateLabel;
    private javax.swing.JComboBox yearComboBox;
    // End of variables declaration//GEN-END:variables

    private PropertyChangeSupport pcs;
    private boolean buttonPressed;
    private boolean isEdit = false;
    private int alarmId;

    public boolean checkAlarm() {
        IAlarm alarm = getAsAlarm();
        boolean flag = true;
        if (alarm.getAlarmName().equals("")) {
            nameLabel.setForeground(Color.red);
            flag = false;
        }
        if (alarm.getAlarm().getTimeInMillis() <= Calendar.getInstance().getTimeInMillis()) {
            startDateLabel.setForeground(Color.red);
            flag = false;
        }
        return flag;
    }

    public IAlarm getAsAlarm() {
        Calendar timeDate = Calendar.getInstance();
        int sYear = (Integer) yearComboBox.getSelectedItem();
        int sMonth = monthComboBox.getSelectedIndex();
        int sDay = dayComboBox.getSelectedIndex() + 1;
        int sHour = Integer.parseInt((String) hourComboBox.getSelectedItem());
        int sMinute = Integer.parseInt((String) minuteComboBox.getSelectedItem());
        timeDate.set(sYear, sMonth, sDay, sHour, sMinute);
        IAlarm a = new Alarm(timeDate, nameTextField.getText(), descriptionTextArea.getText());
        if (isEdit) {
            a.setId(alarmId);
        }
        return a;
    }

    /*
     public void registerListener(ProjectViewController controller){
     saveButton.addActionListener(controller);
     cancelButton.addActionListener(controller);
     }
     */
    private void initComboBoxes() {
        // Set the days
        dayComboBox.removeAllItems();
        for (int i = 1; i <= 31; i++) {
            dayComboBox.addItem(i);
        }
        // Set the months
//        String[] months = { "January", "February", "March", "April", "May", "June",
//            "July", "August", "September", "October", "November", "December" };
//        sMonthComboBox.removeAllItems();
//        sMonthComboBox.addItem(months);
        // Set the years
        yearComboBox.removeAllItems();
        for (int i = 2015; i <= 2020; i++) {
            yearComboBox.addItem(i);
        }
        // Set the hours
//        sHourComboBox.removeAllItems();
//        for (int i = 0; i <= 23; i++) {
//            sHourComboBox.addItem(i);
//        }
        // Set the minutes
        //sMinuteComboBox.removeAllItems();
//        for (int i = 10; i <= 55; i = i+5) {
//            sMinuteComboBox.addItem(i);
//        }

    }

    public void resetFields() {
        nameLabel.setForeground(Color.black);
        startDateLabel.setForeground(Color.black);
        isEdit = false;
        nameTextField.setText("");
        Calendar c = Calendar.getInstance();
        c.add(c.MINUTE, 5 - (c.get(c.MINUTE) % 5));
        dayComboBox.setSelectedIndex(c.get(c.DAY_OF_MONTH) - 1);
        monthComboBox.setSelectedIndex(c.get(c.MONTH));
        yearComboBox.setSelectedItem(c.get(c.YEAR));
        hourComboBox.setSelectedIndex(c.get(c.HOUR_OF_DAY));
        minuteComboBox.setSelectedItem(Integer.toString(c.get(c.MINUTE) - (c.get(c.MINUTE) % 5)));
        c.add(c.HOUR, 1);
        descriptionTextArea.setText("");
    }

    public void restoreFields(IAlarm al) {
        isEdit = true;
        alarmId = al.getId();
        nameTextField.setText(al.getAlarmName());
        Calendar c = al.getAlarm();
        dayComboBox.setSelectedIndex(c.get(c.DAY_OF_MONTH) - 1);
        monthComboBox.setSelectedIndex(c.get(c.MONTH));
        yearComboBox.setSelectedItem(c.get(c.YEAR));
        hourComboBox.setSelectedIndex(c.get(c.HOUR_OF_DAY));
        minuteComboBox.setSelectedItem(Integer.toString(c.get(c.MINUTE) - (c.get(c.MINUTE) % 5)));
        //c.add(c.HOUR, 1);
        descriptionTextArea.setText(al.getDescName());
    }

    public void addListener(PropertyChangeSupport pcs) {
        this.pcs = pcs;
    }

}
