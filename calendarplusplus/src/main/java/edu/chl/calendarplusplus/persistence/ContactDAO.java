/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.persistence;

import edu.chl.calendarplusplus.contact.model.Contact;
import edu.chl.calendarplusplus.contact.model.IContact;
import java.util.List;

/**
 *
 * @author Michael
 */
public class ContactDAO extends AbstractDAO<IContact, Integer> {

    public ContactDAO() {
        super(IContact.class);
    }
    
    @Override
    public List<IContact> findAll(){
        return em.createQuery("select c from Contact c", IContact.class).getResultList();
    }
    
    public void deleteAll(){
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Contact c").executeUpdate();
        em.getTransaction().commit();
    }
    
    public void delete(int id){
        Contact c = em.getReference(Contact.class, id);
        em.getTransaction().begin();
        em.remove(c);
        em.getTransaction().commit();
    }
    
}
