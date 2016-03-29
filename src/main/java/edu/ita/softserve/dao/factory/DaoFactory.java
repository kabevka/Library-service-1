package edu.ita.softserve.dao.factory;

import edu.ita.softserve.dao.impl.AdressDao;
import edu.ita.softserve.dao.impl.BookDao;
import edu.ita.softserve.dao.impl.InstanceDao;
import edu.ita.softserve.dao.impl.TakenDao;
import edu.ita.softserve.dao.impl.UserDao;
import edu.ita.softserve.dao.impl.jpa.JpaAdressDao;
import edu.ita.softserve.dao.impl.jpa.JpaBookDao;
import edu.ita.softserve.dao.impl.jpa.JpaInstanceDao;
import edu.ita.softserve.dao.impl.jpa.JpaTakenDao;
import edu.ita.softserve.dao.impl.jpa.JpaUserDao;
import edu.ita.softserve.entity.Adress;

public class DaoFactory {
	
	private AdressDao adressDao = null;
	private UserDao userDao = null;
	private TakenDao takenDao = null;
	private BookDao bookDao = null;
	private InstanceDao instanceDao = null;
	
	private static DaoFactory instance = null;
	
	private DaoFactory(){
		adressDao = new JpaAdressDao();
		userDao = new JpaUserDao();
		takenDao = new JpaTakenDao();
		bookDao = new JpaBookDao();
		instanceDao = new JpaInstanceDao();
	}
	
	public static synchronized DaoFactory getInstance(){
		if(instance == null){
			instance = new DaoFactory();
		}
		return instance;
	}
	
	public AdressDao getAdressDao(){
		return adressDao;
	}
	
	public  UserDao getUserDao(){
		return userDao;
	}
	public  TakenDao getTakenDao(){
		return takenDao;
	}

	public BookDao getBookDao() {
	    return bookDao;
	}

	public InstanceDao getInstanceDao() {
	    return instanceDao;
	}
	
	
}
