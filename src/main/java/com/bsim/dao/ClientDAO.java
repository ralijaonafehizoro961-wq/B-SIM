package dao;
import java.sql.*;
import java.util.ArrayList;
import model.Client;
import dao.ConnexionDB;
import model.Compte;

public class ClientDAO {
	
	private Connection connexion;
	
	public ClientDAO() {
		this.connexion = ConnexionDB.getConnexion();
	}
	
	public boolean insererClient(Client c) {
		return false;
	}
	
	public boolean supprimerClient(String matricule) {
		return false;
	}
	
	public Client trouverClient(String matricule) {
		return null;
	}
	
	public boolean mettreAJourClient(Client c) {
		return false;
	}
	
	public ArrayList<Client> listerClients() {
		return null;
	}
}
