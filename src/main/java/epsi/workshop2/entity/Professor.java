/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.workshop2.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

/**
 *
 * @author rfera
 */
@Entity
public class Professor extends User{
   
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "skillId")
    private StudentClass skill;
}
