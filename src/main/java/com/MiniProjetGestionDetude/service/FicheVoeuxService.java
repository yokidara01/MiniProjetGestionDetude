package com.MiniProjetGestionDetude.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MiniProjetGestionDetude.entites.FicheVoeux;
import com.MiniProjetGestionDetude.entites.Matier;
import com.MiniProjetGestionDetude.entites.Voeux_Matier;
import com.MiniProjetGestionDetude.entites.restBean.FicheVRest;
import com.MiniProjetGestionDetude.entites.restBean.MatierVoeuxRest;
import com.MiniProjetGestionDetude.repository.EnseingantRepo;
import com.MiniProjetGestionDetude.repository.FicheVoeuxRepo;
import com.MiniProjetGestionDetude.repository.MatierRepo;
import com.MiniProjetGestionDetude.repository.MatierVoeuxRepo;

@Service
public class FicheVoeuxService {
	
	@Autowired EnseingantRepo enseingantRepo ; 
	 
	@Autowired FicheVoeuxRepo ficheVoeuxRepo ; 
	 @Autowired MatierVoeuxRepo matierVoeuxRepo;
	
	public FicheVoeux addFicheVoeux(FicheVRest ficheVoeuxR)
	{
		FicheVoeux ficheVoeux = new FicheVoeux() ;
		List<Voeux_Matier> vm = new ArrayList<>() ; 
		Unpack(ficheVoeuxR,ficheVoeux,vm);
		
		for (Voeux_Matier m: vm)
		{
			m.setIdVoeuxMatier(ficheVoeux.getIdVoeux_Matier());
			matierVoeuxRepo.save(m);
		}
		 
		return ficheVoeuxRepo.save(ficheVoeux);
	}
	
	

	public FicheVoeux GetFicheVoeux(int id)
	{
		return ficheVoeuxRepo.findOne(id);
	}
	
	public List<FicheVRest> getAllFicheVoeux()
	{
		List<FicheVoeux> fv = ficheVoeuxRepo.findAll();
		List<FicheVRest> Result = new ArrayList<>();
		
		for(FicheVoeux f : fv)
		{
			List<Voeux_Matier> vm = matierVoeuxRepo.findByIdVoeuxMatier(f.getIdVoeux_Matier());
			FicheVRest ResultRest = FillRestFV(f, vm);
			Result.add(ResultRest);
		}
		
		return Result ;
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
 
	public List<FicheVRest> getAllFicheVoeuxSorted()
	{
		List<FicheVoeux> fv = ficheVoeuxRepo.SortedVF();
		List<FicheVRest> Result = new ArrayList<>();
		
		for(FicheVoeux f : fv)
		{
			List<Voeux_Matier> vm = matierVoeuxRepo.findByIdVoeuxMatier(f.getIdVoeux_Matier());
			FicheVRest ResultRest = FillRestFV(f, vm);
			Result.add(ResultRest);
		}
		
		return Result ;
	}
	
	
	public FicheVRest FillRestFV (FicheVoeux vf , List<Voeux_Matier> Listvm )
	{
		FicheVRest fvr  = new FicheVRest() ; 
		
		fvr.charge_globale_souhaitee=vf.getCharge_Globale_Souhaitee(); 
		fvr.contraint_pedagogique=vf.getContraintPedagogique();
		fvr.contraint_personnels=vf.getContraintPersonnels();
		fvr.date_saisie=vf.getDateSaisie(); 
		fvr.heures_supplementaires=vf.getHeures_supplementaires() ; 
		fvr.id=vf.getId();
		fvr.id_enseingent=vf.getIdEnseingent();
		fvr.id_semestre=vf.getIdSemestre(); 
		
		List<MatierVoeuxRest> listRest = new ArrayList<>();
		
		
		for(Voeux_Matier mvr : Listvm)
		{
			MatierVoeuxRest m = new MatierVoeuxRest() ; 
			m.id=mvr.getId();
			m.id_matier=mvr.getIdMatier();
			m.priorite=mvr.getPriorite();
			listRest.add(m);
			
		}
		
		fvr.matierVoeuxRests=listRest;
		
		return fvr ;
	}
	
	
	private void Unpack(FicheVRest ficheVoeuxR, FicheVoeux ficheVoeux, List<Voeux_Matier> vm) {
		
		
		// TODO Auto-generated method stub
		
	}
	

}
