/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.persistence;

import edu.chl.calendarplusplus.model.Activity;

/**
 *
 * @author Michael
 */
public class ActivityDAO extends AbstractDAO<Activity, Integer> {

    public ActivityDAO(Class<Activity> clazz) {
        super(clazz);
    }
    
}
