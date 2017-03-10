package businesslogic;

import java.sql.Connection;

public abstract class UserDAO {
	public Connection connect;
	
	public abstract boolean exist(User u);
	
	public UserDAO(Connection connect){
		this.connect=connect;
	}
}
