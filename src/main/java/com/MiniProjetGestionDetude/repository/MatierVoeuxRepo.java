package com.MiniProjetGestionDetude.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MiniProjetGestionDetude.entites.Voeux_Matier;

 

public interface MatierVoeuxRepo extends JpaRepository<Voeux_Matier	,Integer>{

	 List<Voeux_Matier> findByIdVoeuxMatier(int idfv);
	 
	 
	
	
}
