package com.MiniProjetGestionDetude.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MiniProjetGestionDetude.entites.*;
/**
 * Created by Aladinne on 27/12/2016.
 */
public interface FicheVoeuxRepo extends JpaRepository<FicheVoeux, Integer>
{
	
	public List<FicheVoeux> findByidEnseingent (int id_ens);
	 public List<FicheVoeux> findByidSemestre(int id_semestre);
	
}