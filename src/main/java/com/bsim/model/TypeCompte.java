package model;

public class TypeCompte {

	private String libelleCpt;
	private String typeCpt;
	private double taux;
	private double decMaxA;
	private double plafondCte;
	
	public TypeCompte(String l, String t, double ta, double d, double pl) {
	
		this.libelleCpt = l;
		this.typeCpt = t;
		this.taux = ta;
		this.decMaxA = d;
		this.plafondCte = pl;
	
	}
	
	public String getLibelleCpt() {
		return this.libelleCpt;
	}
	
	public String getTypeCpt() {
		return this.typeCpt;
	}
	
	public double getTaux() {
		return this.taux;
	}
	
	public double getDecMaxA() {
		return this.decMaxA;
	}
	
	public double getPlafondCte() {
		return this.plafondCte;
	}
	
	public void setTaux(double new_taux) {
		this.taux = new_taux;
	}
	
	public void setDecMaxA(double new_dec) {
		this.decMaxA = new_dec;
	}
	
	public void setPlafondCte(double new_pl) {
		this.plafondCte = new_pl;
	}
	

}
