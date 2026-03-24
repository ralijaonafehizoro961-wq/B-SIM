package model;

public class TypeCompte {
	
	protected String Libelle_Cpt;
	protected String Type_Ctp;
	public double Taux;
	protected double Dec_Max_A;
	protected double Plafond_Cte;
	
	public Type_Cte(String libellecpt, String typecpt, double taux, double dec_max_a, double plafond_cte) {
		this.Libelle_Cpt = libellecpt;
		this.Type_Ctp = typecpt;
		this.Taux = taux;
		this.Dec_Max_A = dec_max_a;
		this.Plafond_Cte = plafond_cte;
	}
	
	public Modifier_Taux(double n_taux) {
		this.Taux = n_taux;
	}
	
	//need DBB here
	
	public Afficher_Type() {
		return this.Type_Cpt;
	}
	
	
	
}
