package ex3;
import java.util.List;

public class ZoneCarnivore extends Zone{

	

	/**
	 * quandtite de nourriture necessaire par jour
	 * @return la quantite en double
	 */
	public double calculerKgsNourritureParJour(){
		return animals.size() * 10;
	}
}