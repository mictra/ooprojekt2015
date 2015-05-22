/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.chl.calendarplusplus.persistence;

import edu.chl.calendarplusplus.model.Alarm;

/**
 *
 * @author Michael
 */
public class AlarmDAO extends AbstractDAO<Alarm, Integer> {

    public AlarmDAO(Class<Alarm> clazz) {
        super(clazz);
    }
    
}
