package model;

public class Operation {

	private int n_mvt;
	private String Date_Mvt;
	private double Montant_Mvt;
	private String Type_Mvt;
	
	public Operation() {
	
		this.n_mvt = 0;
		this.Date_Mvt = null;
		this.Montant_Mvt = 0.0;
		this.Type_Mvt = null;
	
	}
	
	public void Ajouter_Mvt(int number, String date, double montant, String type_mvt) {
	
		this.n_mvt = number;
		this.Date_Mvt = date;
		this.Montant_Mvt = montant;
		this.Type_Mvt = type_mvt;
	
	}

}
