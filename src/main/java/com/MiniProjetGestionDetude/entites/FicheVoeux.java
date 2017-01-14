/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MiniProjetGestionDetude.entites;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Aladinne
 */
@Entity
@Table(name = "fiche_voeux")

public class FicheVoeux implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Lob
    @Column(name = "contraint_pedagogique")
    private String contraintPedagogique;
    @Basic(optional = false)
    @Lob
    @Column(name = "contraint_personnels")
    private String contraintPersonnels;
    @Basic(optional = false)
    @Lob
    @Column(name = "date_saisie")
    private String dateSaisie;
    @Basic(optional = false)
    @Column(name = "id_semestre")
    private int idSemestre;
    @Basic(optional = false)
    @Column(name = "id_enseingent")
    private int idEnseingent;
    @Basic(optional = false)
    @Column(name = "id_voeux")
    private int idVoeux_Matier;
    
    
    
    public int getIdVoeux_Matier() {
		return idVoeux_Matier;
	}

	public void setIdVoeux_Matier(int idVoeux_Matier) {
		this.idVoeux_Matier = idVoeux_Matier;
	}

	public void setIdEnseingent(int idEnseingent) {
		this.idEnseingent = idEnseingent;
	}

	private Boolean heures_supplementaires ; 
    private int charge_Globale_Souhaitee; 

    
    
    public Boolean getHeures_supplementaires() {
		return heures_supplementaires;
	}

	public void setHeures_supplementaires(Boolean heures_supplementaires) {
		this.heures_supplementaires = heures_supplementaires;
	}

	public int getCharge_Globale_Souhaitee() {
		return charge_Globale_Souhaitee;
	}

	public void setCharge_Globale_Souhaitee(int charge_Globale_Souhaitee) {
		this.charge_Globale_Souhaitee = charge_Globale_Souhaitee;
	}

	public FicheVoeux() {
    }

    public FicheVoeux(Integer id) {
        this.id = id;
    }

    public FicheVoeux(Integer id, String contraintPedagogique, String contraintPersonnels, String dateSaisie, int idSemestre, int idEnseingent, int idVoeux) {
        this.id = id;
        this.contraintPedagogique = contraintPedagogique;
        this.contraintPersonnels = contraintPersonnels;
        this.dateSaisie = dateSaisie;
        this.idSemestre = idSemestre;
        this.idEnseingent = idEnseingent;
        this.idVoeux_Matier = idVoeux;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContraintPedagogique() {
        return contraintPedagogique;
    }

    public void setContraintPedagogique(String contraintPedagogique) {
        this.contraintPedagogique = contraintPedagogique;
    }

    public String getContraintPersonnels() {
        return contraintPersonnels;
    }

    public void setContraintPersonnels(String contraintPersonnels) {
        this.contraintPersonnels = contraintPersonnels;
    }

    public String getDateSaisie() {
        return dateSaisie;
    }

    public void setDateSaisie(String dateSaisie) {
        this.dateSaisie = dateSaisie;
    }

    public int getIdSemestre() {
        return idSemestre;
    }

    public void setIdSemestre(int idSemestre) {
        this.idSemestre = idSemestre;
    }

    public int getIdEnseingent() {
        return idEnseingent;
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
        if (!(object instanceof FicheVoeux)) {
            return false;
        }
        FicheVoeux other = (FicheVoeux) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication5.FicheVoeux[ id=" + id + " ]";
    }
    
}
