/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.chl.calendarplusplus.model;
import java.util.ArrayList;


/**
 *
 * @author johan
 */
public class ContactGroup implements IContactGroup {
    
    private String name;
    private final ArrayList<IContact> members;
    
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
    
    public ArrayList<IContact> getContacts(){
        return members;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
}
