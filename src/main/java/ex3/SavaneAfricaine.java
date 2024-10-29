package ex3;
import java.util.List;

public class SavaneAfricaine extends Zone {

	
	public void afficherListeAnimaux(){
		for (Animal mammifere: animals){
			System.out.println(mammifere.getNom());
		}
	}
	
	public int compterAnimaux(){
		return animals.size();
	}
	
	public int calculerKgsNourritureParJour(){
		return animals.size() * 10;
	}
}