/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package edu.chl.calendarplusplus.model;

import java.util.ArrayList;

/**
 *
 * @author erikforsberg
 */
public class Contact implements IContact{
    
    private String name;
    private String phone;
    private String email;
    
    
    public Contact(String name, String phone, String email){
        this.name = name;
        this.phone = phone;
        this.email = email;
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
        
        @Override
        public String toString() {
            return this.name;
        }
        
}
