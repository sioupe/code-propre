package ex5;

import java.util.ArrayList;
import java.util.List;

public class Caisse {

	private String nom;
	private List<Item> items;
	private float capaciteMax;

	/**
	 * Constructeur
	 *
	 * @param nom
	 * @param capaciteMax
	 */
	public Caisse(String nom,float capaciteMax) {
		super();
		this.nom = nom;
		this.items = new ArrayList<>();
		this.capaciteMax=capaciteMax;
	}

	/** Getter pour l'attribut nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter pour l'attribut nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/** Getter pour l'attribut items
	 * @return the items
	 */
	public List<Item> getItems() {
		return items;
	}

	/** Setter pour l'attribut items
	 * @param items the items to set
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}

	/**
	 * renvoie si la caisse peux accepter un item
	 * @param item
	 * @return vrai ou faux
	 */
	public boolean accepteItem(Item item){
		return (this.capaciteMax-item.getPoids()>=0);
	}

	/**
	 * rajoute un item a la caisse
	 * @param item
	 */
	public void addItem(Item item){
		items.add(item);
	}

	/**
	 * renvoie la taille de la caisse
	 * @return
	 */
	public int tailleCaisse (){
		return items.size();
	}
}
