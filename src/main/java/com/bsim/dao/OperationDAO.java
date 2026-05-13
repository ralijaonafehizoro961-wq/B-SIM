package dao;
import java.sql.*;
import java.util.ArrayList;
import model.Operation;
import dao.ConnexionDB;

public class OperationDAO {

	private Connection connexion;
	
	public OperationDAO() {
		this.connexion = ConnexionDB.getConnexion();
	}
	
	public boolean insererOperation(Operation o) { return false;}
	
	public ArrayList<Operation> listerOperationsDuCompte(String numeroCompte) {
		return null;
	}

}
