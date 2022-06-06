package com.exercice.restapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.exercice.restapi.entity.Ville;
import com.exercice.restapi.exception.ApiRequestException;
import com.exercice.restapi.service.VilleService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController

@Api("API pour les opérations CRUD sur les villes.")

public class VilleController {

	private VilleService serviceVille;

	// Inject the service via construtor
	@Autowired
	public VilleController(VilleService serviceVille) {

		this.serviceVille = serviceVille;
	}

	// Get ville by id
	@ApiOperation(value = "Récupèrer la ville à partir de son ID ")

	@GetMapping("/villes/{id}")
	public Optional<Ville> getVilleByid(@PathVariable Long id) {
		if (serviceVille.getVilleByid(id).isPresent()) {
			return serviceVille.getVilleByid(id);
		} else {
			throw new ApiRequestException("Id de la ville introuvable ! ");
		}
	}

	// Calculate the distance between 2 villes
	@ApiOperation(value = "Calculer la distance entre 2 villes ")

	@GetMapping("/villes/{ville1}/{ville2}")
	public double calculDistance(@PathVariable String ville1, @PathVariable String ville2) {
		if (serviceVille.getByName(ville1)!=null && serviceVille.getByName(ville2)!=null )
		{

		double longitude1 = Math.toRadians(serviceVille.getByName(ville1).getLongitude());
		double longitude2 = Math.toRadians(serviceVille.getByName(ville2).getLongitude());
		double latitude1 = Math.toRadians(serviceVille.getByName(ville1).getLatitude());
		double latitude2 = Math.toRadians(serviceVille.getByName(ville2).getLatitude());

		// Haversine formula
		double dlon = longitude2 - longitude1;
		double dlat = latitude2 - latitude1;
		double a = Math.pow(Math.sin(dlat / 2), 2)
				+ Math.cos(latitude1) * Math.cos(latitude2) * Math.pow(Math.sin(dlon / 2), 2);

		double c = 2 * Math.asin(Math.sqrt(a));

		// Radius of earth in kilometers.
		double r = 6371;

		// calculate the result
		return (c * r);
}
else  throw new ApiRequestException("Ville 1 ou ville 2 Introuvable ! ");

	}

	// Display all  villes
	@ApiOperation(value = "Récupèrer toutes les villes ")

	@GetMapping("/villes")
	public List<Ville> getVilles() {

		if (serviceVille.getVilles().isEmpty()) {
			throw new ApiRequestException("Liste des villes vide ! ");
		} else
			return serviceVille.getVilles();
	}

	// Insert  ville
	@ApiOperation(value = "Insérer une ville ")

	@PostMapping("/villes")
	public void saveVille(@RequestBody Ville ville) {
		serviceVille.saveVille(ville);

	}
}
