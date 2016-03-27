package edu.ita.softserve.dao.impl.jpa;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import edu.ita.softserve.dao.GenericDao;

public abstract class JpaGenericDao<T,V> implements GenericDao<T, V> {
	
	private Class<T> entityType;
	private EntityManager entityManager;
	
	public JpaGenericDao() {
		ParameterizedType genericSuperClass = (ParameterizedType) getClass()
                .getGenericSuperclass();
        this.entityType = (Class<T>) genericSuperClass.getActualTypeArguments()[0]; 
	}
	
	public void add(T t) {
		// TODO Auto-generated method stub
		
	}
	
	public void delete(T t) {
		// TODO Auto-generated method stub
		
	}
	
	public T findById(V id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<T> getAll() {
		Query query = entityManager.createQuery(
                "SELECT entity FROM " + entityType.getName() + " entity");
        return query.getResultList();
	}
	
	public void update(T t) {
		// TODO Auto-generated method stub
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
}
