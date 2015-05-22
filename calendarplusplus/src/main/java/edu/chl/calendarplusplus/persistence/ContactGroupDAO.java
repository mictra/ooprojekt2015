/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.persistence;

import edu.chl.calendarplusplus.model.ContactGroup;
import edu.chl.calendarplusplus.model.IContactGroup;
import java.util.List;

/**
 *
 * @author Michael
 */
public class ContactGroupDAO extends AbstractDAO<IContactGroup, String> {

    public ContactGroupDAO() {
        super(IContactGroup.class);
    }
    
    @Override
    public List<IContactGroup> findAll(){
        return em.createQuery("select c from ContactGroup c", IContactGroup.class).getResultList();
    }
    
    @Override
    public IContactGroup find(String id){
        return em.find(ContactGroup.class, id);
    }
    
    public void deleteAll(){
        em.getTransaction().begin();
        em.createQuery("DELETE FROM ContactGroup cg").executeUpdate();
        em.getTransaction().commit();
    }
    
}
