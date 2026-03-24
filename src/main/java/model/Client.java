package model;

public class Client {

	private int Matricule;
	private String Nom;
	private String Nom_Naissance;
	private String Prenom;
	private String Adresse;
	private String Ville;
	private String Code_Postal;
	private String Nationalite;
	private String Telephone;
	private String Etat_Civil;
	private String Profession;
	private String Mdp;
	private String Clt_BC;
	
	public Client(int ma, String nom, String nom_naiss, String pre, String Adresse, String ville, String code_postal, String nationalite, String telephone, String etat_civil, String profession, String pswd, String clt_bc) {
	
		this.Matricule = ma;
		this.Nom = nom;
		this.Prenom = pre;
		this.Adresse = Adresse;
		this.Ville = ville;
		this.Code_Postal = code_postal;
		this.Nationalite = nationalite;
		this.Telephone = telephone;
		this.Etat_Civil = etat_civil;
		this.Profession = profession;
		this.Mdp = pswd;
		this.Clt_BC = clt_bc;
		this.Nom_Naissance = nom_naiss;
	
	}
	
	public String Afficher_InfoP() {
		return this.Nationalite + "\n" + this.Code_Postal;
	}

}
