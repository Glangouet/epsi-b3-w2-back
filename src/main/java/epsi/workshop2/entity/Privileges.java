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
public class Privileges {
    @Id
    private int idPrivileges;
    
    @Column
    private String label;

    /**
     * @return the idPrivileges
     */
    public int getIdPrivileges() {
        return idPrivileges;
    }

    /**
     * @param idPrivileges the idPrivileges to set
     */
    public void setIdPrivileges(int idPrivileges) {
        this.idPrivileges = idPrivileges;
    }

    /**
     * @return the label
     */
    public String getLabel() {
        return label;
    }

    /**
     * @param label the label to set
     */
    public void setLabel(String label) {
        this.label = label;
    }
    
    
}
