/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mockclasses;

import edu.chl.calendarplusplus.model.IContact;

/**
 *
 * @author erikforsberg
 */
public class MockContact implements IContact {

    private String test;
    
    public MockContact(){
        this.test = "teststring";
    }

    @Override
    public void setName(String n) {
    }

    @Override
    public String getName() {
        return "erik";
    }

    @Override
    public void setPhone(String p) {
    }

    @Override
    public String getPhone() {
        return "123";
    }

    @Override
    public void setEmail(String e) {
    }

    @Override
    public String getEmail() {
        return "mail";
    }

    @Override
    public int getId() {
        return 1; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(IContact c) {
        return 0;
    }
    
}
