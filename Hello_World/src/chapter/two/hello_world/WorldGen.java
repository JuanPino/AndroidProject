package chapter.two.hello_world;

// WorldGen class contains WorldGen(World) objects 

public class WorldGen {
	String planetName = "Earth";
	int planetMass;
	double planetGravity;
	int planetColonies;
	long planetPopulation;
	int planetBases;
	int planetMilitary;
	boolean planetProtection;
	
	//WorldGen Constructor Method
	
	public WorldGen (String name, int mass, double gravity, int i){
		planetName = name;
		planetMass = mass;
		planetGravity = gravity;
		planetColonies = 0;
		planetPopulation = 0;
		planetBases = 0;
		planetMilitary = 0;
		planetProtection = false;
		
	}
	
	// WorldGen Functions
	
	 void setPlanetColonies(int numColonies) {
		planetColonies += numColonies;
	}
	 int getPlanetColonies() {
		return planetColonies;
	}
	 void setPlanetMilitary(int numBases) {
		planetBases += numBases;
	}
	 int getPlanetMilitary() {
		return planetMilitary;
	}
	 void turnForceFieldOn(){
		 planetProtection = true;
	 }
	 void turnForceFieldOff(){
		 planetProtection = false;
	 }
	 boolean getForceFieldState(){
		 return planetProtection;
	 }
	 void setColonyImmigration(int numColonists){
		  planetPopulation += numColonists;
	 }
	 long getColonyImmigration(){
		 return planetPopulation;
	 }
	 void setBaseProtection(int numForces){
		 planetMilitary += numForces; 
	 }
	 int getBaseProtection(){
		 return planetMilitary;
	 }
	 
	 
	 

}
