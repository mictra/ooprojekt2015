package edu.chl.calendarplusplus.controller;

import edu.chl.calendarplusplus.model.CalendarPlus;
import edu.chl.calendarplusplus.view.ProjectView;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

public class ProjectViewController implements MouseListener {

    private final CalendarPlus cal;
    private final ProjectView projectView;
    private JLabel newActivityLabel;
    private JLabel listViewLabel;
    private JLabel addContactLabel;
    private JLabel addContactGroupLabel;
    private JLabel allContactsLabel;
    private JLabel allContactGroupsLabel;

    public static ProjectViewController create(CalendarPlus cal, ProjectView projectView) {
        return new ProjectViewController(cal, projectView);
    }

    private ProjectViewController(CalendarPlus cal, ProjectView projectView) {
        this.cal = cal;
        this.projectView = projectView;
        initComponents();
        addListeners();
    }

    private void initComponents() {
        newActivityLabel = projectView.getNewActivityLabel();
        listViewLabel = projectView.getListViewLabel();
        addContactLabel = projectView.getAddContactLabel();
        addContactGroupLabel = projectView.getAddContactGroupLabel();
        allContactsLabel = projectView.getAllContactsLabel();
        allContactGroupsLabel = projectView.getAllContactGroupsLabel();
    }

    private void addListeners() {
        newActivityLabel.addMouseListener(this);
        listViewLabel.addMouseListener(this);
        addContactLabel.addMouseListener(this);
        addContactGroupLabel.addMouseListener(this);
        allContactsLabel.addMouseListener(this);
        allContactGroupsLabel.addMouseListener(this);
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

}