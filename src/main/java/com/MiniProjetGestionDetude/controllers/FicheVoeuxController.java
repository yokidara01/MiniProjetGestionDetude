package com.MiniProjetGestionDetude.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.MiniProjetGestionDetude.entites.FicheVoeux;
import com.MiniProjetGestionDetude.entites.Voeux_Matier;
import com.MiniProjetGestionDetude.entites.restBean.FicheVRest;
import com.MiniProjetGestionDetude.repository.MatierVoeuxRepo;
import com.MiniProjetGestionDetude.service.FicheVoeuxService;

@RestController
public class FicheVoeuxController {
	
	@Autowired FicheVoeuxService ficheVoeuxService ; 
	@Autowired MatierVoeuxRepo mvr ; 
	@RequestMapping(value="/ficheVoeux",method=RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
	public FicheVoeux addfv(@RequestBody FicheVRest ficheVoeuxRest)
	{
		return ficheVoeuxService.addFicheVoeux(ficheVoeuxRest);
	}
	
	
	@RequestMapping(value="/ficheVoeux",method=RequestMethod.GET)
	public List<FicheVRest> getAllFv()
	{
	 	return ficheVoeuxService.getAllFicheVoeux();
	}
	
	//get all fiche voeux in a  semester 
	@RequestMapping(value="/ficheVoeux/semestre/{id}",method=RequestMethod.GET)
	public List<FicheVoeux> getAllFvBySemestre(@PathVariable int id)
	{
		return ficheVoeuxService.getFicheVoeuxBySemestre(id);
	}
	
	
	// get list fiche de voeux by prof ID 
	@RequestMapping(value="/ficheVoeux/enseingent/{id}",method=RequestMethod.GET)
	public List<FicheVoeux> getAllFvByEnseingent(@PathVariable int id)
	{
		return ficheVoeuxService.getFicheVoeuxByEnsg(id);
	}
	
	
	
	
	@RequestMapping(value="/ficheVoeuxSorted",method=RequestMethod.GET)
	public List<FicheVRest> getAllFvSorted()
	{
		
		return ficheVoeuxService.getAllFicheVoeuxSorted();
	}

}
