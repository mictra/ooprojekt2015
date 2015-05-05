package edu.chl.calendarplusplus;

import edu.chl.calendarplusplus.controller.*;
import edu.chl.calendarplusplus.model.CalendarPlus;
import edu.chl.calendarplusplus.model.Contact;
import edu.chl.calendarplusplus.model.ContactGroup;
import edu.chl.calendarplusplus.model.Project;
import edu.chl.calendarplusplus.view.ProjectView;
import java.util.ArrayList;
import java.util.List;
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
                    //Maybe we should create own view objects here and use them instead of in the projectView?
                    //Still have to add the created views to the mainPanel though...
                    AddActivityCardController.create(cal, projectView, projectView.getActivityCard());
                    AddContactCardController.create(cal, projectView, projectView.getContactCard());
                    AddContactGroupCardController.create(cal, projectView, projectView.getContactGroupCard());
                    projectView.setVisible(true);
                    initTest(cal);
                });
	}
        
        public static void initTest(CalendarPlus cal){
            //Adding contacts and contactgroups
            ContactGroup family = new ContactGroup("Family");
            ContactGroup friends = new ContactGroup("Friends");
            ContactGroup colleagues = new ContactGroup("Colleagues");
            Contact michael = new Contact("Michael", null, null);
            Contact patrick = new Contact("Patrick", "1234567890", null);
            Contact johan = new Contact("Johan", null, "Johan@mail.com");
            Contact erik = new Contact("Erik", "0987654321", "Erik@mail.com");
            cal.addContactGroup(family);
            cal.addContactGroup(friends);
            cal.addContactGroup(colleagues);
            
            family.addContact(michael);
            List<ContactGroup> michaelGroups = new ArrayList<>();
            michaelGroups.add(family);
            cal.getContactManager().setContactGroups(michael, michaelGroups);
            
            friends.addContact(patrick);
            List<ContactGroup> patrickGroups = new ArrayList<>();
            patrickGroups.add(friends);
            cal.getContactManager().setContactGroups(erik, patrickGroups);
            
            colleagues.addContact(johan);
            List<ContactGroup> johanGroups = new ArrayList<>();
            johanGroups.add(colleagues);
            cal.getContactManager().setContactGroups(johan, johanGroups);
            
            friends.addContact(erik);
            colleagues.addContact(erik);
            List<ContactGroup> erikGroups = new ArrayList<>();
            erikGroups.add(friends);
            erikGroups.add(colleagues);
            cal.getContactManager().setContactGroups(erik, erikGroups);
            
            //Add activities
            
        }
}
