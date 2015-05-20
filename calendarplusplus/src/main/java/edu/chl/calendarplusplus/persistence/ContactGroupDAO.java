/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.persistence;

import edu.chl.calendarplusplus.model.ContactGroup;

/**
 *
 * @author Michael
 */
public class ContactGroupDAO extends AbstractDAO<ContactGroup, String> {

    public ContactGroupDAO() {
        super(ContactGroup.class);
    }
    
}
