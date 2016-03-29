package edu.ita.softserve;

import java.sql.Date;
import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.ita.softserve.dao.impl.jpa.JpaUserDao;
import edu.ita.softserve.entity.*;
import edu.ita.softserve.service.AdressService;
import edu.ita.softserve.service.BookService;
import edu.ita.softserve.service.InstanceService;
import edu.ita.softserve.service.UserService;
import edu.ita.softserve.util.JPAUtil;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
	UserService service = new UserService();
	AdressService adressService = new AdressService();
	
	Adress adress = new Adress("Lviv", "Lychakivska", "1A", 12);
	
	User user = new User("Ivan ","Ivanov",20,881234567, new Date(2016, 3, 29), adress);
	service.add(user);
	
	
	
    }
}
