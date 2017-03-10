package dao;

import java.sql.ResultSet;
import java.sql.Statement;

import businesslogic.*;

public class PGUserDAO extends UserDAO{
	
	  public PGUserDAO(java.sql.Connection connect) {
			super(connect);
		}

	  
		@Override
		public boolean exist(User u) {
			// TODO Auto-generated method stub
			
			//boolean that allows to know if the user exists
			boolean canConnected = false;
			//int that allows to know the number of Instance of the User u in the DB
			int exist=0;
			
			//we get the login and the password of the User u
			String username=u.getusername();
			String password=u.getpassword();
			Statement state=null;
			try{
			System.out.println("lol");
			state = ((java.sql.Connection)connect).createStatement();
			ResultSet name=state.executeQuery("Select Count(*) as nb from test where name='"+username+"' and password='"+password+"';");   
			while(name.next())
				exist = name.getInt("nb");
			if(exist!=0){
				canConnected= true;
			}
			}catch (Exception e) {
				e.printStackTrace();
			}
			
			return canConnected;
		}
	    
}
