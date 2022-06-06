package com.exercice.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.exercice.restapi.entity.Ville;
import com.exercice.restapi.repository.VilleRepository;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2

public class RestApiVillesApplication  implements CommandLineRunner  {

	@Autowired
	VilleRepository rp;
	public static void main(String[] args) {
		SpringApplication.run(RestApiVillesApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		Ville ville1=new Ville("Alger",'N',1266.36,'E',365.32);
		Ville ville2=new Ville("Batna",'S',-63.36,'E',-653.32);
		Ville ville3=new Ville("Constantine",'N',256.36,'E',53.32);
		Ville ville4=new Ville("Ghardaia",'N',42689,'E',-3.32);
		Ville ville5=new Ville("Annaba",'S',42689,'W',-3.32);
		
          rp.save(ville1);
          rp.save(ville2);

          rp.save(ville3);
          rp.save(ville4);
          rp.save(ville5);
	}

}
