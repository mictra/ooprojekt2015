package edu.chl.change2projectname.controller;

import edu.chl.change2projectname.model.Activity;
import edu.chl.change2projectname.model.CalendarPlus;
import edu.chl.change2projectname.model.Project;
import edu.chl.change2projectname.view.ProjectView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ProjectController implements MouseListener, ActionListener {
	//private final Project project;
        private final CalendarPlus cal;
	private final ProjectView projectView;
	public static final int KO = 1;

	public static ProjectController create(CalendarPlus cal, ProjectView projectView) {
		return new ProjectController(cal, projectView);
	}

	private ProjectController(CalendarPlus cal, ProjectView projectView) {
		//projectView.getButton().addActionListener(new ProjectButtonPressed());
		this.cal = cal;
		this.projectView = projectView;
                this.projectView.getNewActivityLabel().addMouseListener(this);
                this.projectView.getActivityCard().getSaveButton().addActionListener(this);
                this.projectView.getActivityCard().getCancelButton().addActionListener(this);
                this.projectView.getListViewLabel().addMouseListener(this);
	}

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == projectView.getNewActivityLabel()) {
            projectView.changeCard("AddActivityCard");
        } else if(e.getSource() == projectView.getListViewLabel()){
            projectView.changeCard("ListViewCard");
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
        if(e.getSource() == projectView.getActivityCard().getSaveButton()){
            cal.addActivity(projectView.getActivityCard().getAsActivity());
        }
        if(e.getSource() == projectView.getActivityCard().getCancelButton()){
            for(Activity a : cal.getActivityList()){
                System.out.println("Name: " + a.getName());
            }
        }
    }

	
}
