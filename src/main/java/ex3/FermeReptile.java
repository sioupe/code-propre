package ex3;
import java.util.List;

public class FermeReptile extends Zone {


	/**
	 * constructeur
	 * @param reptile
	 */
	public void addAnimal(Reptile reptile) {

	}
	/**
	 * quandtite de nourriture necessaire par jour
	 * @return la quantite en double
	 */
	public double calculerKgsNourritureParJour(){
		return animals.size() * 0.1;
	}
}