package com.exercice.restapi;

import com.exercice.restapi.entity.Ville;
public class TestDistance {
	static double calculDistance(Ville ville1, Ville ville2) 
	{
		
	double	lon1 = Math.toRadians(ville1.getLongitude());
       double  lon2 = Math.toRadians(ville2.getLongitude());
     double   lat1 = Math.toRadians(ville1.getLatitude());
        double lat2 = Math.toRadians(ville2.getLatitude());
	
		// Haversine formula
        double dlon = lon2 - lon1;
        double dlat = lat2 - lat1;
        double a = Math.pow(Math.sin(dlat / 2), 2)
                 + Math.cos(lat1) * Math.cos(lat2)
                 * Math.pow(Math.sin(dlon / 2),2);
             
        double c = 2 * Math.asin(Math.sqrt(a));
 
   
        double r = 6371;
 
        // calculate the result
        return(c * r);
    }
	
	
	public static void main(String[] args) {
Ville ville1=new Ville("Alger",6.166667,35.550000);
Ville ville2=new Ville("Batna",3.042048,36.752887);

System.out.println(calculDistance(ville1,ville2)+" K.M");		

	}

}
