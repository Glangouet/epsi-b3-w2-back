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
public class PossessPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "IdProjet")
    private int idProjet;
    @Basic(optional = false)
    @Column(name = "TokenId")
    private int tokenId;

    public PossessPK() {
    }

    public PossessPK(int idProjet, int tokenId) {
        this.idProjet = idProjet;
        this.tokenId = tokenId;
    }

    public int getIdProjet() {
        return idProjet;
    }

    public void setIdProjet(int idProjet) {
        this.idProjet = idProjet;
    }

    public int getTokenId() {
        return tokenId;
    }

    public void setTokenId(int tokenId) {
        this.tokenId = tokenId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idProjet;
        hash += (int) tokenId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PossessPK)) {
            return false;
        }
        PossessPK other = (PossessPK) object;
        if (this.idProjet != other.idProjet) {
            return false;
        }
        if (this.tokenId != other.tokenId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.service.PossessPK[ idProjet=" + idProjet + ", tokenId=" + tokenId + " ]";
    }
    
}
