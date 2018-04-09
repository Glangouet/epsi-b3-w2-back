/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.workshop2.DAO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author rfera
 */
@Entity
public class Campus {
    
    @Id
    private int idCampus;
    
    @Column
    private String campusName;

}
