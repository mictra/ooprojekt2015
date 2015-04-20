/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.change2projectname.model;

/**
 *
 * @author erikforsberg
 */
public class Contact {
    
    public String name;
    public String phone;
    public String email;
    
    //CONTACT Group ? sträng eller objekt?
    
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
    

}
