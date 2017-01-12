package com.MiniProjetGestionDetude.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.MiniProjetGestionDetude.entites.FicheVoeux;
import com.MiniProjetGestionDetude.service.FicheVoeuxService;

@RestController
public class FicheVoeuxController {
	
	@Autowired FicheVoeuxService ficheVoeuxService ; 
	
	@RequestMapping(value="/ficheVoeux",method=RequestMethod.POST)
	public FicheVoeux addfv(@RequestBody FicheVoeux ficheVoeux)
	{
		return ficheVoeuxService.addFicheVoeux(ficheVoeux);
	}
	
	
	@RequestMapping(value="/ficheVoeux",method=RequestMethod.GET)
	public List<FicheVoeux> getAllFv()
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

}
