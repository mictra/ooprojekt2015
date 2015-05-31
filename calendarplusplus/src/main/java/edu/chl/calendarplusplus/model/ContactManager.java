/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author erikforsberg
 *
 * Manager for contact groups. HashMap with a specific contact as key and a list
 * with its groups as value.
 *
 */
public class ContactManager implements IContactManager {

    private Map<IContact, List<IContactGroup>> groups;

    public ContactManager() {
        groups = new HashMap<>();
    }

    public List<IContactGroup> getContactGroups(IContact c) {
        for (IContact contact : getAllContacts()) {
            if (c.getName() == contact.getName() && c.getId() == contact.getId()) {
                return groups.get(contact);
            }
        }
        return new ArrayList<>();
    }

    public void setContactGroups(IContact c, List<IContactGroup> groupList) {
        IContact contact = findContact(c);
        if (contact != null) {
            groups.put(contact, groupList);
        } else {
            groups.put(c, groupList);
        }
    }

    public void addNewGroup(IContact c, IContactGroup cg) {
        IContact foundContact = findContact(c);
        if (foundContact == null) {
            return;
        }
        List<IContactGroup> temp = groups.get(foundContact);
        if (temp == null) {
            temp = new ArrayList<>();
        }
        temp.add(cg);
        groups.put(foundContact, temp);
    }

    public void removeGroup(IContact c, IContactGroup cg) {
        IContact foundContact = findContact(c);
        List<IContactGroup> temp = groups.get(foundContact);
        if (foundContact != null && temp != null) {
            temp.remove(cg);
            groups.put(foundContact, temp);
        }
    }

    public void clearGroups(IContact c) {
        IContact contact = findContact(c);
        List<IContactGroup> temp = groups.get(contact);
        if (contact != null && temp != null) {
            temp.clear();
            groups.put(c, temp);
        }
    }

    public void removeContact(IContact c) {
        IContact contact = findContact(c);
        if (contact != null) {
            groups.remove(contact);
        }
    }

    public List<IContact> getAllContacts() {
        List<IContact> contacts = new ArrayList<>();
        for (IContact c : groups.keySet()) {
            contacts.add(c);
        }
        return contacts;
    }

    private IContact findContact(IContact contact) {
        for (IContact c : getAllContacts()) {
            if (c.getName().equals(contact.getName()) && c.getId() == contact.getId()) {
                return c;
            }
        }
        return null;
    }

}
