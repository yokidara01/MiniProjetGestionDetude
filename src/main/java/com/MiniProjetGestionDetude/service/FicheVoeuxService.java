package com.MiniProjetGestionDetude.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MiniProjetGestionDetude.entites.FicheVoeux;
import com.MiniProjetGestionDetude.entites.Matier;
import com.MiniProjetGestionDetude.repository.EnseingantRepo;
import com.MiniProjetGestionDetude.repository.FicheVoeuxRepo;
import com.MiniProjetGestionDetude.repository.MatierRepo;
import com.MiniProjetGestionDetude.repository.MatierVoeuxRepo;

@Service
public class FicheVoeuxService {
	
	@Autowired EnseingantRepo enseingantRepo ; 
	 
	@Autowired FicheVoeuxRepo ficheVoeuxRepo ; 
	 
	
	public FicheVoeux addFicheVoeux(FicheVoeux ficheVoeux)
	{
		return ficheVoeuxRepo.save(ficheVoeux);
	}
	
	public FicheVoeux GetFicheVoeux(int id)
	{
		return ficheVoeuxRepo.findOne(id);
	}
	
	public List<FicheVoeux> getAllFicheVoeux()
	{
		return ficheVoeuxRepo.findAll();
	}
	
	public List<FicheVoeux> getFicheVoeuxByEnsg(int idEns)
	{
		return  ficheVoeuxRepo.findByidEnseingent(idEns);
	}
	
	
	 public List<FicheVoeux> getFicheVoeuxBySemestre(int idsemestre)
	{
		return  ficheVoeuxRepo.findByidSemestre(idsemestre);
	} 
	
	 
	 
	public void DeleteFV(FicheVoeux ficheVoeux )
	{
		   ficheVoeuxRepo.delete(ficheVoeux);
	}
 
	

}
