package edu.ita.softserve.dao.impl.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import edu.ita.softserve.dao.impl.UserDao;
import edu.ita.softserve.entity.Book;
import edu.ita.softserve.entity.User;

public class JpaUserDao extends JpaGenericDao<User, Long> implements UserDao {

	public List<User> getAllDeptors() {
		List<User> users = null;
		Query query = entityManager.createNativeQuery("select * from user inner join taken on taken.date_of_given_back<curdate()",User.class);
		users =(List<User>)query.getResultList();
		return users;
	}

	public String statisticByAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getAvarageAgeUserByBookName(String bookName) {
		int avagareAge = 11;
		Query query = entityManager.createNativeQuery("select avg(age) from user_taken where takens_id = (select id from taken where instance_id = (select id from instances_of_book where book_id = (select id from books where name = ?))))",Integer.class);
		query.setParameter(1, bookName);
		avagareAge = query.getFirstResult();
		return avagareAge;
	}

	public List<Book> showBooksByUser(User user) {
		List<Book> books = null;
		Query query = entityManager.createNativeQuery("select books.name from books left join  instances_of_book  on instances_of_book.book_id = books.id where instances_of_book.id = (select id from taken where user_id = (select id from user where user.id = ?))", Book.class);
		query.setParameter(1, user.getId());
		books = query.getResultList();
		return books;
	}
}
