package edu.chl.calendarplusplus.controller;

import edu.chl.calendarplusplus.model.CalendarPlus;
import edu.chl.calendarplusplus.model.ICalendarPlus;
import edu.chl.calendarplusplus.view.ProjectView;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

public class ProjectViewController implements MouseListener {

    private final ICalendarPlus cal;
    private final ProjectView projectView;
    private JLabel newActivityLabel;
    private JLabel listViewLabel;
    private JLabel weekViewLabel;
    private JLabel addContactLabel;
    private JLabel addContactGroupLabel;
    private JLabel addAlarmLabel;
    private JLabel allContactsLabel;
    private JLabel allContactGroupsLabel; 
    private JLabel allAlarmsLabel;

    public static ProjectViewController create(ICalendarPlus cal, ProjectView projectView) {
        return new ProjectViewController(cal, projectView);
    }

    private ProjectViewController(ICalendarPlus cal, ProjectView projectView) {
        this.cal = cal;
        this.projectView = projectView;
        initComponents();
        addListeners();
    }

    private void initComponents() {
        newActivityLabel = projectView.getNewActivityLabel();
        listViewLabel = projectView.getListViewLabel();
        weekViewLabel = projectView.getWeekViewLabel();
        addContactLabel = projectView.getAddContactLabel();
        addContactGroupLabel = projectView.getAddContactGroupLabel();
        addAlarmLabel = projectView.getAddAlarmLabel();
        allContactsLabel = projectView.getAllContactsLabel();
        allContactGroupsLabel = projectView.getAllContactGroupsLabel();
        allAlarmsLabel = projectView.getAllAlarmsLabel();
    }

    private void addListeners() {
        newActivityLabel.addMouseListener(this);
        listViewLabel.addMouseListener(this);
        weekViewLabel.addMouseListener(this);
        addContactLabel.addMouseListener(this);
        addContactGroupLabel.addMouseListener(this);
        addAlarmLabel.addMouseListener(this);
        allContactsLabel.addMouseListener(this);
        allContactGroupsLabel.addMouseListener(this);
        allAlarmsLabel.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == newActivityLabel) {
            projectView.changeCard("AddActivityCard");
        } else if (e.getSource() == listViewLabel) {
            projectView.changeCard("ListViewCard");
            projectView.updateListView(cal.getActivityList());
        } else if (e.getSource() == weekViewLabel) {
            projectView.changeCard("WeekViewCard");
            projectView.updateWeekView();
        } else if (e.getSource() == addContactGroupLabel) {
            projectView.changeCard("AddContactGroupCard");
        } else if (e.getSource() == addContactLabel) {
            projectView.changeCard("AddContactCard");
        } else if (e.getSource() == addAlarmLabel) {
            projectView.changeCard("AddAlarmCard");
        }else if (e.getSource() == allContactsLabel) {
            projectView.changeCard("ContactCard");
            projectView.updateContacts(cal.getAllContacts());
        } else if (e.getSource() == allContactGroupsLabel) {
            projectView.changeCard("ContactGroupCard");
            projectView.updateContactGroups(cal.getContactGroupList());
        } else if (e.getSource() == allAlarmsLabel) {
            projectView.changeCard("AlarmCard");
            projectView.updateAlarms(cal.getAlarmList());
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
