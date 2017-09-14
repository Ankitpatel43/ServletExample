package com.fdmgroup.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DataAccessObject {

	
	private static DataAccessObject dao=null;
	private EntityManagerFactory emf=null;
	private EntityManager em=null;
	
	private DataAccessObject(){
		
		init();
	}
	
	private void init(){
		emf = Persistence.createEntityManagerFactory("ServletSample1");
		em=emf.createEntityManager();
	}
	
	public static DataAccessObject getInstance(){
		if(dao==null)
			dao=new DataAccessObject();
		
		return dao;
		
	}
	
	public EntityManager getEntityManager(){
		return em;
		
		
	}
	
}
