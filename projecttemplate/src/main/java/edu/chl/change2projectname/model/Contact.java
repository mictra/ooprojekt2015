/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package edu.chl.change2projectname.model;

import java.util.ArrayList;

/**
 *
 * @author erikforsberg
 */
public class Contact {
    
    private String name;
    private String phone;
    private String email;
    
    private ArrayList<String> groups;
    
    public Contact(String name){
        this.name = name;
        groups = new ArrayList<>();
    }
    
    public void setName(String n){
        this.name = n;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setPhone(String p){
        this.phone = p;
    }
    
    public String getPhone(){
        return this.phone;
    }
    
    public void setEmail(String e){
        this.email = e;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void addGroup(String group){
        this.groups.add(group);
    }
    
    public void removeGroup(String group){
        this.groups.remove(group);
    }

}
