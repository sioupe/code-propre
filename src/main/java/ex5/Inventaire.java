package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

	private List<Caisse> caisses;

	public Inventaire() {
		caisses = new ArrayList<>();
	}

	public void addItem(Item item) {

		//TODO Faites évoluer ce code (idée: c'est le caisse qui doit "savoir" si elle peut accepter un objet ou non)
		for (Caisse caisse :caisses ) {
			if (caisse.accepteItem(item)){
				caisse.addItem(item);
			}
		}

	}

	public int taille() {
		int taille =0;
		for (Caisse caisse :caisses ) {
			taille += caisse.tailleCaisse();
		}
		//TODO faites évoluer ce code.
		return taille;
	}
}
