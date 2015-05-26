package edu.chl.calendarplusplus;

import edu.chl.calendarplusplus.controller.*;
import edu.chl.calendarplusplus.model.CalendarPlus;
import edu.chl.calendarplusplus.model.Contact;
import edu.chl.calendarplusplus.model.ContactGroup;
import edu.chl.calendarplusplus.model.IContact;
import edu.chl.calendarplusplus.model.IContactGroup;
import edu.chl.calendarplusplus.model.Project;
import edu.chl.calendarplusplus.persistence.ActivityDAO;
<<<<<<< HEAD
=======
import edu.chl.calendarplusplus.persistence.AlarmDAO;
>>>>>>> origin/master
import edu.chl.calendarplusplus.persistence.ContactDAO;
import edu.chl.calendarplusplus.persistence.ContactGroupDAO;
import edu.chl.calendarplusplus.view.ProjectView;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
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
                    AddAlarmCardController.create(cal, projectView, projectView.getAlarmCard());
                    projectView.setVisible(true);
                    initTest(cal);
                });
	}
        
        public static void initTest(CalendarPlus cal){
            
            /*
            AlarmDAO alarmDAO = new AlarmDAO();
            alarmDAO.deleteAll();
            
            ContactGroupDAO cgDAO = new ContactGroupDAO();
            cgDAO.deleteAll();
            
            ActivityDAO aDAO = new ActivityDAO();
            aDAO.deleteAll();
            
            ContactDAO cDAO = new ContactDAO();
            cDAO.deleteAll();
            
            */
            /*
            //Adding contacts and contactgroups
            IContactGroup family = new ContactGroup("Family");
            IContactGroup friends = new ContactGroup("Friends");
            IContactGroup colleagues = new ContactGroup("Colleagues");
            IContact michael = new Contact("Michael", null, null);
            IContact patrick = new Contact("Patrick", "1234567890", null);
            IContact johan = new Contact("Johan", null, "Johan@mail.com");
            IContact erik = new Contact("Erik", "0987654321", "Erik@mail.com");
            
            ContactGroupDAO cgDAO = new ContactGroupDAO();
            //cgDAO.create(colleagues);
            //cgDAO.deleteAll();
            
            ContactDAO cDAO = new ContactDAO();
            //cDAO.deleteAll();
            
            //cDAO.create(michael);
            
            IContactGroup cgroup = cgDAO.find("Colleagues");
            //cgroup.addContact(johan);
            //cDAO.create(erik);
            //cgDAO.update(cgroup);
            
            System.out.println("All Group names:");
            for(IContactGroup cg : cgDAO.findAll()){
                System.out.println(cg.getGroupName());
            }
           
            System.out.println("All contact names:");
            for(IContact c : cDAO.findAll()){
                System.out.println(c.getName());
            }
            
            
            System.out.println("All contacts in Group:");
            for(IContact c : cgroup.getContacts()){
                System.out.println(c.getName());
            }
            
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
            */
        }
       
}
