package com.exercice.restapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.exercice.restapi.entity.Ville;
import com.exercice.restapi.repository.VilleRepository;

@Service
public class VilleService {

	private VilleRepository villeRepo;

	@Autowired
	public VilleService(VilleRepository villeRepo) {
		this.villeRepo = villeRepo;

	}

//Get all villes
	public List<Ville> getVilles() {
		// TODO Auto-generated method stub
		return villeRepo.findAll();
	}

    //Insert ville
	public void saveVille(Ville ville) {
		villeRepo.save(ville);
	}

    //Get ville by Id
	public Optional<Ville> getVilleByid(Long id1) {
		return villeRepo.findById(id1);
	}

	// Get Ville by name
	public Ville getByName(String name) {
		return villeRepo.findBynom(name);

	}
}
