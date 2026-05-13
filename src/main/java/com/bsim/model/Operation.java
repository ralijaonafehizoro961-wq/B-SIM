package model;

public class Operation {

	private int numeroMvt;
	private String dateMvt;
	private double montantMvt;
	private String typeMvt;
	private String numeroCompte;
	
	public Operation(int num, String date, double m, String type, String numCpt) {
		this.numeroMvt = num;
		this.dateMvt = date;
		this.montantMvt = m;
		this.typeMvt = type;
		this.numeroCompte = numCpt;
	}
	
	public int getNumeroMvt() {
		return this.numeroMvt;
	}
	
	public String getDateMvt() {
		return this.dateMvt;
	}
	
	public double getMontantMvt() {
		return this.montantMvt;
	}
	
	public String getTypeMvt() {
		return this.typeMvt;
	}
	
	public String getNumeroCompte() {
		return this.numeroCompte;
	}
	
}
