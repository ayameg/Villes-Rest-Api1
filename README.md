# Villes-Rest-Api1

# Context and description : 
The project is a REST API developed with : SPRING BOOT, SPRING MVC, SPRING DATA, Maven, MySQL
that allows you to  : 
   - display a list of towns(Villes)
   - Insert a new town (ville)
   - Calculate distance between 2 towns (villes) by giving their names
   - Search town(Ville) by ID
   - Search (Ville) by Name 

# Prerequities :
Install :
 - Docker and Docker compose in your local machine.
 - Postman to test the API

 To run the project, type: 
docker-compose up, then type : localhost:8080/villes

# Examples : 

* To get all villes : 
 localhost:8080/villes 
 
* To get a ville by id : choose a number 
localhost:8080/1 

* To insert a new ville :
* with POST Http request 
    {
        "id": ,
        "nom": "",
        "latitude": ,
        "longitude": ,
        "direction1": "",
        "direction2": ""
    }

* To calculate the distance: 
type:  localhost:8080/ville1/ville 2 
localhost:8080/Alger/Annaba


