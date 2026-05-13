package model;

public class CompteSecurise extends Compte {

	private double plafond;

	public CompteSecurise(String num, String date, String libelle, String matr, double pl) {
	
		super(num, date, libelle, matr);
		this.solde = 0;
		this.plafond = pl;
	
	}
	
	public boolean crediterCte (double valeur) {
		if (this.plafond > this.solde + valeur) {
			this.solde += valeur;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean debiterCte (double valeur) {
		if (this.solde > valeur * 1.05) {
			this.solde -= valeur;
			return true;
		} else {
			return false;
		}
	}
	
}
