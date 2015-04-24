/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.change2projectname.view;

import edu.chl.change2projectname.model.Activity;
import edu.chl.change2projectname.model.CalendarPlus;
import edu.chl.change2projectname.model.Contact;
import edu.chl.change2projectname.model.ContactGroup;
import edu.chl.change2projectname.model.Project;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JLabel;

/**
 *
 * @author cain
 */
public class ProjectView extends javax.swing.JFrame {
    private CalendarPlus cal;

    /**
     * Creates new form ProjectView
     */
    public ProjectView() {
        initComponents();
        tweekingInitComponents();
    }

    public ProjectView(Project project, CalendarPlus cal) {
        initComponents();
        this.cal = cal;
        tweekingInitComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainLayeredPane = new javax.swing.JLayeredPane();
        menuPanel = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        logoSeparator = new javax.swing.JSeparator();
        menuCalendarLabel = new javax.swing.JLabel();
        menuCalendarPanel = new javax.swing.JPanel();
        newActivityLabel = new javax.swing.JLabel();
        listViewLabel = new javax.swing.JLabel();
        weekViewLabel = new javax.swing.JLabel();
        monthViewLabel = new javax.swing.JLabel();
        menuContactsLabel = new javax.swing.JLabel();
        menuContactsPanel = new javax.swing.JPanel();
        addContactLabel = new javax.swing.JLabel();
        addContactGroupLabel = new javax.swing.JLabel();
        allContactsLabel = new javax.swing.JLabel();
        allContactGroupsLabel = new javax.swing.JLabel();
        menuSettingsLabel = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        mainPanel = new javax.swing.JPanel();
        topPanel = new javax.swing.JPanel();
        headlineLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainLayeredPane.setPreferredSize(new java.awt.Dimension(1270, 750));

        menuPanel.setBackground(new java.awt.Color(63, 81, 181));
        menuPanel.setPreferredSize(new java.awt.Dimension(300, 700));

        logoLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 24)); // NOI18N
        logoLabel.setForeground(new java.awt.Color(255, 255, 255));
        logoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoLabel.setText("Kalender++_logo");

        menuCalendarLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 24)); // NOI18N
        menuCalendarLabel.setForeground(new java.awt.Color(255, 255, 255));
        menuCalendarLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arrow_down.png"))); // NOI18N
        menuCalendarLabel.setText("Calendar");
        menuCalendarLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuCalendarLabelMousePressed(evt);
            }
        });

        menuCalendarPanel.setBackground(new java.awt.Color(63, 81, 181));

        newActivityLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        newActivityLabel.setForeground(java.awt.Color.white);
        newActivityLabel.setText("Add an activity");

        listViewLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        listViewLabel.setForeground(java.awt.Color.white);
        listViewLabel.setText("Listview");

        weekViewLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        weekViewLabel.setForeground(java.awt.Color.white);
        weekViewLabel.setText("Weekview");

        monthViewLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        monthViewLabel.setForeground(java.awt.Color.white);
        monthViewLabel.setText("Monthview");

        javax.swing.GroupLayout menuCalendarPanelLayout = new javax.swing.GroupLayout(menuCalendarPanel);
        menuCalendarPanel.setLayout(menuCalendarPanelLayout);
        menuCalendarPanelLayout.setHorizontalGroup(
            menuCalendarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuCalendarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuCalendarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newActivityLabel)
                    .addComponent(listViewLabel)
                    .addComponent(weekViewLabel)
                    .addComponent(monthViewLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuCalendarPanelLayout.setVerticalGroup(
            menuCalendarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuCalendarPanelLayout.createSequentialGroup()
                .addComponent(newActivityLabel)
                .addGap(18, 18, 18)
                .addComponent(listViewLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(weekViewLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(monthViewLabel))
        );

        menuContactsLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 24)); // NOI18N
        menuContactsLabel.setForeground(java.awt.Color.white);
        menuContactsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arrow_down.png"))); // NOI18N
        menuContactsLabel.setText("Contacts");
        menuContactsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuContactsLabelMousePressed(evt);
            }
        });

        menuContactsPanel.setBackground(new java.awt.Color(63, 81, 181));

        addContactLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        addContactLabel.setForeground(java.awt.Color.white);
        addContactLabel.setText("Add new contact");

        addContactGroupLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        addContactGroupLabel.setForeground(java.awt.Color.white);
        addContactGroupLabel.setText("Add new group");

        allContactsLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        allContactsLabel.setForeground(java.awt.Color.white);
        allContactsLabel.setText("All contacts");

        allContactGroupsLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 18)); // NOI18N
        allContactGroupsLabel.setForeground(java.awt.Color.white);
        allContactGroupsLabel.setText("All contactgroups");

        javax.swing.GroupLayout menuContactsPanelLayout = new javax.swing.GroupLayout(menuContactsPanel);
        menuContactsPanel.setLayout(menuContactsPanelLayout);
        menuContactsPanelLayout.setHorizontalGroup(
            menuContactsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuContactsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuContactsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addContactLabel)
                    .addComponent(addContactGroupLabel)
                    .addComponent(allContactsLabel)
                    .addComponent(allContactGroupsLabel))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        menuContactsPanelLayout.setVerticalGroup(
            menuContactsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuContactsPanelLayout.createSequentialGroup()
                .addComponent(addContactLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addContactGroupLabel)
                .addGap(18, 18, 18)
                .addComponent(allContactsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(allContactGroupsLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuSettingsLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 24)); // NOI18N
        menuSettingsLabel.setForeground(java.awt.Color.white);
        menuSettingsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arrow_right.png"))); // NOI18N
        menuSettingsLabel.setText("Settings");
        menuSettingsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuSettingsLabelMousePressed(evt);
            }
        });

        searchTextField.setText("Search...");

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logoLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                            .addComponent(logoSeparator, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(menuCalendarPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(menuPanelLayout.createSequentialGroup()
                                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(menuCalendarLabel)
                                    .addComponent(menuContactsLabel))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(menuSettingsLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(searchTextField))
                    .addGroup(menuPanelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(menuContactsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuCalendarLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuCalendarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menuContactsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuContactsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menuSettingsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainPanel.setBackground(new java.awt.Color(187, 222, 251));
        mainPanel.setLayout(new java.awt.CardLayout());

        topPanel.setBackground(new java.awt.Color(165, 214, 167));

        headlineLabel.setFont(new java.awt.Font("Source Sans Pro", 1, 36)); // NOI18N
        headlineLabel.setText("Headline");

        javax.swing.GroupLayout topPanelLayout = new javax.swing.GroupLayout(topPanel);
        topPanel.setLayout(topPanelLayout);
        topPanelLayout.setHorizontalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topPanelLayout.createSequentialGroup()
                .addComponent(headlineLabel)
                .addGap(0, 845, Short.MAX_VALUE))
        );
        topPanelLayout.setVerticalGroup(
            topPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headlineLabel)
        );

        javax.swing.GroupLayout mainLayeredPaneLayout = new javax.swing.GroupLayout(mainLayeredPane);
        mainLayeredPane.setLayout(mainLayeredPaneLayout);
        mainLayeredPaneLayout.setHorizontalGroup(
            mainLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayeredPaneLayout.createSequentialGroup()
                .addComponent(menuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(topPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainLayeredPaneLayout.setVerticalGroup(
            mainLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainLayeredPaneLayout.createSequentialGroup()
                .addComponent(topPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(menuPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        mainLayeredPane.setLayer(menuPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mainLayeredPane.setLayer(mainPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        mainLayeredPane.setLayer(topPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainLayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuCalendarLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCalendarLabelMousePressed
        // TODO add your handling code here:
        if (menuCalendarPanel.isVisible()) {
            menuCalendarPanel.setVisible(false);
            menuCalendarLabel.setIcon((new javax.swing.ImageIcon(getClass().getResource("/arrow_right.png"))));
        } else {
            menuCalendarPanel.setVisible(true);
            menuCalendarLabel.setIcon((new javax.swing.ImageIcon(getClass().getResource("/arrow_down.png"))));
            headlineLabel.setText("Calendar // #SUBSECTION");
            menuContactsPanel.setVisible(false);
            menuContactsLabel.setIcon((new javax.swing.ImageIcon(getClass().getResource("/arrow_right.png"))));
        }

    }//GEN-LAST:event_menuCalendarLabelMousePressed

    private void menuContactsLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuContactsLabelMousePressed
        // TODO add your handling code here:
        if (menuContactsPanel.isVisible()) {
            menuContactsPanel.setVisible(false);
            menuContactsLabel.setIcon((new javax.swing.ImageIcon(getClass().getResource("/arrow_right.png"))));
        } else {
            menuContactsPanel.setVisible(true);
            menuContactsLabel.setIcon((new javax.swing.ImageIcon(getClass().getResource("/arrow_down.png"))));
            headlineLabel.setText("Contacts // #SUBSECTION");
            menuCalendarPanel.setVisible(false);
            menuCalendarLabel.setIcon((new javax.swing.ImageIcon(getClass().getResource("/arrow_right.png"))));
        }
    }//GEN-LAST:event_menuContactsLabelMousePressed

    private void menuSettingsLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSettingsLabelMousePressed
        // TODO add your handling code here:
        menuContactsPanel.setVisible(false);
        menuContactsLabel.setIcon((new javax.swing.ImageIcon(getClass().getResource("/arrow_right.png"))));
        menuCalendarPanel.setVisible(false);
        menuCalendarLabel.setIcon((new javax.swing.ImageIcon(getClass().getResource("/arrow_right.png"))));
        headlineLabel.setText("Settings");
    }//GEN-LAST:event_menuSettingsLabelMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProjectView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjectView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjectView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjectView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjectView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addContactGroupLabel;
    private javax.swing.JLabel addContactLabel;
    private javax.swing.JLabel allContactGroupsLabel;
    private javax.swing.JLabel allContactsLabel;
    private javax.swing.JLabel headlineLabel;
    private javax.swing.JLabel listViewLabel;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JSeparator logoSeparator;
    private javax.swing.JLayeredPane mainLayeredPane;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel menuCalendarLabel;
    private javax.swing.JPanel menuCalendarPanel;
    private javax.swing.JLabel menuContactsLabel;
    private javax.swing.JPanel menuContactsPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JLabel menuSettingsLabel;
    private javax.swing.JLabel monthViewLabel;
    private javax.swing.JLabel newActivityLabel;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JPanel topPanel;
    private javax.swing.JLabel weekViewLabel;
    // End of variables declaration//GEN-END:variables

    // Non-generated variables declaration
    private CardLayout tabCards;
    private AddActivityCard addActivity = new AddActivityCard();
    private AddContactGroupCard addContactGroup = new AddContactGroupCard();
    private AddContactCard addContact;
    private ListViewCard listView = new ListViewCard();
    private ContactGroupCard contactGroups = new ContactGroupCard();
    private ContactCard contacts = new ContactCard();

    // Non-generated variables end
    public JLabel getNewActivityLabel() {
        return this.newActivityLabel;
    }

    public JLabel getListViewLabel() {
        return this.listViewLabel;
    }

    public JLabel getAddContactGroupLabel() {
        return this.addContactGroupLabel;
    }

    public JLabel getAddContactLabel() {
        return this.addContactLabel;
    }
    
    public JLabel getAllContactsLabel() {
        return this.allContactsLabel;
    }
    
    public JLabel getAllContactGroupsLabel() {
        return this.allContactGroupsLabel;
    }

    public AddActivityCard getActivityCard() {
        return addActivity;
    }

    public AddContactGroupCard getContactGroupCard() {
        return addContactGroup;
    }

    public AddContactCard getContactCard() {
        return addContact;
    }

    /* Maybe use this to add listener?
    public void registerListener(ProjectController controller) {
        newActivityLabel.addMouseListener(controller);
        listViewLabel.addMouseListener(controller);
        addContactGroupLabel.addMouseListener(controller);
        addContactLabel.addMouseListener(controller);
        allContactsLabel.addMouseListener(controller);
        addActivity.registerListener(controller);
        addContact.registerListener(controller);
        addContactGroup.registerListener(controller);
    }
    */

    private void tweekingInitComponents() {
        addContact = new AddContactCard(cal);
        mainLayeredPane.setPreferredSize(new Dimension(1270, 750));
        mainLayeredPane.setSize(new Dimension(1270, 750));

        menuContactsPanel.setVisible(false);
        menuContactsLabel.setIcon((new javax.swing.ImageIcon(getClass().getResource("/arrow_right.png"))));
        headlineLabel.setText("Calendar // #SUBSECTION");

        tabCards = (CardLayout) mainPanel.getLayout();
        mainPanel.add(addActivity, "AddActivityCard");
        mainPanel.add(addContactGroup, "AddContactGroupCard");
        mainPanel.add(addContact, "AddContactCard");
        mainPanel.add(listView, "ListViewCard");
        mainPanel.add(contactGroups, "ContactGroupCard");
        mainPanel.add(contacts, "ContactCard");
        tabCards.show(mainPanel, "ListViewCard");
    }

    public void changeCard(String card) {
        if (card.equals("AddActivityCard")) {
            headlineLabel.setText("Add an activity");
            addActivity.resetFields();
        } else if (card.equals("AddContactGroupCard")) {
            headlineLabel.setText("Add a contactgroup");
            addContactGroup.resetFields();
        } else if (card.equals("AddContactCard")) {
            headlineLabel.setText("Add a contact");
            addContact.resetFields();
        } else if (card.equals("ListViewCard")) {
            headlineLabel.setText("Calendar // Listview");
        } else if (card.endsWith("ContactGroupCard")) {
            headlineLabel.setText("Contactgroups");
        } else if (card.endsWith("ContactCard")) {
            headlineLabel.setText("Contacts");
        }
        tabCards.show(mainPanel, card);
    }

    public void updateListView(List<Activity> activityList) {
        listView.updateListView(activityList);
    }
    
    public void updateContactGroups(List<ContactGroup> contactgroups) {
        contactGroups.updateContactGroups(contactgroups);
    }
    
    public void updateContacts(List<Contact> contactlist) {
        contacts.updateContacts(contactlist);
    }
}
