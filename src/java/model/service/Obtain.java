/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rfera
 */
@Entity
@Table(name = "obtain")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Obtain.findAll", query = "SELECT o FROM Obtain o")
    , @NamedQuery(name = "Obtain.findByPrivilegeId", query = "SELECT o FROM Obtain o WHERE o.obtainPK.privilegeId = :privilegeId")
    , @NamedQuery(name = "Obtain.findByUserId", query = "SELECT o FROM Obtain o WHERE o.obtainPK.userId = :userId")})
public class Obtain implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ObtainPK obtainPK;

    public Obtain() {
    }

    public Obtain(ObtainPK obtainPK) {
        this.obtainPK = obtainPK;
    }

    public Obtain(int privilegeId, int userId) {
        this.obtainPK = new ObtainPK(privilegeId, userId);
    }

    public ObtainPK getObtainPK() {
        return obtainPK;
    }

    public void setObtainPK(ObtainPK obtainPK) {
        this.obtainPK = obtainPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (obtainPK != null ? obtainPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Obtain)) {
            return false;
        }
        Obtain other = (Obtain) object;
        if ((this.obtainPK == null && other.obtainPK != null) || (this.obtainPK != null && !this.obtainPK.equals(other.obtainPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.service.Obtain[ obtainPK=" + obtainPK + " ]";
    }
    
}
