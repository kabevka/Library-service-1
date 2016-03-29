package edu.ita.softserve.dao.impl.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import edu.ita.softserve.dao.impl.UserDao;
import edu.ita.softserve.entity.User;

public class JpaUserDao extends JpaGenericDao<User, Long> implements UserDao {

	public List<User> getAllDeptors() {
		List<User> users = null;
		Query query = entityManager.createNativeQuery("select * from user inner join taken on taken.date_of_given_back<curdate()",User.class);
		users =(List<User>)query.getResultList();
		return users;
	}

	public String statisticByUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public String statisticByAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getAvarageAgeByUser(User user) {
		// TODO Auto-generated method stub
		return 0;
	}
}
