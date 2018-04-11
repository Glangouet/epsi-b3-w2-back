/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author rfera
 */
@Entity
@Table(name = "campus")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Campus.findAll", query = "SELECT c FROM Campus c")
    , @NamedQuery(name = "Campus.findByCampusId", query = "SELECT c FROM Campus c WHERE c.campusId = :campusId")
    , @NamedQuery(name = "Campus.findByName", query = "SELECT c FROM Campus c WHERE c.name = :name")})
public class Campus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CampusId")
    private Integer campusId;
    @Column(name = "Name")
    private String name;
    @OneToMany(mappedBy = "campusId")
    private Collection<Users> usersCollection;

    public Campus() {
    }

    public Campus(Integer campusId) {
        this.campusId = campusId;
    }

    public Integer getCampusId() {
        return campusId;
    }

    public void setCampusId(Integer campusId) {
        this.campusId = campusId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlTransient
    public Collection<Users> getUsersCollection() {
        return usersCollection;
    }

    public void setUsersCollection(Collection<Users> usersCollection) {
        this.usersCollection = usersCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (campusId != null ? campusId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Campus)) {
            return false;
        }
        Campus other = (Campus) object;
        if ((this.campusId == null && other.campusId != null) || (this.campusId != null && !this.campusId.equals(other.campusId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.service.Campus[ campusId=" + campusId + " ]";
    }
    
}
