package model;

public class Client {

	private int matricule;
	private String nom;
	private String nomNaissance;
	private String prenom;
	private String addresse;
	private String ville;
	private String codePostal;
	private String nationalite;
	private String telephone;
	private String etatCivil;
	private String profession;
	private String mdp;
	private String cltBc;
	
	public Client(int ma, String nom, String nom_naiss, String pre, String addresse, String ville, String code_postal, String nationalite, String telephone, String etat_civil, String profession, String pswd, String clt_bc) {
	
		this.matricule = ma;
		this.nom = nom;
		this.nomNaissance = nom_naiss;
		this.prenom = pre;
		this.addresse = addresse;
		this.ville = ville;
		this.codePostal = code_postal;
		this.nationalite = nationalite;
		this.telephone = telephone;
		this.etatCivil = etat_civil;
		this.profession = profession;
		this.mdp = pswd;
		this.cltBc = clt_bc;
		
	}
	
	public int getMatricule() {
		return this.matricule;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getNomNaiss() {
		return this.nomNaissance;
	}
	
	public String getPrenom() {
		return this.prenom;
	}
	
	public String getAddresse() {
		return this.addresse;
	}
	
	public String getVille() {
		return this.ville;
	}
	
	public String getCodePostal() {
		return this.codePostal;
	}
	
	public String getNationalite() {
		return this.nationalite;
	}
	
	public String getTelephone() {
		return this.telephone;
	}
	
	public String getEtatCivil() {
		return this.etatCivil;
	}
	
	public String getProfession() {
		return this.profession;
	}
	
	public String getMdp() {
		return this.mdp;
	}
	
	public String getCltBc() {
		return this.cltBc;
	}
	
	
	
	public void setNom(String new_name) {
		this.nom = new_name;
	}
	
	public void setPrenom(String new_prenom) {
		this.prenom = new_prenom;
	}
	
	public void setAddresse(String new_addresse) {
		this.addresse = new_addresse;
	}
	
	public void setVille(String new_ville) {
		this.ville = new_ville;
	}
	
	public void setCodePostal(String new_code_postal) {
		this.codePostal = new_code_postal;
	}
	
	public void setNationalite(String new_nationalite) {
		this.nationalite = new_nationalite;
	}
	
	public void setTelephone(String new_telephone) {
		this.telephone = new_telephone;
	}
	
	public void setEtatCivil(String new_etat_civil) {
		this.etatCivil = new_etat_civil;
	}
	
	public void setProfession(String new_profession) {
		this.profession = new_profession;
	}
	
	public void setMdp(String new_mdp) {
		this.mdp = new_mdp;
	}
	
	public void setCltBc(String new_clt_bc) {
		this.cltBc = new_clt_bc;
	}
	
	
	public String Afficher_InfoP() {
		return "" + this.matricule + "\n" + this.nom + "\n" + this.nomNaissance + "\n" + this.prenom + "\n" + this.addresse + "\n" + this.ville + "\n" + this.codePostal + "\n" + this.nationalite + "\n" + this.telephone + "\n" + this.etatCivil + "\n" + this.profession + "\n" + this.mdp + "\n" + this.cltBc;
	}

}
