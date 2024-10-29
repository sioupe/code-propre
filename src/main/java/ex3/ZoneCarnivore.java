package ex3;
import java.util.List;

public class ZoneCarnivore extends Zone{

	
	public void afficherListeAnimaux(){
		for (Animal mammifere: animals){
			System.out.println(mammifere.getNom());
		}
	}
	
	public double calculerKgsNourritureParJour(){
		return animals.size() * 10;
	}
}