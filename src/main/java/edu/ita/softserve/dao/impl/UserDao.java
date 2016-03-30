package edu.ita.softserve.dao.impl;

import java.util.List;

import edu.ita.softserve.dao.GenericDao;
import edu.ita.softserve.entity.Book;
import edu.ita.softserve.entity.User;

public interface UserDao extends GenericDao<User, Long> {
	
	List<User> getAllDeptors();
	List<Book> showBooksByUser(User user);
	String statisticByAllUsers();
	int getAvarageAgeUserByBookName(String bookName);

}
