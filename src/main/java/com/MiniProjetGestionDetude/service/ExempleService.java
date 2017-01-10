package com.MiniProjetGestionDetude.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MiniProjetGestionDetude.entites.Session;
import com.MiniProjetGestionDetude.repository.SessionRepo;

@Service
public class ExempleService {
	//Faire vos Crud ici 
	@Autowired SessionRepo sessionRepo;
	public List<Session> getAll()
	{
		return sessionRepo.findAll(); 
	}

}
