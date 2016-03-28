package edu.ita.softserve;


import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import edu.ita.softserve.entity.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    	/*
    	JpaUserDao genericDao = new JpaUserDao();
    	genericDao.setEntityManager(JPAUtil.getEntityManager());
    	
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
    	genericDao.getEntityManager().close();
    	
    	*/

    	
    		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnit");
    		EntityManager em = emf.createEntityManager();
    		em.getTransaction().begin();

    		Book book = new Book();
    		List<Author> authorList = new ArrayList<Author>();
    		Author author = new Author();
    		author.setName("Taras");
    		author.setSurname("Shevchenko");
    		authorList.add(author);
    		book.setAuthors(authorList); 
    		book.setAmountOfPage(20);
    		Publication publication = new Publication();
    		publication. setName("Syayvo");
    		book.setPublication(publication);
    		book.setName("Mood");
    		book.setYear(1987);
    		
    		em.persist(publication);
    		em.persist(book);

    		em.getTransaction().commit();
    		em.close();
    		emf.close();
    		

    	
    	}
    }

