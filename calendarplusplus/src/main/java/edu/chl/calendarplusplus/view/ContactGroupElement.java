/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.view;

import edu.chl.calendarplusplus.model.IContact;
import edu.chl.calendarplusplus.model.IContactGroup;
import java.awt.Dimension;
import java.beans.PropertyChangeSupport;
import java.util.List;

/**
 *
 * @author cain
 */
public class ContactGroupElement extends javax.swing.JPanel {
    
    private boolean buttonPressed;
    private PropertyChangeSupport pcs;
    private final IContactGroup cg;
    
    /**
     * Creates new form ContactGroupElement
     */
    public ContactGroupElement(IContactGroup cg) {
        initComponents();
        this.cg = cg;
        nameLabel.setText(cg.getGroupName());
        setMembers(cg.getContacts());
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
        groupMemberList = new javax.swing.JPanel();
        membersLabel = new javax.swing.JLabel();
        removeButton = new javax.swing.JLabel();
        editButton = new javax.swing.JLabel();

        setBackground(new java.awt.Color(121, 134, 203));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        nameLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        nameLabel.setForeground(java.awt.Color.white);
        nameLabel.setText("#NAME");

        groupMemberList.setBackground(new java.awt.Color(121, 134, 203));
        groupMemberList.setPreferredSize(new java.awt.Dimension(296, 35));
        groupMemberList.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        membersLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 14)); // NOI18N
        membersLabel.setForeground(java.awt.Color.white);
        membersLabel.setText("Members:");

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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(membersLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(groupMemberList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(groupMemberList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(membersLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                pcs.firePropertyChange("EditContactGroupClicked", evt, cg);
            }
            if (evt.getSource() == removeButton) {
                pcs.firePropertyChange("RemovesContactGroupClicked", evt, cg);
            }
        }
    }//GEN-LAST:event_labelMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel editButton;
    private javax.swing.JPanel groupMemberList;
    private javax.swing.JLabel membersLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel removeButton;
    // End of variables declaration//GEN-END:variables

    public void addListener (PropertyChangeSupport pcs) {
        this.pcs = pcs;
    }
    
    private void setMembers(List<IContact> contacts) {
        groupMemberList.removeAll();
        groupMemberList.setPreferredSize(new Dimension(334,18));
        int counter = 0;
        for (IContact c : contacts) {
            ContactGroupElementLabel cgel = new ContactGroupElementLabel(c.getName());
            cgel.setPreferredSize(new Dimension(groupMemberList.getPreferredSize().width/2-10,18));
            groupMemberList.add(cgel);
            revalidate();
            repaint();
            revalidate();
            counter++;
            if (counter >= 3 && contacts.size() > 4) {
                    ContactGroupElementLabel cgel2 = new ContactGroupElementLabel("More...");
                    cgel2.setPreferredSize(new Dimension(groupMemberList.getPreferredSize().width/2-10,18));
                    groupMemberList.add(cgel2);
                    break;
            }
                
        }
    }
}
