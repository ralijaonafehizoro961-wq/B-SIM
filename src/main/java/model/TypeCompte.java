package model;

public class TypeCompte {
	
	protected String Libelle_Cpt;
	protected String Type_Cpt;
	protected double Taux;
	protected double Dec_Max_A;
	protected double Plafond_Cte;
	
	public TypeCompte(String libellecpt, String typecpt, double taux, double dec_max_a, double plafond_cte) {
		this.Libelle_Cpt = libellecpt;
		this.Type_Cpt = typecpt;
		this.Taux = taux;
		this.Dec_Max_A = dec_max_a;
		this.Plafond_Cte = plafond_cte;
	}
	
	public void Modifier_Taux(double n_taux) {
		this.Taux = n_taux;
	}
	
	//need DBB here
	
	public String Afficher_Type() {
		return this.Type_Cpt;
	}
	
	
	
}
