package edu.ita.softserve;

import edu.ita.softserve.dao.impl.jpa.JpaGenericDao;
import edu.ita.softserve.dao.impl.jpa.JpaUserDao;
import edu.ita.softserve.entity.User;
import edu.ita.softserve.util.JPAUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    	 
    	JpaGenericDao<User, Long> genericDao = new JpaUserDao();
    	genericDao.setEntityManager(JPAUtil.getEntityManager());
    	
    	User user = new User();
    	user.setFirstName("Ivan");
    	genericDao.add(user);
    	System.out.println("end");     
    }
}
