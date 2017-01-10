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
@Table(name = "diplome")

public class Diplome implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Lob
    @Column(name = "lib")
    private String lib;
    @Basic(optional = false)
    @Column(name = "id_parcours")
    private int idParcours;

    public Diplome() {
    }

    public Diplome(Integer id) {
        this.id = id;
    }

    public Diplome(Integer id, String lib, int idParcours) {
        this.id = id;
        this.lib = lib;
        this.idParcours = idParcours;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLib() {
        return lib;
    }

    public void setLib(String lib) {
        this.lib = lib;
    }

    public int getIdParcours() {
        return idParcours;
    }

    public void setIdParcours(int idParcours) {
        this.idParcours = idParcours;
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
        if (!(object instanceof Diplome)) {
            return false;
        }
        Diplome other = (Diplome) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication5.Diplome[ id=" + id + " ]";
    }
    
}
