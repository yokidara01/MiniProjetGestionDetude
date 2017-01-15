/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MiniProjetGestionDetude.entites;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author Aladinne
 */
@Entity
@Table(name = "enseingant")
public class Enseingant implements Serializable {
 //get ens by grad then date rec 
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Lob
    @Column(name = "nom")
    private String nom;
    @Basic(optional = false)
    @Lob
    @Column(name = "prenom")
    private String prenom;
    @Basic(optional = false)
   
    private Date DateRecutement;
    @Basic(optional = false)
    @Lob
    @Column(name = "grade")
    private String grade;
    @Basic(optional = false)
    @Lob
    @Column(name = "date_grade")
    private String dateGrade;
    @Basic(optional = false)
    @Lob
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @Column(name = "tel")
    private int tel;
    @Basic(optional = false)
    @Column(name = "id_fiche_voeux")
    private int idFicheVoeux;

    
    private int nbrFv =0 ;
    
    
    public Date getDateRecutement() {
		return DateRecutement;
	}

	public void setDateRecutement(Date dateRecutement) {
		DateRecutement = dateRecutement;
	}

	public int getNbrFv() {
		return nbrFv;
	}

	public void setNbrFv(int nbrFv) {
		this.nbrFv = nbrFv;
	}

	public Enseingant() {
    }

    public Enseingant(Integer id) {
        this.id = id;
    }

    public Enseingant(Integer id, String nom, String prenom, Date DateRecutement, String grade, String dateGrade, String email, int tel, int idFicheVoeux) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.DateRecutement = DateRecutement;
        this.grade = grade;
        this.dateGrade = dateGrade;
        this.email = email;
        this.tel = tel;
        this.idFicheVoeux = idFicheVoeux;
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateRecrutemet() {
        return DateRecutement;
    }

    public void setDateRecrutemet(Date dateRecrutemet) {
        this.DateRecutement = dateRecrutemet;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getDateGrade() {
        return dateGrade;
    }

    public void setDateGrade(String dateGrade) {
        this.dateGrade = dateGrade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public int getIdFicheVoeux() {
        return idFicheVoeux;
    }

    public void setIdFicheVoeux(int idFicheVoeux) {
        this.idFicheVoeux = idFicheVoeux;
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
        if (!(object instanceof Enseingant)) {
            return false;
        }
        Enseingant other = (Enseingant) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication5.Enseingant[ id=" + id + " ]";
    }
    
}
