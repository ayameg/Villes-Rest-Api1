package com.exercice.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exercice.restapi.entity.Ville;

@Repository
public interface VilleRepository extends JpaRepository<Ville,Long> {
	Ville findBynom(String name);
}
