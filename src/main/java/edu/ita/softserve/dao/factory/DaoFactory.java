package edu.ita.softserve.dao.factory;

import edu.ita.softserve.dao.impl.TakenDao;
import edu.ita.softserve.dao.impl.UserDao;
import edu.ita.softserve.dao.impl.jpa.JpaTakenDao;
import edu.ita.softserve.dao.impl.jpa.JpaUserDao;

public class DaoFactory {
	
	private static UserDao userDao = null;
	private static TakenDao takenDao = null;
	
	private static DaoFactory instance = null;
	
	private DaoFactory(){
		userDao = new JpaUserDao();
		takenDao = new JpaTakenDao();
	}
	
	public synchronized DaoFactory getInstance(){
		if(instance == null){
			instance = new DaoFactory();
		}
		return instance;
	}
	
	public static UserDao getUserDao(){
		return userDao;
	}
	public static TakenDao getTakenDao(){
		return takenDao;
	}	
}
