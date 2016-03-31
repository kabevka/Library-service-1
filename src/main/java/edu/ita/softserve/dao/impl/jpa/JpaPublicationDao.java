package edu.ita.softserve.dao.impl.jpa;

import java.util.List;

import javax.persistence.EntityManager;

import edu.ita.softserve.dao.impl.PublicationDao;
import edu.ita.softserve.entity.Book;
import edu.ita.softserve.entity.Publication;
import edu.ita.softserve.util.JPAUtil;

public class JpaPublicationDao extends JpaGenericDao<Publication, Long> implements PublicationDao{

	public List<Book> findAllBooksByPublication(Publication publication) {
		EntityManager entityManager = JPAUtil.getEntityManager();
		List<Book> bookList = entityManager.createQuery("SELECT b FROM Book b where b.publication = ?1", Book.class)
                .setParameter(1, publication).getResultList();
	return bookList;
	}

}
