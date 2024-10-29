package ex2;

public class LivretA extends CompteBancaire {


	/** tauxRemuneration : taux de rémunération*/
	private double tauxRemuneration;


	/** constructeur d'un livret A
	 * @param solde
	 * @param tauxRemuneration

	 */
	public LivretA(double solde, double tauxRemuneration) {
		super(solde,0);
		this.tauxRemuneration=tauxRemuneration;

	}


	/** Applique la remuneration annuel du livret A
	 */
	public void appliquerRemuAnnuelle(){

			setSolde(getSolde()*this.tauxRemuneration/100);
		}
	/** Getter for tauxRemuneration
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}
	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
}
