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

    /**
     * @return the idProject
     */
    public int getIdProject() {
        return idProject;
    }

    /**
     * @param idProject the idProject to set
     */
    public void setIdProject(int idProject) {
        this.idProject = idProject;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the startDate
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the leftToken
     */
    public int getLeftToken() {
        return leftToken;
    }

    /**
     * @param leftToken the leftToken to set
     */
    public void setLeftToken(int leftToken) {
        this.leftToken = leftToken;
    }

    
}
