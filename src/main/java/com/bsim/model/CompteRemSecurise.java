package model;

public class CompteRemSecurise extends Compte {

	private double taux;
	private double plafond;

	public CompteRemSecurise(String num, String date, String libelle, String matr, double t, double pl) {
	
		super(num, date, libelle, matr);
		this.solde = 0;
		this.taux = t;
		this.plafond = pl;
	
	}
	
	public double interetCte() {
		return 0.0;
	}
	
	public boolean crediterCte(double valeur) {
		if (this.plafond > this.solde + valeur + this.interetCte()) {
			this.solde += valeur;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean debiterCte (double valeur) {
		if (this.solde + this.interetCte() > valeur * 1.05) {
			this.solde -= valeur;
			return true;
		} else {
			return false;
		}
	}

}
