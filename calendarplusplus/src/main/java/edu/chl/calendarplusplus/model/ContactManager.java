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
        return groups.get(c);
    }

    public void setContactGroups(IContact c, List<IContactGroup> groupList) {
        groups.put(c, groupList);

    }

    public void addNewGroup(IContact c, IContactGroup cg) {
        List<IContactGroup> temp = groups.get(c);
        if (temp == null) {
            temp = new ArrayList<>();
        }
        temp.add(cg);
        groups.put(c, temp);
    }

    public void removeGroup(IContact c, IContactGroup cg) {
        List<IContactGroup> temp = groups.get(c);
        if (temp != null) {
            temp.remove(cg);
            groups.put(c, temp);
        }
    }

    public void clearGroups(IContact c) {
        List<IContactGroup> temp = groups.get(c);
        temp.clear();
        groups.put(c, temp);
    }

    public void removeContact(IContact c) {
        groups.remove(c);
    }

    public List<IContact> getAllContacts() {
        List<IContact> contacts = new ArrayList<>();
        for (IContact c : groups.keySet()) {
            contacts.add(c);
        }
        return contacts;
    }

}
