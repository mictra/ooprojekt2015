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
    IContact c1, c2, c3, c4;
    IContactGroup g;
    
    public ContactGroupTest(){
        c1 = new Contact("Roger", "", "");
        c2 = new Contact("Adam", "", "");
        c3 = new Contact("Josh", "", "");
        c4 = new Contact("Adriana", "", "");
        g = new ContactGroup("A group");
    }
    
    @Test
    public void addToContactGroup(){
        g.addContact(c1);
        Assert.assertEquals(1, g.getContacts().size());
    }
    
    // We will here see that our group doesn't add the exact same contact
    // twice or more.
    @Test
    public void addTwiceToContactGroup(){
        g.addContact(c1); g.addContact(c1);
        Assert.assertEquals(1, g.getContacts().size());
    }
    
    // We might want to have our list sorted by name, therefore, the
    // contacts should be ordered as fast as it gets added to the list.
    // The list should appear in this order: "{Adam, Adriana, Josh, Roger}"
    @Test
    public void sortedGroupList(){
        g.addContact(c1); g.addContact(c2); g.addContact(c3); g.addContact(c4);
        Assert.assertEquals("Adriana", g.getContacts().get(1).getName());
    }
}
