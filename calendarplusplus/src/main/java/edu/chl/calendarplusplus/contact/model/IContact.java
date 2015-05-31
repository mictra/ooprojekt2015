/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package edu.chl.calendarplusplus.contact.model;

/**
 *
 * @author erikforsberg
 */
public interface IContact extends Comparable<IContact> {
    
    void setName(String n);
    
    String getName();
    
    void setPhone(String p);
    
    String getPhone();
    
    void setEmail(String e);
    
    String getEmail();
    
    int getId();
    
    @Override
    public int compareTo(IContact c);
    
}
