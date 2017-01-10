/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MiniProjetGestionDetude.entites;

import javax.persistence.*;
import java.io.Serializable;

/**
 *
 * @author Aladinne
 */
@Entity
@Table(name = "semestre")

public class Semestre implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nbr_semaine")
    private int nbrSemaine;
    @Basic(optional = false)
    @Column(name = "id_session")
    private int idSession;

    public Semestre() {
    }

    public Semestre(Integer id) {
        this.id = id;
    }

    public Semestre(Integer id, int nbrSemaine, int idSession) {
        this.id = id;
        this.nbrSemaine = nbrSemaine;
        this.idSession = idSession;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getNbrSemaine() {
        return nbrSemaine;
    }

    public void setNbrSemaine(int nbrSemaine) {
        this.nbrSemaine = nbrSemaine;
    }

    public int getIdSession() {
        return idSession;
    }

    public void setIdSession(int idSession) {
        this.idSession = idSession;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Semestre)) {
            return false;
        }
        Semestre other = (Semestre) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication5.Semestre[ id=" + id + " ]";
    }
    
}
