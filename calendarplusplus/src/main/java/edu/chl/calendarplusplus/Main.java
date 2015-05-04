package edu.chl.calendarplusplus;

import edu.chl.calendarplusplus.controller.ProjectViewController;
import edu.chl.calendarplusplus.model.CalendarPlus;
import edu.chl.calendarplusplus.model.Project;
import edu.chl.calendarplusplus.view.ProjectView;
import javax.swing.SwingUtilities;

/*
  Application entry class (if using standard java and Swing)
*/
public final class Main {
	private Main() {
		/* No instances allowed! */
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
                    final Project project = new Project();
                    final CalendarPlus cal = new CalendarPlus();
                    final ProjectView projectView = new ProjectView(project, cal);
                    
                    ProjectViewController.create(cal, projectView);
                    projectView.setVisible(true);
                });
	}
}
