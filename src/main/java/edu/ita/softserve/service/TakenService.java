package edu.ita.softserve.service;

import java.util.List;

import edu.ita.softserve.dao.factory.DaoFactory;
import edu.ita.softserve.entity.Taken;

public class TakenService {
	
	public void update(final Taken curentTaken, final Taken updatedTaken){
		DaoFactory.getInstance().getTakenDao().update(updatedTaken);
	}
	public void add(final Taken taken){
		DaoFactory.getInstance().getTakenDao().add(taken);
	}
	
	public void delete(final Taken taken){
		DaoFactory.getInstance().getTakenDao().delete(taken);
	}
	
	public List<Taken> getAll(){
		return DaoFactory.getInstance().getTakenDao().getAll();
	}
	
	public Taken findById(long id){
		return DaoFactory.getInstance().getTakenDao().findById(id);
	}
}
