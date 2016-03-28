package edu.ita.softserve.dao.impl.jpa;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import edu.ita.softserve.dao.GenericDao;

public abstract class JpaGenericDao<T,V> implements GenericDao<T, V> {
	
	private Class<T> entityType;
	protected EntityManager entityManager;
	
	public JpaGenericDao() {
		ParameterizedType genericSuperClass = (ParameterizedType) getClass()
                .getGenericSuperclass();
        this.entityType = (Class<T>) genericSuperClass.getActualTypeArguments()[0]; 
        
	}
	
	public void add(T t) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(t);
		entityTransaction.commit();		
	}
	
	public void delete(T t) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(t);
		entityTransaction.commit();
		
	}
	
	public T findById(V id) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		T t = entityManager.find(entityType, id);
		entityTransaction.commit();
		return t;
	}
	
	public List<T> getAll() {
		Query query = entityManager.createQuery(
                "SELECT entity FROM " + entityType.getName() + " entity");
        return query.getResultList();
	}
	
	public void update(T t) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(t);
		entityTransaction.commit();
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
}
