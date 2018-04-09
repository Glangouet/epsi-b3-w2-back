/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package epsi.workshop2.DAO;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author rfera
 */
@Entity
public class Project {

    @Id
    private int idProject;
    
    @Column
    private String title;
    
    @Column
    private String description;

    @Column
    private Date startDate;
    
    @Column
    private Date endDate;
    
    @Column
    private int leftToken;

}
