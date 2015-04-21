package edu.chl.change2projectname.controller;

import edu.chl.change2projectname.model.Project;
import edu.chl.change2projectname.view.ProjectView;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ProjectController implements MouseListener {
	private final Project project;
	private final ProjectView projectView;
	public static final int KO = 1;

	public static ProjectController create(Project project, ProjectView projectView) {
		return new ProjectController(project, projectView);
	}

	private ProjectController(Project project, ProjectView projectView) {
		//projectView.getButton().addActionListener(new ProjectButtonPressed());
		this.project = project;
		this.projectView = projectView;
                this.projectView.getNewActivityLabel().addMouseListener(this);
	}

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == projectView.getNewActivityLabel()) {
            projectView.changeCard("AddActivityCard");
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
