package ex3;
public class Zoo {

	private String nom;
	private SavaneAfricaine savaneAfricaine;
	private ZoneCarnivore zoneCarnivore;
	private FermeReptile fermeReptile;
	private Aquarium aquarium;
	
	public Zoo(String nom){

		this.nom = nom;
		this.savaneAfricaine =new SavaneAfricaine();
		this.zoneCarnivore =new ZoneCarnivore();
		this.fermeReptile =new FermeReptile();
		this.aquarium =new Aquarium();
	}
	
	public void addAnimal(Animal animal ){
		String nomClasse =animal.getClass().getName().substring(animal.getClass().getName().lastIndexOf(".")+1);
		if (nomClasse.equalsIgnoreCase("MAMMIFERE") && animal.getComportementAlimentaire().equalsIgnoreCase("CARNIVORE")){
			zoneCarnivore.addAnimal(animal);
		}
		else if (nomClasse.equalsIgnoreCase("MAMMIFERE") && animal.getComportementAlimentaire().equalsIgnoreCase("HERBIVORE")){
			savaneAfricaine.addAnimal(animal);
		}
		else if (nomClasse.equalsIgnoreCase("REPTILE")){
			fermeReptile.addAnimal(animal);
		}
		else if (nomClasse.equalsIgnoreCase("POISSON")){
			aquarium.addAnimal(animal);
		}
	}
	
	public void afficherListeAnimaux(){
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}