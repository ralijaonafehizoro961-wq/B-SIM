package dao;
import java.sql.*;
import model.Compte;
import java.util.ArrayList;
import dao.ConnexionDB;


public class CompteDAO {

	private Connection connexion;
	
	public CompteDAO() {
		this.connexion = ConnexionDB.getConnexion();
	}
	
	public boolean insererCompte(Compte c) { return false;} 	
	
	public boolean supprimerCompte(String numeroCompte) { return false;}
	
	public Compte trouverCompte(String numeroCompte) { return null;}
	
	public ArrayList<Compte> listeCompteDuClient(String matricule) { return null;}
}
