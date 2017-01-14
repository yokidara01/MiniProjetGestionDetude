package com.MiniProjetGestionDetude.entites.restBean;

import java.util.List;

public class FicheVRest {

	public  int id ;
	public int charge_globale_souhaitee;
	public String contraint_pedagogique ; 
	public String contraint_personnels ; 
	public String 	date_saisie; 
	public Boolean heures_supplementaires ; 
	public int id_enseingent ;
	public	int id_semestre ;
	public List<MatierVoeuxRest> matierVoeuxRests ;
	
	
}
