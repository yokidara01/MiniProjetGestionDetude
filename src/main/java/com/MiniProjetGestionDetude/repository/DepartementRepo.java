package com.MiniProjetGestionDetude.repository;

import com.MiniProjetGestionDetude.entites.Departement;
import com.MiniProjetGestionDetude.entites.Session;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Aladinne on 27/12/2016.
 */
public interface DepartementRepo extends JpaRepository<Departement,Integer> {
}
