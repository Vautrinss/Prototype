package facade;

import java.util.*;

import businesslogic.User;

/**
 * 
 */
public class Facade {

    /**
     * Default constructor
     */
    public Facade() {
    }

    /**
     * Session
     */
    public static User user=null;
    
    /**
     * @param login 
     * @param pwd 
     * @return
     */
    public static boolean login(String username, String password) {
    	User user=new User(username,password);
        if( User.login(user)){       	
        	Facade.getSession(user);
        }
        return User.login(user);
    }
    
    public static User getSession(User u){
    	if (user==null){
    		Facade.user = u;
    	}
    	return Facade.user;
    }
    
    public static boolean isConnected(){
    	boolean isConnected = false;
    	if (Facade.user!=null){
    		isConnected=true;
    	}
    	return isConnected;
    }

    

}