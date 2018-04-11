/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.service;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author rfera
 */
@Embeddable
public class ObtainPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "PrivilegeId")
    private int privilegeId;
    @Basic(optional = false)
    @Column(name = "UserId")
    private int userId;

    public ObtainPK() {
    }

    public ObtainPK(int privilegeId, int userId) {
        this.privilegeId = privilegeId;
        this.userId = userId;
    }

    public int getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(int privilegeId) {
        this.privilegeId = privilegeId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) privilegeId;
        hash += (int) userId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ObtainPK)) {
            return false;
        }
        ObtainPK other = (ObtainPK) object;
        if (this.privilegeId != other.privilegeId) {
            return false;
        }
        if (this.userId != other.userId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.service.ObtainPK[ privilegeId=" + privilegeId + ", userId=" + userId + " ]";
    }
    
}
