/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.model;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Johan
 */
public class ContactGroupTest {
    
    @Test
    public void addToContactGroup(){
        Contact c1 = new Contact("Lisa");
        ContactGroup g = new ContactGroup("A Group");
        g.addContact(c1);
        Assert.assertEquals(1, g.getContacts().size());
    }
    
    // We will here see that our group doesn't add the exact same contact
    // twice or more.
    @Test
    public void addTwiceToContactGroup(){
        Contact c1 = new Contact("Daniel");
        ContactGroup g = new ContactGroup("A Group");
        g.addContact(c1); g.addContact(c1);
        Assert.assertEquals(1, g.getContacts().size());
    }
    
    // We might want to have our list sorted by name, therefore, the
    // contacts should be ordered as fast as it gets added to the list.
    @Test
    public void sortedGroupList(){
        Contact c1 = new Contact("Roger");
        Contact c2 = new Contact("Adam");
        Contact c3 = new Contact("Josh");
        ContactGroup g = new ContactGroup("A Group");
        g.addContact(c1); g.addContact(c2); g.addContact(c3);
        Assert.assertEquals("Roger", g.getContacts().get(2).getName());
    }
}
