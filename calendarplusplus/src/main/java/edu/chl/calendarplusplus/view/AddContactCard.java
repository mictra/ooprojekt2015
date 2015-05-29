/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.view;

import edu.chl.calendarplusplus.model.CalendarPlus;
import edu.chl.calendarplusplus.model.Contact;
import edu.chl.calendarplusplus.model.IContact;
import edu.chl.calendarplusplus.model.IContactGroup;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;

/**
 *
 * @author cain
 */
public class AddContactCard extends javax.swing.JPanel {

    private final CalendarPlus cal;
    private boolean updateMode;
    DefaultListModel nonMemberListModel, memberListModel;
    String lstring = "";
    private IContact c;

    /**
     * Creates new form AddContactCard
     *
     * @param cal
     */
    public AddContactCard(CalendarPlus cal) {
        initComponents();
        this.cal = cal;
        nonMemberListModel = new DefaultListModel();
        memberListModel = new DefaultListModel();
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
        emailLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JLabel();
        phoneTextField = new javax.swing.JTextField();
        nonMemberScrollPane = new javax.swing.JScrollPane();
        nonMemberList = new javax.swing.JList();
        chooseGroupLabel = new javax.swing.JLabel();
        memberScrollPane = new javax.swing.JScrollPane();
        memberList = new javax.swing.JList();
        saveButton = new javax.swing.JLabel();
        cancelButton = new javax.swing.JLabel();
        addButton = new javax.swing.JLabel();
        removeButton = new javax.swing.JLabel();

        nameLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        nameLabel.setText("Name*");

        emailLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        emailLabel.setText("Email");

        phoneLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        phoneLabel.setText("Phone");

        nonMemberList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        nonMemberList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        nonMemberScrollPane.setViewportView(nonMemberList);

        chooseGroupLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        chooseGroupLabel.setText("Choose group");

        memberList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        memberList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        memberScrollPane.setViewportView(memberList);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chooseGroupLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(memberScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(removeButton)
                                    .addComponent(addButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nonMemberScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cancelButton)
                                .addGap(18, 18, 18)
                                .addComponent(saveButton)))))
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
                    .addComponent(emailLabel)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel)
                    .addComponent(phoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nonMemberScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chooseGroupLabel)
                            .addComponent(memberScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(addButton)
                        .addGap(29, 29, 29)
                        .addComponent(removeButton)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelButton)
                    .addComponent(saveButton))
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

    private void labelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMousePressed
        buttonPressed = true;
    }//GEN-LAST:event_labelMousePressed

    private void labelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMouseReleased
        if (buttonPressed) {
            if (evt.getSource() == saveButton) {
                if (updateMode) {
                    c.setName(nameTextField.getText());
                    c.setEmail(emailTextField.getText());
                    c.setPhone(phoneTextField.getText());
                    pcs.firePropertyChange("EditContact", evt, c);
                    updateMode = false;
                } else {
                    pcs.firePropertyChange("AddContact", null, null);
                }
                
            }
            if (evt.getSource() == cancelButton) {
                pcs.firePropertyChange("BackToContacts", null, null);
            }
            if (evt.getSource() == addButton) {
                if (nonMemberListModel.size() > 0 && !nonMemberList.isSelectionEmpty())
                    pcs.firePropertyChange("AddContactCardAddGroup", null, null);
            }
            if (evt.getSource() == removeButton) {
                if (memberListModel.size() > 0 && !memberList.isSelectionEmpty())
                    pcs.firePropertyChange("AddContactCardRemoveGroup", null, null);
            }
        }
    }//GEN-LAST:event_labelMouseReleased

    private void cancelButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseEntered
        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cancelButtonHover.png")));
    }//GEN-LAST:event_cancelButtonMouseEntered

    private void cancelButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseExited
        cancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cancelButton.png")));
        buttonPressed = false;
    }//GEN-LAST:event_cancelButtonMouseExited

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
    private javax.swing.JLabel cancelButton;
    private javax.swing.JLabel chooseGroupLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JList memberList;
    private javax.swing.JScrollPane memberScrollPane;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JList nonMemberList;
    private javax.swing.JScrollPane nonMemberScrollPane;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneTextField;
    private javax.swing.JLabel removeButton;
    private javax.swing.JLabel saveButton;
    // End of variables declaration//GEN-END:variables

    private PropertyChangeSupport pcs;
    private boolean buttonPressed;

    public IContact getAsContact() {
        return new Contact(nameTextField.getText(), phoneTextField.getText(), emailTextField.getText());
    }

    public List<IContactGroup> getContactGroups() {
        List<IContactGroup> contactGroups = new ArrayList<>();
        if (memberList.getModel().getSize() == 0) {
            contactGroups.add(cal.getContactGroupByName("Default"));
        } else {
            for (int i = 0; i < memberList.getModel().getSize(); i++) {
                contactGroups.add((IContactGroup) memberList.getModel().getElementAt(i));
            }
        }
        return contactGroups;
    }

    public void resetFields() {
        nameTextField.setText("");
        emailTextField.setText("");
        phoneTextField.setText("");

        // Set the non-member groups
        nonMemberList.removeAll();
        nonMemberListModel.removeAllElements();
        for (IContactGroup cg : cal.getContactGroupList()) {
            if (!cg.getGroupName().equals("Default")) {
                nonMemberListModel.addElement(cg);
            }
            if (lstring.length() < cg.getGroupName().length()) {
                lstring = cg.getGroupName();
            }
        }
        nonMemberList.setModel(nonMemberListModel);
        nonMemberList.setPrototypeCellValue(lstring + "     ");
        nonMemberScrollPane.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);

        //Set the member groups (empty list from start)
        memberList.removeAll();
        memberListModel.removeAllElements();
        memberList.setModel(memberListModel);
        memberList.setPrototypeCellValue(lstring + "     ");
        memberScrollPane.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);

    }

    public void addMemberGroup() {
        //Check if an item in the list is actually selected, otherwise error
        if (nonMemberList.getSelectedIndex() >= 0) {
            memberListModel.addElement((IContactGroup) nonMemberList.getSelectedValue());
            nonMemberListModel.remove(nonMemberList.getSelectedIndex());
        }
    }

    public void removeMemberGroup() {
        if (memberList.getSelectedIndex() >= 0) {
            nonMemberListModel.addElement((IContactGroup) memberList.getSelectedValue());
            memberListModel.remove(memberList.getSelectedIndex());
        }
    }

    public void addListener(PropertyChangeSupport pcs) {
        this.pcs = pcs;
    }

    void editContact(IContact c) {
        this.c = c;
        updateMode = true;
        nameTextField.setText(c.getName());
        emailTextField.setText(c.getEmail());
        phoneTextField.setText(c.getPhone());
        
       
        //Set the groups
        memberList.removeAll();
        memberListModel.removeAllElements();
        nonMemberList.removeAll();
        nonMemberListModel.removeAllElements();
        
        for (IContactGroup cg : cal.getContactGroupList()) {
            if (cg.hasContact(c)) {
                if (!cg.getGroupName().equals("Default"))
                    memberListModel.addElement(cg);
            } else {
                nonMemberListModel.addElement(cg);
            }
            if (lstring.length() < cg.getGroupName().length()) {
                lstring = cg.getGroupName();
            }
        }
        
        memberList.setModel(memberListModel);
        memberList.setPrototypeCellValue(lstring + "     ");
        memberScrollPane.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
        nonMemberList.setModel(nonMemberListModel);
        nonMemberList.setPrototypeCellValue(lstring + "     ");
        nonMemberScrollPane.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
    }

}
