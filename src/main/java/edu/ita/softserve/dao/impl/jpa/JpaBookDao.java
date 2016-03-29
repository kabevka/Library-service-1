package edu.ita.softserve.dao.impl.jpa;

import java.util.List;

import javax.persistence.EntityManager;

import edu.ita.softserve.dao.impl.BookDao;
import edu.ita.softserve.entity.Book;
import edu.ita.softserve.util.JPAUtil;

public class JpaBookDao extends JpaGenericDao<Book, Long> implements BookDao{

    public Book findbyName(String name) {
	EntityManager entityManager = JPAUtil.getEntityManager();
	Book book = (Book) entityManager.createQuery("SELECT b FROM Book b where b.name = ?1").setParameter(1, name).getSingleResult();
	return book;
    }
}
