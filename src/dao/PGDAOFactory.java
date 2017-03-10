package dao;

import java.sql.Connection;

import businesslogic.UserDAO;
import connexion.PGConnexion;

public class PGDAOFactory extends AbstractDAOFactory{
	public  Connection connect = null;



	public UserDAO createUserDAO(){
		return new PGUserDAO(connect);

	}

	public void connect(){
		this.connect=PGConnexion.getInstance();
	}

}
