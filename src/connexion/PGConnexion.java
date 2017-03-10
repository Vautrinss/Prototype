package connexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class PGConnexion {
	public static Connection  connect;

	private static final String url = "jdbc:postgresql://localhost:5400/login";

	private static final String user = "postgres";

	private static final String passwd = "wup";

	public static Connection getInstance(){
		if (connect == null){
			try {
				//Class.forName("org.postgresql.Driver");
				System.out.println("Driver O.K.");


				connect= DriverManager.getConnection(url, user, passwd);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return connect; 
	}
}
