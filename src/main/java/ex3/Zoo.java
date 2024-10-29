package ex3;
public class Zoo {
	/**
	 * nom du zoo
	 */
	private String nom;
	/**
	 * zone de la savane africaine du zoo
	 */
	private SavaneAfricaine savaneAfricaine;
	/**
	 * zone Carnivore du zoo
	 */
	private ZoneCarnivore zoneCarnivore;
	/**
	 * ferme reptile du zoo
	 */
	private FermeReptile fermeReptile;
	/**
	 * l'aquarium du zoo
	 */
	private Aquarium aquarium;

	/**
	 * constructeur
	 * @param nom
	 */
	public Zoo(String nom){

		this.nom = nom;
		this.savaneAfricaine =new SavaneAfricaine();
		this.zoneCarnivore =new ZoneCarnivore();
		this.fermeReptile =new FermeReptile();
		this.aquarium =new Aquarium();
	}

	/**
	 * rajoute un animal dans le zoo et le place dans la zone qui lui convient
	 * @param animal
	 */
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

	/**
	 * affiche tout les animaux du zoo
	 */
	public void afficherListeAnimaux(){
		System.out.println("\nsavane affricaine : ");
		savaneAfricaine.afficherListeAnimaux();
		System.out.println("\nzone carnivore : ");
		zoneCarnivore.afficherListeAnimaux();
		System.out.println("\nferme des reptiles : ");
		fermeReptile.afficherListeAnimaux();
		System.out.println("\nl'aquarium : ");
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