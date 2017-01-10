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
@Table(name = "matier")

public class Matier implements Serializable {

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
    @Column(name = "coeff")
    private int coeff;
    @Basic(optional = false)
    @Lob
    @Column(name = "credit")
    private String credit;
    @Basic(optional = false)
    @Column(name = "charge_horaire_cours")
    private int chargeHoraireCours;
    @Basic(optional = false)
    @Column(name = "charge_horaire_tp")
    private int chargeHoraireTp;
    @Basic(optional = false)
    @Column(name = "charge_horaire_td")
    private int chargeHoraireTd;
    @Basic(optional = false)
    @Column(name = "charge_horaire_globale")
    private int chargeHoraireGlobale;
    @Basic(optional = false)
    @Column(name = "id_ue")
    private int idUe;

    public Matier() {
    }

    public Matier(Integer id) {
        this.id = id;
    }

    public Matier(Integer id, String lib, int coeff, String credit, int chargeHoraireCours, int chargeHoraireTp, int chargeHoraireTd, int chargeHoraireGlobale, int idUe) {
        this.id = id;
        this.lib = lib;
        this.coeff = coeff;
        this.credit = credit;
        this.chargeHoraireCours = chargeHoraireCours;
        this.chargeHoraireTp = chargeHoraireTp;
        this.chargeHoraireTd = chargeHoraireTd;
        this.chargeHoraireGlobale = chargeHoraireGlobale;
        this.idUe = idUe;
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

    public int getCoeff() {
        return coeff;
    }

    public void setCoeff(int coeff) {
        this.coeff = coeff;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public int getChargeHoraireCours() {
        return chargeHoraireCours;
    }

    public void setChargeHoraireCours(int chargeHoraireCours) {
        this.chargeHoraireCours = chargeHoraireCours;
    }

    public int getChargeHoraireTp() {
        return chargeHoraireTp;
    }

    public void setChargeHoraireTp(int chargeHoraireTp) {
        this.chargeHoraireTp = chargeHoraireTp;
    }

    public int getChargeHoraireTd() {
        return chargeHoraireTd;
    }

    public void setChargeHoraireTd(int chargeHoraireTd) {
        this.chargeHoraireTd = chargeHoraireTd;
    }

    public int getChargeHoraireGlobale() {
        return chargeHoraireGlobale;
    }

    public void setChargeHoraireGlobale(int chargeHoraireGlobale) {
        this.chargeHoraireGlobale = chargeHoraireGlobale;
    }

    public int getIdUe() {
        return idUe;
    }

    public void setIdUe(int idUe) {
        this.idUe = idUe;
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
        if (!(object instanceof Matier)) {
            return false;
        }
        Matier other = (Matier) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication5.Matier[ id=" + id + " ]";
    }
    
}
