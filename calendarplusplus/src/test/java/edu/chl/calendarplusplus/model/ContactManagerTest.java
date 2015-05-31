/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package edu.chl.calendarplusplus.model;

import edu.chl.calendarplusplus.contact.IContact;
import edu.chl.calendarplusplus.contact.IContactManager;
import edu.chl.calendarplusplus.contact.ContactManager;
import edu.chl.calendarplusplus.contact.IContactGroup;
import java.util.ArrayList;
import mockclasses.MockContact;
import mockclasses.MockContactGroup;
import org.junit.Assert;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author erikforsberg
 */
public class ContactManagerTest {
    
    IContact c1;
    IContact c2;
    IContactGroup cg1;
    IContactGroup cg2;
    IContactManager cm;
    
    public ContactManagerTest(){
        this.c1 = new MockContact();
        this.c2 = new MockContact();
        this.cm = new ContactManager();
        this.cg1 = new MockContactGroup();
    }
    
    //@Test
    public void testSetContact(){
        cm.setContactGroups(c1, new ArrayList<>());
        cm.setContactGroups(c2, new ArrayList<>());
        cm.addNewGroup(c1, cg1);
        cm.addNewGroup(c2, cg1);
        cm.addNewGroup(c2, cg2);
        Assert.assertTrue(cm.getContactGroups(c1).size() == 1);
        Assert.assertTrue(cm.getContactGroups(c2).size() == 2);

    }
    
}
