package edu.ita.softserve.dao.impl.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import edu.ita.softserve.dao.impl.UserDao;
import edu.ita.softserve.entity.User;

public class JpaUserDao extends JpaGenericDao<User, Long> implements UserDao {

	

	public List<User> getAllDeptors() {
		List<User> users = new ArrayList<User>();
		Query query = entityManager.createQuery("select u from user u  left join taken t on user.id = taken.user where date_of_given_back<CURDATE()");
		users = query.getResultList();
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
