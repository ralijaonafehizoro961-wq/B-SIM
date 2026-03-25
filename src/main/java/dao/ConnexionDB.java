package dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnexionDB {

    private static Connection connexion = null;

    public static Connection getConnexion() {
        try {
            Properties props = new Properties();
            InputStream input = ConnexionDB.class
                .getClassLoader()
                .getResourceAsStream("config.properties");
            props.load(input);

            String url  = props.getProperty("db.url");
            String user = props.getProperty("db.user");
            String pass = props.getProperty("db.password");

            connexion = DriverManager.getConnection(url, user, pass);

        } catch (Exception e) {
            System.out.println("Erreur connexion : " + e.getMessage());
        }
        return connexion;
    }
}