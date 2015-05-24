/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.chl.calendarplusplus.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


/**
 *
 * @author johan
 */
@Entity
public class ContactGroup implements IContactGroup, Serializable {
    
    @Id
    private String name;
    @OneToMany(targetEntity = Contact.class)
    private final List<IContact> members;

    public ContactGroup() {
        this.name = null;
        this.members = new ArrayList<>();
    }
    
    public ContactGroup(String name){
        this.name = name;
        members = new ArrayList<>();
    }
    
    public void setGroupName(String name){
        this.name = name;
    }
    
    public String getGroupName(){
        return name;
    }
    
    public void addContact(IContact member){
        // Check if the contact's name already exist in the group.
        for(IContact c : members){
            if (member.getName().equals(c.getName())){
                return;
            }
        }
        // Check where the member-variable should be put based on its name.
        for (int i = 0; i < members.size(); i++){
            for (int j = 0; j < member.getName().length() || j < members.get(i).getName().length(); j++){
                if ((int)member.getName().charAt(j) < (int)members.get(i).getName().charAt(j)){
                    members.add(i, member);
                    return;
                } // If the chars are equal, check the next char.
                if ((int)member.getName().charAt(j) != (int)members.get(i).getName().charAt(j)){
                    break;
                }
            }
        }
        // Here we add the member to the last position.
        members.add(member);
    }
    
    public List<IContact> getContacts(){
        return members;
    }
    
    //Using this method instead of contains method, because we wan't the values comparisson
    public boolean hasContact(IContact contact){
        for(IContact c : members){
            if(contact.getId() == c.getId() && contact.getName().equals(c.getName())){
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
}
