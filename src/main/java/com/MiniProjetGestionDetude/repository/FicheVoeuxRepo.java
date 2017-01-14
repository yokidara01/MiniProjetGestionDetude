package com.MiniProjetGestionDetude.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.MiniProjetGestionDetude.entites.*;
/**
 * Created by Aladinne on 27/12/2016.
 */
public interface FicheVoeuxRepo extends JpaRepository<FicheVoeux, Integer>
{
	
	 
	
	public List<FicheVoeux> findByidEnseingent (int id_ens);
	 public List<FicheVoeux> findByidSemestre(int id_semestre);
	 
	
	 
	 @Query("select u from Voeux_Matier u where u.idVoeuxMatier = ?#{[0]}")
	 public List<Voeux_Matier> getMatierFv( int idvf);
	
	 
	 
	 
	 @Query(value ="Select fiche_voeux.id, fiche_voeux.charge_globale_souhaitee, fiche_voeux.contraint_pedagogique, fiche_voeux.contraint_personnels, fiche_voeux.date_saisie, fiche_voeux.heures_supplementaires, fiche_voeux.id_enseingent, fiche_voeux.id_semestre, fiche_voeux.id_voeux, enseingant.grade, DATE_FORMAT(enseingant.DateRecutement, 'Le %d %M %Y') AS DateRecutementFormate from fiche_voeux,enseingant where fiche_voeux.id_enseingent=enseingant.id order by enseingant.grade,enseingant.DateRecutement ASC",nativeQuery = true)
	 public List<FicheVoeux> SortedVF();

}