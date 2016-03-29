package edu.ita.softserve.service;

import java.sql.Date;
import java.util.List;

import edu.ita.softserve.dao.impl.jpa.JpaUserDao;
import edu.ita.softserve.entity.User;

public class UserService {

	public void update(final User curentUser, final User updatedUser) {
		if (!curentUser.getFirstName().equals("") & curentUser.getFirstName() != null) {
			updatedUser.setFirstName(curentUser.getFirstName());
		}
		if (!curentUser.getSecondName().equals("") & curentUser != null) {
			updatedUser.setSecondName(curentUser.getSecondName());
		}
		if (curentUser.getTelephoneNumber() != 0) {
			updatedUser.setTelephoneNumber(curentUser.getTelephoneNumber());
		}
		if ((curentUser.getDateOfRegistration() != null)) {
			updatedUser.setDateOfRegistration(curentUser.getDateOfRegistration());
		}
		if ((curentUser.getAdress() != null)) {
			updatedUser.setAdress(curentUser.getAdress());
		}
		new JpaUserDao().update(updatedUser);
	}

	public void delete(User user) {
		new JpaUserDao().delete(user);
	}

	public void add(User user) {
		new JpaUserDao().add(user);
	}

	public User findById(long id) {
		if (id < 0) {
			System.out.println("Id less than )");
			return null;
		}
		return new JpaUserDao().findById(id);
	}
	
	public List<User> getAll(){
		return new JpaUserDao().getAll();
	}
}
