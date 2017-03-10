package businesslogic;

import dao.AbstractDAOFactory;

/**
 * 
 */
public class User {

	/**
	 * Default constructor
	 */
	public User(String username, String password) {
		this.username=username;
		this.password=password;
	}

	/**
	 * 
	 */
	public String username;

	/**
	 * 
	 */
	public String password;


	public String getusername() {
		return username;
	}


	public void setusername(String username) {
		this.username = username;
	}


	public String getpassword() {
		return password;
	}


	public void setpassword(String password) {
		this.password = password;
	}


	/**
	 * @param username 
	 * @param password 
	 * @return
	 */
	public static boolean login(User user) {
		boolean canlogin = false;
		AbstractDAOFactory adf=AbstractDAOFactory.createFactory(AbstractDAOFactory.POSTGRE_DAO_FACTORY);
		adf.connect();
		UserDAO daouser = adf.createUserDAO();
		canlogin=daouser.exist(user);
		return canlogin;
	}

}