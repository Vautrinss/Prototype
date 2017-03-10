package dao;

import businesslogic.UserDAO;

/**
 * 
 */
public abstract class AbstractDAOFactory {

    /**
     * Default constructor
     */
    public AbstractDAOFactory() {
    }

    
    public static final int POSTGRE_DAO_FACTORY = 0;
    
    /**
     * @param connect 
     * @return
     */
    public abstract UserDAO createUserDAO();
   
    public static AbstractDAOFactory createFactory(int type){
        switch(type){
          case POSTGRE_DAO_FACTORY:
            return new PGDAOFactory();
          default:
            return null;
        }
      }
    
    public abstract void connect();

}