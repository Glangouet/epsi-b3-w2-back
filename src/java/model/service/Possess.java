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
@Table(name = "possess")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Possess.findAll", query = "SELECT p FROM Possess p")
    , @NamedQuery(name = "Possess.findByIdProjet", query = "SELECT p FROM Possess p WHERE p.possessPK.idProjet = :idProjet")
    , @NamedQuery(name = "Possess.findByTokenId", query = "SELECT p FROM Possess p WHERE p.possessPK.tokenId = :tokenId")})
public class Possess implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PossessPK possessPK;

    public Possess() {
    }

    public Possess(PossessPK possessPK) {
        this.possessPK = possessPK;
    }

    public Possess(int idProjet, int tokenId) {
        this.possessPK = new PossessPK(idProjet, tokenId);
    }

    public PossessPK getPossessPK() {
        return possessPK;
    }

    public void setPossessPK(PossessPK possessPK) {
        this.possessPK = possessPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (possessPK != null ? possessPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Possess)) {
            return false;
        }
        Possess other = (Possess) object;
        if ((this.possessPK == null && other.possessPK != null) || (this.possessPK != null && !this.possessPK.equals(other.possessPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.service.Possess[ possessPK=" + possessPK + " ]";
    }
    
}
