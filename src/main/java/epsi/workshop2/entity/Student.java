/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.workshop2.entity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author rfera
 */
@Entity
public class Student extends User {

    @ManyToOne
    @JoinColumn(name = "classId")
    private StudentClass studentClass;

}
