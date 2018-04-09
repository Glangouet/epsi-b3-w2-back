/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.workshop2.entity;

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

    /**
     * @return the idCampus
     */
    public int getIdCampus() {
        return idCampus;
    }

    /**
     * @param idCampus the idCampus to set
     */
    public void setIdCampus(int idCampus) {
        this.idCampus = idCampus;
    }

    /**
     * @return the campusName
     */
    public String getCampusName() {
        return campusName;
    }

    /**
     * @param campusName the campusName to set
     */
    public void setCampusName(String campusName) {
        this.campusName = campusName;
    }

    
}
