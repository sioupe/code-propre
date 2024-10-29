package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {
	/**
	 * la liste des caisse présent dans l'inventaire
	 */
	private List<Caisse> caisses;

	/**
	 * construicteur
	 */
	public Inventaire() {
		caisses = new ArrayList<>();
	}

	/**
	 * rajoute un item dans l'inventaire si il rentre dans une des caisses porté
	 * @param item
	 */
	public void addItem(Item item) {

		//TODO Faites évoluer ce code (idée: c'est le caisse qui doit "savoir" si elle peut accepter un objet ou non)
		for (Caisse caisse :caisses ) {
			if (caisse.accepteItem(item)){
				caisse.addItem(item);
			}
		}

	}

	/**
	 * renvoie la taille totale de l'inventaire (nombre d'item total)
	 * @return un int
	 */
	public int taille() {
		int taille =0;
		for (Caisse caisse :caisses ) {
			taille += caisse.tailleCaisse();
		}
		return taille;
	}
}
