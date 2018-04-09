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
public class Class {
    @Id
    private int idClass;
    
    @Column
    private String name;

    /**
     * @return the idClass
     */
    public int getIdClass() {
        return idClass;
    }

    /**
     * @param idClass the idClass to set
     */
    public void setIdClass(int idClass) {
        this.idClass = idClass;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    
}
