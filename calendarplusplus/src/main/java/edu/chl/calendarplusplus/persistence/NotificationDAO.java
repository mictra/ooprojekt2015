/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.persistence;

import edu.chl.calendarplusplus.model.Notification;

/**
 *
 * @author Michael
 */
public class NotificationDAO extends AbstractDAO<Notification, Integer> {

    public NotificationDAO(Class<Notification> clazz) {
        super(clazz);
    }
    
}
