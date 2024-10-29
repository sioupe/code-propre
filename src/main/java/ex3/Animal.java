package ex3;

public class Animal {
    private String nom;
    private String comportementAlimentaire;


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
