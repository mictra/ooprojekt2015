/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.view;

import edu.chl.calendarplusplus.model.Contact;
import java.awt.Dimension;
import java.util.List;

/**
 *
 * @author cain
 */
public class ContactCard extends javax.swing.JPanel {

    /**
     * Creates new form ContactCard
     */
    public ContactCard() {
        initComponents();
        contactScrollPane.getVerticalScrollBar().setUnitIncrement(20);
    }
    
    public void updateContacts(List<Contact> contactlist){
        elementList.removeAll();
        elementList.setPreferredSize(new Dimension(684,500));
        elementList.setSize(684, 500);
        for (Contact c: contactlist) {
            ContactElement ce = new ContactElement(c);
            ce.setPreferredSize(new Dimension(400,119));
            elementList.add(ce);
            revalidate();
            repaint();
            revalidate();
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

        contactScrollPane = new javax.swing.JScrollPane();
        elementList = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(850, 710));

        contactScrollPane.setViewportView(elementList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contactScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contactScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane contactScrollPane;
    private javax.swing.JPanel elementList;
    // End of variables declaration//GEN-END:variables
}
