package com.MiniProjetGestionDetude.entites;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Voeux_Matier {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
	private  int id ;
	@Column(name="id_Voeux_Matier")
	private int idVoeuxMatier ; 
	private int idMatier;
	private int priorite ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdVoeuxMatier() {
		return idVoeuxMatier;
	}
	public void setIdVoeuxMatier(int idVoeux_Matier) {
		this.idVoeuxMatier = idVoeux_Matier;
	}
	public int getIdMatier() {
		return idMatier;
	}
	public void setIdMatier(int idMatier) {
		this.idMatier = idMatier;
	}
	public int getPriorite() {
		return priorite;
	}
	public void setPriorite(int priorite) {
		this.priorite = priorite;
	}
	public Voeux_Matier(int id, int idVoeux_Matier, int idMatier, int priorite) {
		super();
		this.id = id;
		this.idVoeuxMatier = idVoeux_Matier;
		this.idMatier = idMatier;
		this.priorite = priorite;
	}
	public Voeux_Matier() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
	
}
