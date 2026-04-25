package model;

public class CompteRemunere extends Compte {

	private double taux;
	private double plafond;

	public CompteRemunere(String num, String date, String libelle, String matr, double t, double pl) {
		
		super(num, date, libelle, matr);
		this.solde = 0;
		this.taux = t;
		this.plafond = pl;
		
	}
	
	public boolean debiterCte(double valeur) {
		if (this.solde - this.solde * this.taux > 0) {
			this.solde -= valeur;
			return true;
		}
		
		else {
			return false;
		}
		
	}
	
	
	public boolean crediterCte(double valeur) {
		if (this.plafond > this.solde + valeur) {
			this.solde += valeur;
			return true;
		} else {
			return false;
		}
	}
	
	public double interetCte() {
		return 0.0;
	}
	
}
