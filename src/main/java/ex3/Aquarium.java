package ex3;
import java.util.List;

public class Aquarium extends Zone{

	/**
	 *constructeur
	 * @param poisson
	 */
	public void addAnimal(Poisson poisson) {
	}



	/**
	 * quandtite de nourriture necessaire par jour
	 * @return la quantite en double
	 */
	public double calculerKgsNourritureParJour(){
		return animals.size() * 0.2;
	}
}