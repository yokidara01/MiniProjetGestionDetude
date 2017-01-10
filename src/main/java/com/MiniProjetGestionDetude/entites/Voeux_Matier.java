package com.MiniProjetGestionDetude.entites;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Voeux_Matier {

	@Id int id_Voeux_Matier ; 
	 int idMatier;
	 int priorite ; 
	
}
