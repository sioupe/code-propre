package ex3;

import java.util.ArrayList;
import java.util.List;

public abstract class Zone {
    /**
     * la liste des animaux dans la zone
     */
    protected List<Animal> animals;

    /**
     * le constructeur
     */
    public Zone() {
        this.animals = new ArrayList<>();
    }

    /**
     * rajoute un animal dans la zone
     * @param animal
     */
    public void addAnimal(Animal animal){
        animals.add(animal);

    };

    /**
     *  methode abstraite de calcul de la quantite de nourriture par jour necessaire
     * @return la quantite de nourriture necessaire en double
     */
    public abstract double calculerKgsNourritureParJour();
    /**
     * affichage de tout les animaux de la zone
     */
    public void afficherListeAnimaux(){
        for (Animal animal: animals){
            System.out.println(animal.getNom());
        }
    }
    /**
     * compte le nombre d'animaux dans l'enclos
     * @return le nombre d'animaux en int
     */
    public int compterAnimaux(){
        return animals.size();
    }


}
