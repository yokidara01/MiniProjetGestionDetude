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
@Table(name = "ue")

public class Ue implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Lob
    @Column(name = "regime")
    private String regime;
    @Basic(optional = false)
    @Lob
    @Column(name = "lib")
    private String lib;
    @Basic(optional = false)
    @Lob
    @Column(name = "type")
    private String type;
    @Basic(optional = false)
    @Lob
    @Column(name = "credit")
    private String credit;
    @Basic(optional = false)
    @Column(name = "coeff")
    private int coeff;
    @Basic(optional = false)
    @Column(name = "id_niveau")
    private int idNiveau;

    public Ue() {
    }

    public Ue(Integer id) {
        this.id = id;
    }

    public Ue(Integer id, String regime, String lib, String type, String credit, int coeff, int idNiveau) {
        this.id = id;
        this.regime = regime;
        this.lib = lib;
        this.type = type;
        this.credit = credit;
        this.coeff = coeff;
        this.idNiveau = idNiveau;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRegime() {
        return regime;
    }

    public void setRegime(String regime) {
        this.regime = regime;
    }

    public String getLib() {
        return lib;
    }

    public void setLib(String lib) {
        this.lib = lib;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public int getCoeff() {
        return coeff;
    }

    public void setCoeff(int coeff) {
        this.coeff = coeff;
    }

    public int getIdNiveau() {
        return idNiveau;
    }

    public void setIdNiveau(int idNiveau) {
        this.idNiveau = idNiveau;
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
        if (!(object instanceof Ue)) {
            return false;
        }
        Ue other = (Ue) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication5.Ue[ id=" + id + " ]";
    }
    
}
