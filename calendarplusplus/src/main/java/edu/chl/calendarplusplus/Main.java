package edu.chl.calendarplusplus;

import edu.chl.calendarplusplus.controller.*;
import edu.chl.calendarplusplus.model.CalendarPlus;
import edu.chl.calendarplusplus.model.Contact;
import edu.chl.calendarplusplus.model.ContactGroup;
import edu.chl.calendarplusplus.model.IContact;
import edu.chl.calendarplusplus.model.IContactGroup;
import edu.chl.calendarplusplus.model.Project;
import edu.chl.calendarplusplus.persistence.ContactGroupDAO;
import edu.chl.calendarplusplus.view.ProjectView;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingUtilities;

/*
  Application entry class (if using standard java and Swing)
*/
public final class Main {

    private static void setLookAndFeel() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Macintosh".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                }
            }
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("GTK+".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(ProjectView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

	private Main() {
		/* No instances allowed! */
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
                                       
                    setLookAndFeel();
                    
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
            IContact michael = new Contact("Michael", null, null);
            IContact patrick = new Contact("Patrick", "1234567890", null);
            IContact johan = new Contact("Johan", null, "Johan@mail.com");
            IContact erik = new Contact("Erik", "0987654321", "Erik@mail.com");
            
            ContactGroupDAO cgDAO = new ContactGroupDAO();
            cgDAO.create(colleagues);
            //ContactGroupDAO cgDAO1 = new ContactGroupDAO();
            /*
            for(ContactGroup cg : cgDAO.findAll()){
                System.out.println(cg.getGroupName());
            }
                    */
            ContactGroup cg = cgDAO.find("Colleagues");
            System.out.println(cg.getGroupName());
            
            cal.addContactGroup(family);
            cal.addContactGroup(friends);
            cal.addContactGroup(colleagues);
            
            family.addContact(michael);
            friends.addContact(michael);
            List<IContactGroup> michaelGroups = new ArrayList<>();
            michaelGroups.add(family);
            michaelGroups.add(friends);
            cal.getContactManager().setContactGroups(michael, michaelGroups);
            
            friends.addContact(patrick);
            List<IContactGroup> patrickGroups = new ArrayList<>();
            patrickGroups.add(friends);
            cal.getContactManager().setContactGroups(patrick, patrickGroups);
            
            colleagues.addContact(johan);
            friends.addContact(johan);
            List<IContactGroup> johanGroups = new ArrayList<>();
            johanGroups.add(colleagues);
            johanGroups.add(friends);
            cal.getContactManager().setContactGroups(johan, johanGroups);
            
            friends.addContact(erik);
            colleagues.addContact(erik);
            List<IContactGroup> erikGroups = new ArrayList<>();
            erikGroups.add(friends);
            erikGroups.add(colleagues);
            cal.getContactManager().setContactGroups(erik, erikGroups);
            
            //Add activities
            
        }
       
}
