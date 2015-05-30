/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.view;

import edu.chl.calendarplusplus.model.Activity;
import edu.chl.calendarplusplus.model.IActivity;
import edu.chl.calendarplusplus.model.IContact;
import edu.chl.calendarplusplus.model.IContactManager;
import edu.chl.calendarplusplus.model.INotification;
import edu.chl.calendarplusplus.model.Notification;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;

/**
 *
 * @author cain
 */
public class AddActivityCard extends javax.swing.JPanel {

    public static void invalidParameters() {
        JOptionPane.showMessageDialog(null, "Invalid parameters (time and/or name)");
    }

    DefaultListModel attendeeListModel, nonAttendeeListModel;
    private final IContactManager conman;
    String lstring = "";
    private IActivity act;
    private boolean updateMode;
    
    /**
     * Creates new form AddActivityCard
     */
    public AddActivityCard(IContactManager conman) {
        initComponents();
        this.conman = conman;
        attendeeListModel = new DefaultListModel();
        nonAttendeeListModel = new DefaultListModel();
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
        sDayComboBox = new javax.swing.JComboBox();
        sMonthComboBox = new javax.swing.JComboBox();
        sYearComboBox = new javax.swing.JComboBox();
        sHourComboBox = new javax.swing.JComboBox();
        sMinuteComboBox = new javax.swing.JComboBox();
        endDateLabel = new javax.swing.JLabel();
        eDayComboBox = new javax.swing.JComboBox();
        eMonthComboBox = new javax.swing.JComboBox();
        eYearComboBox = new javax.swing.JComboBox();
        eHourComboBox = new javax.swing.JComboBox();
        eMinuteComboBox = new javax.swing.JComboBox();
        locationLabel = new javax.swing.JLabel();
        locationTextField = new javax.swing.JTextField();
        descriptionLabel = new javax.swing.JLabel();
        descriptionScrollPane = new javax.swing.JScrollPane();
        descriptionTextArea = new javax.swing.JTextArea();
        saveButton = new javax.swing.JLabel();
        cancelButton = new javax.swing.JLabel();
        notificationLabel = new javax.swing.JLabel();
        notificationComboBox = new javax.swing.JComboBox();
        attendeeLabel = new javax.swing.JLabel();
        attendeeScrollPane = new javax.swing.JScrollPane();
        attendeeList = new javax.swing.JList();
        addButton = new javax.swing.JLabel();
        removeButton = new javax.swing.JLabel();
        nonAttendeeScrollPane = new javax.swing.JScrollPane();
        nonAttendeeList = new javax.swing.JList();

        setPreferredSize(new java.awt.Dimension(600, 600));

        nameLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        nameLabel.setText("Name*");

        startDateLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        startDateLabel.setText("Startdate*");

        sDayComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1" }));

        sMonthComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        sYearComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2015" }));

        sHourComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        sMinuteComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55" }));

        endDateLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        endDateLabel.setText("Enddate*");

        eDayComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1" }));

        eMonthComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        eYearComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2015" }));

        eHourComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23" }));

        eMinuteComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "00", "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55" }));

        locationLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        locationLabel.setText("Location");

        descriptionLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        descriptionLabel.setText("Description");

        descriptionTextArea.setColumns(20);
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

        notificationLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        notificationLabel.setText("Notification");

        notificationComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "When activity starts", "5 minutes before", "10 minutes before", "15 minutes before", "30 minutes before", "60 minutes before" }));

        attendeeLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        attendeeLabel.setText("Attendees");

        attendeeList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        attendeeScrollPane.setViewportView(attendeeList);

        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arrowsLeft.png"))); // NOI18N
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                labelMouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addButtonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addButtonMouseEntered(evt);
            }
        });

        removeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arrowsRight.png"))); // NOI18N
        removeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                labelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                labelMouseReleased(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                removeButtonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                removeButtonMouseEntered(evt);
            }
        });

        nonAttendeeList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        nonAttendeeScrollPane.setViewportView(nonAttendeeList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startDateLabel)
                            .addComponent(endDateLabel)
                            .addComponent(locationLabel)
                            .addComponent(descriptionLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(eDayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(eMonthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(eYearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(eHourComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(eMinuteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(sDayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(sMonthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(sYearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(sHourComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(sMinuteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(nameTextField)
                                .addComponent(locationTextField))
                            .addComponent(descriptionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(notificationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(attendeeScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addButton)
                                    .addComponent(removeButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nonAttendeeScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cancelButton)
                                .addGap(18, 18, 18)
                                .addComponent(saveButton))))
                    .addComponent(notificationLabel)
                    .addComponent(attendeeLabel))
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
                    .addComponent(sDayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sMonthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sYearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sHourComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sMinuteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startDateLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eDayComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eMonthComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eYearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eHourComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eMinuteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endDateLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locationLabel)
                    .addComponent(locationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descriptionLabel)
                    .addComponent(descriptionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(notificationLabel)
                    .addComponent(notificationComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(attendeeLabel)
                            .addComponent(attendeeScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(nonAttendeeScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(addButton)
                        .addGap(28, 28, 28)
                        .addComponent(removeButton)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveButton)
                    .addComponent(cancelButton))
                .addGap(0, 19, Short.MAX_VALUE))
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
            if (evt.getSource() == saveButton) {
                if (updateMode) {
                    act.setName(nameTextField.getText());
                    act.setLocation(locationTextField.getText());
                    act.setDescription(descriptionTextArea.getText());
                    Calendar startDate = Calendar.getInstance();     
                    int sYear = (Integer) sYearComboBox.getSelectedItem();
                    int sMonth = sMonthComboBox.getSelectedIndex();
                    int sDay = sDayComboBox.getSelectedIndex()+1;
                    int sHour = Integer.parseInt((String) sHourComboBox.getSelectedItem());
                    int sMinute = Integer.parseInt((String) sMinuteComboBox.getSelectedItem());
                    startDate.set(sYear, sMonth, sDay, sHour, sMinute, 0);
                    startDate.set(startDate.MILLISECOND, 0);
                    act.setStartTime(startDate);
                    Calendar endDate = Calendar.getInstance();
                    int eYear = (Integer) eYearComboBox.getSelectedItem();
                    int eMonth = eMonthComboBox.getSelectedIndex();
                    int eDay = eDayComboBox.getSelectedIndex()+1;
                    int eHour = Integer.parseInt((String) eHourComboBox.getSelectedItem());
                    int eMinute = Integer.parseInt((String) eMinuteComboBox.getSelectedItem());
                    endDate.set(eYear, eMonth, eDay, eHour, eMinute, 0);
                    endDate.set(endDate.MILLISECOND, 0);
                    act.setEndTime(endDate);
                    act.removeAllAttendees();
                    for (int i = 0; i < attendeeList.getModel().getSize(); i++) {
                        act.addAttendee((IContact) attendeeList.getModel().getElementAt(i));
                    }                   
                    pcs.firePropertyChange("EditActivity", evt, act);
                    updateMode = false;
                    
                } else {
                    pcs.firePropertyChange("AddActivity", null, null);
                }
            }
            if (evt.getSource() == cancelButton) {
                
            }
            if (evt.getSource() == addButton) {
                if (nonAttendeeListModel.size() > 0 && !nonAttendeeList.isSelectionEmpty())
                    pcs.firePropertyChange("AddAttendee", null, null);
            }
            if (evt.getSource() == removeButton) {
                if (attendeeListModel.size() > 0 && !attendeeList.isSelectionEmpty())
                    pcs.firePropertyChange("RemoveAttendee", null, null);
            }
        }
    }//GEN-LAST:event_labelMouseReleased

    private void addButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseEntered
        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arrowsLeftHover.png")));
    }//GEN-LAST:event_addButtonMouseEntered

    private void addButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseExited
        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arrowsLeft.png")));
        buttonPressed = false;
    }//GEN-LAST:event_addButtonMouseExited

    private void removeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeButtonMouseEntered
        removeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arrowsRightHover.png")));
    }//GEN-LAST:event_removeButtonMouseEntered

    private void removeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeButtonMouseExited
        removeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arrowsRight.png")));
        buttonPressed = false;
    }//GEN-LAST:event_removeButtonMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addButton;
    private javax.swing.JLabel attendeeLabel;
    private javax.swing.JList attendeeList;
    private javax.swing.JScrollPane attendeeScrollPane;
    private javax.swing.JLabel cancelButton;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JScrollPane descriptionScrollPane;
    private javax.swing.JTextArea descriptionTextArea;
    private javax.swing.JComboBox eDayComboBox;
    private javax.swing.JComboBox eHourComboBox;
    private javax.swing.JComboBox eMinuteComboBox;
    private javax.swing.JComboBox eMonthComboBox;
    private javax.swing.JComboBox eYearComboBox;
    private javax.swing.JLabel endDateLabel;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JTextField locationTextField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JList nonAttendeeList;
    private javax.swing.JScrollPane nonAttendeeScrollPane;
    private javax.swing.JComboBox notificationComboBox;
    private javax.swing.JLabel notificationLabel;
    private javax.swing.JLabel removeButton;
    private javax.swing.JComboBox sDayComboBox;
    private javax.swing.JComboBox sHourComboBox;
    private javax.swing.JComboBox sMinuteComboBox;
    private javax.swing.JComboBox sMonthComboBox;
    private javax.swing.JComboBox sYearComboBox;
    private javax.swing.JLabel saveButton;
    private javax.swing.JLabel startDateLabel;
    // End of variables declaration//GEN-END:variables

    private PropertyChangeSupport pcs;
    private boolean buttonPressed;
    
    public IActivity getAsActivity(){
        //TODO: Handle errors when missing fields not in there... Maybe disable Save button?
        Calendar startDate = Calendar.getInstance();
        int sYear = (Integer) sYearComboBox.getSelectedItem();
        int sMonth = sMonthComboBox.getSelectedIndex();
        int sDay = sDayComboBox.getSelectedIndex()+1;
        int sHour = Integer.parseInt((String) sHourComboBox.getSelectedItem());
        int sMinute = Integer.parseInt((String) sMinuteComboBox.getSelectedItem());
        startDate.set(sYear, sMonth, sDay, sHour, sMinute, 0);
        startDate.set(startDate.MILLISECOND, 0);
        Calendar endDate = Calendar.getInstance();
        int eYear = (Integer) eYearComboBox.getSelectedItem();
        int eMonth = eMonthComboBox.getSelectedIndex();
        int eDay = eDayComboBox.getSelectedIndex()+1;
        int eHour = Integer.parseInt((String) eHourComboBox.getSelectedItem());
        int eMinute = Integer.parseInt((String) eMinuteComboBox.getSelectedItem());
        endDate.set(eYear, eMonth, eDay, eHour, eMinute, 0);
        endDate.set(endDate.MILLISECOND, 0);
        IActivity a = new Activity(startDate, endDate, nameTextField.getText(), locationTextField.getText(), descriptionTextArea.getText(), getAttendees());
        return a;
    }
    
    public INotification getAsNotification(IActivity act) {
        Calendar notDate = Calendar.getInstance();
        notDate.setTimeInMillis(act.getStartTime().getTimeInMillis());
        switch (notificationComboBox.getSelectedIndex()) {
            case 0: 
                return null;
            case 1: 
                break;
            case 2: notDate.add(notDate.MINUTE, -5);
                break;
            case 3: notDate.add(notDate.MINUTE, -10); 
                break;
            case 4: notDate.add(notDate.MINUTE, -15); 
                break;
            case 5: notDate.add(notDate.MINUTE, -30);
                break;
            case 6: notDate.add(notDate.MINUTE, -60);
                break;                
        }
        INotification inot = new Notification(notDate, act.getName(), act.getDescription(), act);
        return inot;
    }
            
    public List<IContact> getAttendees() {
        List<IContact> attendees = new ArrayList<>();
        for (int i = 0; i < attendeeList.getModel().getSize(); i++) {
            attendees.add((IContact) attendeeList.getModel().getElementAt(i));
        }
        return attendees;
    }
    
    /*
    public void registerListener(ProjectViewController controller){
        saveButton.addActionListener(controller);
        cancelButton.addActionListener(controller);
    }
    */
    
   
    private void initComboBoxes() {
        // Set the days
        sDayComboBox.removeAllItems();
        eDayComboBox.removeAllItems();
        for (int i = 1; i <= 31; i++) {
            sDayComboBox.addItem(i);
            eDayComboBox.addItem(i);
        }
        // Set the years
        sYearComboBox.removeAllItems();
        eYearComboBox.removeAllItems();
        for (int i = 2015; i <= 2020; i++) {
            sYearComboBox.addItem(i);
            eYearComboBox.addItem(i);
        }      
    }
    
    public void resetFields() {
        updateMode = false;
        nameTextField.setText("");
        Calendar c = Calendar.getInstance();
        c.add(c.MINUTE, 5 - (c.get(c.MINUTE) % 5));
        // ToDo - remove next line later
        c.add(c.HOUR_OF_DAY, 2);
        sDayComboBox.setSelectedIndex(c.get(c.DAY_OF_MONTH)-1);
        sMonthComboBox.setSelectedIndex(c.get(c.MONTH));
        sYearComboBox.setSelectedItem(c.get(c.YEAR));
        sHourComboBox.setSelectedIndex(c.get(c.HOUR_OF_DAY));
        sMinuteComboBox.setSelectedItem(Integer.toString(c.get(c.MINUTE) - (c.get(c.MINUTE) % 5)));
        c.add(c.HOUR, 1);
        eDayComboBox.setSelectedIndex(c.get(c.DAY_OF_MONTH)-1);
        eMonthComboBox.setSelectedIndex(c.get(c.MONTH));
        eYearComboBox.setSelectedItem(c.get(c.YEAR));
        eHourComboBox.setSelectedIndex(c.get(c.HOUR_OF_DAY));
        eMinuteComboBox.setSelectedItem(Integer.toString(c.get(c.MINUTE) - (c.get(c.MINUTE) % 5)));
        locationTextField.setText("");
        descriptionTextArea.setText("");
        notificationComboBox.setSelectedIndex(0);
        setLists();
    }

    public void addListener(PropertyChangeSupport pcs) {
        this.pcs = pcs;
    }

    public void addAttendee() {
        attendeeListModel.addElement(nonAttendeeList.getSelectedValue());
        nonAttendeeListModel.remove(nonAttendeeList.getSelectedIndex());
    }

    public void removeAttendee() {
        nonAttendeeListModel.addElement(attendeeList.getSelectedValue());
        attendeeListModel.remove(attendeeList.getSelectedIndex());
    }
    
    private void setLists() {
        //Set the available contacts
        nonAttendeeList.removeAll();
        nonAttendeeListModel.removeAllElements();
        for (IContact c : conman.getAllContacts()) {
            nonAttendeeListModel.addElement(c);
            if (lstring.length() < c.getName().length())
                lstring = c.getName();
        }
        nonAttendeeList.setModel(nonAttendeeListModel);
        nonAttendeeList.setPrototypeCellValue(lstring+ "        ");
        nonAttendeeScrollPane.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
        
        //Set the chosen contacts
        attendeeList.removeAll();
        attendeeListModel.removeAllElements();
        attendeeList.setModel(attendeeListModel);
        attendeeList.setPrototypeCellValue(lstring+ "        ");
        attendeeScrollPane.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
    }

    void editActivity(IActivity act) {
        this.act = act;
        updateMode = true;
        
        nameTextField.setText(act.getName());
        locationTextField.setText(act.getLocation());
        descriptionTextArea.setText(act.getDescription());
        
        Calendar c = Calendar.getInstance();
        c.setTimeInMillis(act.getStartTime().getTimeInMillis());
        sDayComboBox.setSelectedIndex(c.get(c.DAY_OF_MONTH)-1);
        sMonthComboBox.setSelectedIndex(c.get(c.MONTH));
        sYearComboBox.setSelectedItem(c.get(c.YEAR));
        sHourComboBox.setSelectedIndex(c.get(c.HOUR_OF_DAY));
        sMinuteComboBox.setSelectedIndex(c.get(c.MINUTE) / 5);
        c.setTimeInMillis(act.getEndTime().getTimeInMillis());
        eDayComboBox.setSelectedIndex(c.get(c.DAY_OF_MONTH)-1);
        eMonthComboBox.setSelectedIndex(c.get(c.MONTH));
        eYearComboBox.setSelectedItem(c.get(c.YEAR));
        eHourComboBox.setSelectedIndex(c.get(c.HOUR_OF_DAY));
        eMinuteComboBox.setSelectedIndex(c.get(c.MINUTE) / 5);
        

        attendeeList.removeAll();
        attendeeListModel.removeAllElements();
        nonAttendeeList.removeAll();
        nonAttendeeListModel.removeAllElements();
        
        lstring = "";
        
        for (IContact cont: conman.getAllContacts()) {
            if (act.hasContact(cont)) {
                attendeeListModel.addElement(cont);
            } else {
                nonAttendeeListModel.addElement(cont);
            }
            if (lstring.length() < cont.getName().length())
                lstring = cont.getName();
        }
        
        attendeeList.setModel(attendeeListModel);
        attendeeList.setPrototypeCellValue(lstring+ "        ");
        attendeeScrollPane.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
        nonAttendeeList.setModel(nonAttendeeListModel);
        nonAttendeeList.setPrototypeCellValue(lstring+ "        ");
        nonAttendeeScrollPane.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
        
    }

}