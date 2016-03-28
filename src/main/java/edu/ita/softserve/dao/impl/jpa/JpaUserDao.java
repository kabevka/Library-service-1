package edu.ita.softserve.dao.impl.jpa;

import java.util.List;

import javax.persistence.EntityManager;

import edu.ita.softserve.dao.impl.UserDao;
import edu.ita.softserve.entity.User;

public class JpaUserDao extends JpaGenericDao<User, Long> implements UserDao {

	

	public List<User> getAllDeptors() {
		
		return null;
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
