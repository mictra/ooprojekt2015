/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.model;

import edu.chl.calendarplusplus.view.AddContactCard;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author erikforsberg
 */

@Entity
public class Contact implements IContact, Serializable, Comparable<IContact> {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    
    private String name;
    private String phone;
    private String email;

    public Contact() {
        this.name = null;
        this.phone = null;
        this.email = null;
    }

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
    
    public int getId(){
        return id;
    }

    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return this.name;
    }

    public void setPhone(String p) {
        this.phone = p;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setEmail(String e) {
        this.email = e;
    }

    public String getEmail() {
        return this.email;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int compareTo(IContact c) {
        return this.name.compareTo(c.getName());
    }

}
