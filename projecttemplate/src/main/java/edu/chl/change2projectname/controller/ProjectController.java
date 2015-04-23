package edu.chl.change2projectname.controller;

import edu.chl.change2projectname.model.Activity;
import edu.chl.change2projectname.model.CalendarPlus;
import edu.chl.change2projectname.model.Contact;
import edu.chl.change2projectname.view.ProjectView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JLabel;

public class ProjectController implements MouseListener, ActionListener {

    private final CalendarPlus cal;
    private final ProjectView projectView;
    private JLabel newActivityLabel;
    private JLabel listViewLabel;
    private JLabel addContactLabel;
    private JLabel addContactGroupLabel;
    private JLabel allContactsLabel;
    private JLabel allContactGroupsLabel;
    private JButton activityCardSave;
    private JButton activityCardCancel;
    private JButton contactGroupSave;
    private JButton contactGroupCancel;
    private JButton contactSave;
    private JButton contactCancel;
    
    public static ProjectController create(CalendarPlus cal, ProjectView projectView) {
        return new ProjectController(cal, projectView);
    }

    private ProjectController(CalendarPlus cal, ProjectView projectView) {
        this.cal = cal;
        this.projectView = projectView;
        initComponents();
        addListeners();
    }
    
    private void initComponents(){
        newActivityLabel = projectView.getNewActivityLabel();
        listViewLabel = projectView.getListViewLabel();
        addContactLabel = projectView.getAddContactLabel();
        addContactGroupLabel = projectView.getAddContactGroupLabel();
        allContactsLabel = projectView.getAllContactsLabel();
        allContactGroupsLabel = projectView.getAllContactGroupsLabel();
        activityCardSave = projectView.getActivityCard().getSaveButton();
        activityCardCancel = projectView.getActivityCard().getCancelButton();
        contactGroupSave = projectView.getContactGroupCard().getSaveButton();
        contactGroupCancel = projectView.getContactGroupCard().getCancelButton();
        contactSave = projectView.getContactCard().getSaveButton();
        contactCancel = projectView.getContactCard().getCancelButton();
    }
    
    private void addListeners(){
        newActivityLabel.addMouseListener(this);
        listViewLabel.addMouseListener(this);
        addContactLabel.addMouseListener(this);
        addContactGroupLabel.addMouseListener(this);
        allContactsLabel.addMouseListener(this);
        allContactGroupsLabel.addMouseListener(this);
        activityCardSave.addActionListener(this);
        activityCardCancel.addActionListener(this);
        contactGroupSave.addActionListener(this);
        contactGroupCancel.addActionListener(this);
        contactSave.addActionListener(this);
        contactCancel.addActionListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == newActivityLabel) {
            projectView.changeCard("AddActivityCard");
        } else if (e.getSource() == listViewLabel) {
            projectView.changeCard("ListViewCard");
            projectView.updateListView(cal.getActivityList());
        } else if (e.getSource() == addContactGroupLabel) {
            projectView.changeCard("AddContactGroupCard");
        } else if (e.getSource() == addContactLabel) {
            projectView.changeCard("AddContactCard");
        } else if (e.getSource() == allContactsLabel) {
            projectView.changeCard("ContactCard");
            projectView.updateContacts(cal.getAllContacts());
        } else if (e.getSource() == allContactGroupsLabel) {
            projectView.changeCard("ContactGroupCard");
            projectView.updateContactGroups(cal.getContactGroupList());
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == activityCardSave) {
            cal.addActivity(projectView.getActivityCard().getAsActivity());
        }
        if (e.getSource() == activityCardCancel) {
            for (Activity a : cal.getActivityList()) {
                System.out.println("Name: " + a.getName());
            }
        }
        if (e.getSource() == contactGroupSave) {
            cal.addContactGroup(projectView.getContactGroupCard().getAsContactGroup());
        }
        if(e.getSource() == contactSave){
            Contact contact = projectView.getContactCard().getAsContact();
            cal.getContactGroupList().get(0).addContact(contact);
        }
    }

}
