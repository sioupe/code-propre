package ex3;
import java.util.List;

public class FermeReptile extends Zone {



	public void addAnimal(Reptile reptile) {

	}
	
	public void afficherListeAnimaux(){
		for (Animal reptile: animals){
			System.out.println(reptile.getNom());
		}
	}
	
	public int compterAnimaux(){
		return animals.size();
	}
	
	public double calculerKgsNourritureParJour(){
		return animals.size() * 0.1;
	}
}