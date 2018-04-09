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
public class Skill {

    @Id
    private int idSkill;

    @Column
    private String name;

    /**
     * @return the idSkill
     */
    public int getIdSkill() {
        return idSkill;
    }

    /**
     * @param idSkill the idSkill to set
     */
    public void setIdSkill(int idSkill) {
        this.idSkill = idSkill;
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
