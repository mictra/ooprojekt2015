/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.persistence;

import edu.chl.calendarplusplus.contact.ContactGroup;
import edu.chl.calendarplusplus.contact.IContactGroup;
import java.util.List;

/**
 *
 * @author Michael
 */
public class ContactGroupDAO extends AbstractDAO<IContactGroup, Integer> {

    public ContactGroupDAO() {
        super(IContactGroup.class);
    }
    
    @Override
    public List<IContactGroup> findAll(){
        return em.createQuery("select c from ContactGroup c", IContactGroup.class).getResultList();
    }
    
    public IContactGroup find(int id){
        return em.find(ContactGroup.class, id);
    }
    
    public void deleteAll(){
        em.getTransaction().begin();
        em.createQuery("DELETE FROM ContactGroup cg").executeUpdate();
        em.getTransaction().commit();
    }
    
    public void delete(int id){
        ContactGroup cg = em.getReference(ContactGroup.class, id);
        em.getTransaction().begin();
        em.remove(cg);
        em.getTransaction().commit();
    }
    
}
