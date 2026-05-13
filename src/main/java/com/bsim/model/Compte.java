package model;

public class Compte {

	protected String numeroCompte;
	protected double solde;
	protected String dateOuvert;
	protected String libelleCte;
	protected String matricule;
	
	public Compte(String numero,String date, String libelle, String matr) {
		
		this.numeroCompte = numero;
		this.solde = 0;
		this.dateOuvert = date;
		this.libelleCte = libelle;
		this.matricule = matr;
	
	}
	
	
	public boolean debiterCte(double valeur) {
		if (this.solde >= valeur) {
			this.solde -= valeur;
			return true;
		} else {
			return false;
		}
	}
	
	
	public boolean crediterCte(double valeur) {
		this.solde += valeur;
		return true;
	}
	
	public double interetCte() {
		return 0.0;
	}
	
	public String getNumeroCompte() {
		return this.numeroCompte;
	}
	
	public double getSolde() {
		return this.solde;
	}
	
	public String getDateOuvert() {
		return this.dateOuvert;
	}
	
	public String getLibelleCte() {
		return this.libelleCte;
	}
	
	public String getMatricule() {
		return this.matricule;
	}
	
	
	
	public void setSolde(double new_solde) {
		this.solde = new_solde;
	}
	
	public void setDateOuvert(String new_date_ouvert) {
		this.dateOuvert = new_date_ouvert;
	}
	
	public void setLibelleCte(String new_libelle) {
		this.libelleCte = new_libelle;
	}
	
}
