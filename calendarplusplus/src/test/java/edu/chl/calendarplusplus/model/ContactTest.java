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
 * @author erikforsberg
 */
public class ContactTest {
    
    Contact c1;
    Contact c2;
    Contact c3;
    
    public ContactTest(){
        
        this.c1 = new Contact("Erik", "Phone1", "Mail1");
        this.c2 = new Contact("Jenny", "Phone2", "Mail2");
     //   this.c3 = new Contact("Name", null, null);
        
    }
    @Test
    public void testGetName(){
        Assert.assertTrue(c1.getName().equals("Erik"));
        Assert.assertTrue(c1.getEmail().equals("Mail1"));
        Assert.assertTrue(c1.getPhone().equals("Phone1"));
    }
    
    @Test
    public void testSetName(){
        c1.setName("Test");
        Assert.assertTrue(c1.getName().equals("Test"));
        c1.setEmail("Test");
        Assert.assertTrue(c1.getEmail().equals("Test"));
        c1.setPhone("Test");
        Assert.assertTrue(c1.getPhone().equals("Test"));
    }
    
    
}
