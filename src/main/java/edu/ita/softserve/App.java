package edu.ita.softserve;

import java.util.Iterator;
import java.util.List;

import edu.ita.softserve.dao.impl.jpa.JpaGenericDao;
import edu.ita.softserve.dao.impl.jpa.JpaUserDao;
import edu.ita.softserve.entity.Adress;
import edu.ita.softserve.entity.User;
import edu.ita.softserve.util.JPAUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    	 
    	JpaUserDao genericDao = new JpaUserDao();
    	genericDao.setEntityManager(JPAUtil.getEntityManager());
    	/*
    	Adress adress = new Adress();
    	adress.setCity("Lviv");
    	adress.setStreet("Lychakivska");
    	adress.setNumberOfHouse("12");
    	adress.setNumberOfFlat(1);
    	
    	User user = new User();
    	user.setAdress(adress);
    	user.setFirstName("Oleg");
    	user.setSecondName("Scrypka");
    	user.setTelephoneNumber(323478237);
    	
    	genericDao.add(user);
    	*/
    	
    	}
    }

