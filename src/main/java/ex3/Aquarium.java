package ex3;
import java.util.List;

public class Aquarium extends Zone{

	
	public void addAnimal(Poisson poisson) {
	}
	
	public void afficherListeAnimaux(){
		for (Animal poisson: animals){
			System.out.println(poisson.getNom());
		}
	}
	
	public double calculerKgsNourritureParJour(){
		return animals.size() * 0.2;
	}
}