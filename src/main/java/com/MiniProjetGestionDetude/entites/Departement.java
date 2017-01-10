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
@Table(name = "departement")

public class Departement implements Serializable {

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
    @Lob
    @Column(name = "date_creation")
    private String dateCreation;
    @Basic(optional = false)
    @Lob
    @Column(name = "responsable")
    private String responsable;
    @Basic(optional = false)
    @Column(name = "id_diplome")
    private int idDiplome;

    public Departement() {
    }

    public Departement(Integer id) {
        this.id = id;
    }

    public Departement(Integer id, String lib, String dateCreation, String responsable, int idDiplome) {
        this.id = id;
        this.lib = lib;
        this.dateCreation = dateCreation;
        this.responsable = responsable;
        this.idDiplome = idDiplome;
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

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public int getIdDiplome() {
        return idDiplome;
    }

    public void setIdDiplome(int idDiplome) {
        this.idDiplome = idDiplome;
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
        if (!(object instanceof Departement)) {
            return false;
        }
        Departement other = (Departement) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication5.Departement[ id=" + id + " ]";
    }
    
    
    
    
    
}
