package ex3;

public class Animal {
    /**
     * nom de l'animal en string
     */
    private String nom;
    /**
     * le comportement alimentaire de l'animal
     */
    private String comportementAlimentaire;

    /**
     *
     * @param nom
     * @param comportementAlimentaire
     */
    public Animal(String nom, String comportementAlimentaire) {
        this.comportementAlimentaire = comportementAlimentaire;
        this.nom = nom;
    }

    /**
     * Getter
     *
     * @return comportementAlimentaire
     */

    public String getComportementAlimentaire() {
        return comportementAlimentaire;
    }

    /**
     * Getter
     *
     * @return nom
     */

    public String getNom() {
        return nom;
    }
}
