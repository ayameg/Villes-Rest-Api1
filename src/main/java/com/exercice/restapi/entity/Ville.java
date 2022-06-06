package com.exercice.restapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ville {
	@Id
	@GeneratedValue
	private Long id;
	private String nom;
	private double latitude;
	private double longitude;
	private char  direction1;
	private char direction2;
	
	
	//Setters & Getters
	
	
	
	public Long getId() {
		return id;
	}
		
		public void setId(Long id) {
		this.id = id;
	}
	
	public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	public char getDirection1() {
		return direction1;
	}
	public void setDirection1(char direction1) {
		this.direction1 = direction1;
	}
	public char getDirection2() {
		return direction2;
	}
	public void setDirection2(char direction2) {
		this.direction2 = direction2;
	}
	
   //Constructors
	
	public Ville(String ville, double latitude, double longitude) {
		super();
		this.nom = ville;
		this.latitude = latitude;
		this.longitude = longitude;
	}
public Ville() {
}
	public Ville(String ville,  char direction1, double latitude, char direction2,double longitude) {
		super();
		this.nom= ville;
		this.latitude = latitude;
		this.longitude = longitude;
		this.direction1 = direction1;
		this.direction2 = direction2;
	}

}
