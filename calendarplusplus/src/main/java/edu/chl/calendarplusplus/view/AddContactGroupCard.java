/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.view;

import edu.chl.calendarplusplus.model.CalendarPlus;
import edu.chl.calendarplusplus.model.ContactGroup;
import edu.chl.calendarplusplus.model.IContact;
import edu.chl.calendarplusplus.model.IContactGroup;
import edu.chl.calendarplusplus.model.IContactManager;
import java.beans.PropertyChangeSupport;
import javax.swing.DefaultListModel;
import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;

/**
 *
 * @author cain
 */
public class AddContactGroupCard extends javax.swing.JPanel {

    DefaultListModel memberListModel, nonMemberListModel;
    private CalendarPlus cal;
    String lstring = "";
    private boolean updateMode = false;
    private IContactGroup cg;
    
    /**
     * Creates new form AddContactGroupCard
     */
    public AddContactGroupCard(CalendarPlus cal) {
        initComponents();
        this.cal = cal;
        memberListModel = new DefaultListModel();
        nonMemberListModel = new DefaultListModel();
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
        saveButton = new javax.swing.JLabel();
        cancelButton = new javax.swing.JLabel();
        membersLabel = new javax.swing.JLabel();
        memberScrollPane = new javax.swing.JScrollPane();
        memberList = new javax.swing.JList();
        addButton = new javax.swing.JLabel();
        removeButton = new javax.swing.JLabel();
        nonMemberScrollPane = new javax.swing.JScrollPane();
        nonMemberList = new javax.swing.JList();

        nameLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        nameLabel.setText("Name*");

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

        membersLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        membersLabel.setText("Groupmembers");

        memberList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        memberScrollPane.setViewportView(memberList);

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

        nonMemberList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        nonMemberScrollPane.setViewportView(nonMemberList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(membersLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(memberScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addButton)
                                    .addComponent(removeButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nonMemberScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cancelButton)
                                .addGap(18, 18, 18)
                                .addComponent(saveButton)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(membersLabel)
                            .addComponent(memberScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(nonMemberScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(addButton)
                        .addGap(28, 28, 28)
                        .addComponent(removeButton)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveButton)
                    .addComponent(cancelButton))
                .addContainerGap(13, Short.MAX_VALUE))
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
                    cg.setGroupName(nameTextField.getText());
                    cg.removeAllContacts();
                    for (int i = 0; i < memberList.getModel().getSize(); i++) {
                        cg.addContact((IContact) memberList.getModel().getElementAt(i));
                    }
                    pcs.firePropertyChange("EditContactGroup", evt, cg);
                } else {
                    pcs.firePropertyChange("AddContactGroup", null, null);
                }
            }
            if (evt.getSource() == cancelButton) {
                pcs.firePropertyChange("BackToContactGroups", evt, cg);
                
            }
            if (evt.getSource() == addButton) {
                if (nonMemberListModel.size() > 0 && !nonMemberList.isSelectionEmpty())
                    pcs.firePropertyChange("AddContactGroupCardAddMember", null, null);
            }
            if (evt.getSource() == removeButton) {
                if (memberListModel.size() > 0 && !memberList.isSelectionEmpty())
                    pcs.firePropertyChange("AddContactGroupCardRemoveMember", null, null);
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
    private javax.swing.JLabel cancelButton;
    private javax.swing.JList memberList;
    private javax.swing.JScrollPane memberScrollPane;
    private javax.swing.JLabel membersLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JList nonMemberList;
    private javax.swing.JScrollPane nonMemberScrollPane;
    private javax.swing.JLabel removeButton;
    private javax.swing.JLabel saveButton;
    // End of variables declaration//GEN-END:variables

    private PropertyChangeSupport pcs;
    private boolean buttonPressed;
    
    /*
    public void registerListener(ProjectViewController controller){
        saveButton.addActionListener(controller);
        cancelButton.addActionListener(controller);
    }
    */

    public IContactGroup getAsContactGroup() {
        ContactGroup cg = new ContactGroup(nameTextField.getText());
        for (int i = 0; i < memberList.getModel().getSize(); i++) {
            cg.addContact((IContact) memberList.getModel().getElementAt(i));
        }
        return cg;
    }
    
    public void resetFields() {
        updateMode = false;
        nameTextField.setText("");
        setLists();
    }
    
    public void addListener(PropertyChangeSupport pcs) {
        this.pcs = pcs;
    }

    private void setLists() {
        //Set the available contacts
        nonMemberList.removeAll();
        nonMemberListModel.removeAllElements();
        for (IContact c : cal.getContactManager().getAllContacts()) {
            nonMemberListModel.addElement(c);
            if (lstring.length() < c.getName().length())
                lstring = c.getName();
        }
        nonMemberList.setModel(nonMemberListModel);
        nonMemberList.setPrototypeCellValue(lstring+ "     ");
        nonMemberScrollPane.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
        
        //Set the chosen contacts
        memberList.removeAll();
        memberListModel.removeAllElements();
        memberList.setModel(memberListModel);
        memberList.setPrototypeCellValue(lstring+ "     ");
        memberScrollPane.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
    }

    public void addMember() {
        memberListModel.addElement(nonMemberList.getSelectedValue());
        nonMemberListModel.remove(nonMemberList.getSelectedIndex());
    }

    public void removeMember() {
        nonMemberListModel.addElement(memberList.getSelectedValue());
        memberListModel.remove(memberList.getSelectedIndex());
    }

    void editContactGroup(IContactGroup cg) {
        updateMode = true;
        this.cg = cg;
        nameTextField.setText(cg.getGroupName());
        
        
        //Set the chosen contacts
        memberList.removeAll();
        memberListModel.removeAllElements();
        nonMemberList.removeAll();
        nonMemberListModel.removeAllElements();
        
        for (IContact c: cal.getContactManager().getAllContacts()) {
            if (cg.hasContact(c)) {
                memberListModel.addElement(c);
            } else {
                nonMemberListModel.addElement(c);
            }
        }
        
        memberList.setModel(memberListModel);
        memberList.setPrototypeCellValue(lstring+ "     ");
        memberScrollPane.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
        nonMemberList.setModel(nonMemberListModel);
        nonMemberList.setPrototypeCellValue(lstring+ "     ");
        nonMemberScrollPane.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);
    }

}
