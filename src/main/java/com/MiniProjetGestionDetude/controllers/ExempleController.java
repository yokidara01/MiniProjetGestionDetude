package com.MiniProjetGestionDetude.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.MiniProjetGestionDetude.entites.FicheVoeux;
import com.MiniProjetGestionDetude.entites.Session;
import com.MiniProjetGestionDetude.entites.Voeux_Matier;
import com.MiniProjetGestionDetude.repository.FicheVoeuxRepo;
import com.MiniProjetGestionDetude.service.ExempleService;

@RestController
public class ExempleController {

	
	@Autowired
	private ExempleService exempleService;
	@Autowired private FicheVoeuxRepo fvr; 
	
	@RequestMapping(value="/session",method=RequestMethod.GET)
	public List<Session> addSession() {
		return exempleService.getAll();
	}
	
	@RequestMapping(value="/matierFv/{id}",method=RequestMethod.GET)
	 
	public List<Voeux_Matier> getmatierFv(@PathVariable int id)
	{
		return fvr.getMatierFv(id);
	}
	
}
