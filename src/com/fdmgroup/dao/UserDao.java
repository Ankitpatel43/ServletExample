package com.fdmgroup.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.fdmgroup.model.User;

public class UserDao {

	private static UserDao userDao=null;
	private DataAccessObject dao=null;

	
	
	private UserDao(){	
	dao= DataAccessObject.getInstance();
	}
	
	public static UserDao getInstance(){
		
		if(userDao==null)
			userDao=new UserDao();
	
		return userDao;
	
	}
	
	public User findByUserName(String username){
	EntityManager em = dao.getEntityManager();
	TypedQuery<User> query = em.createNamedQuery("user.findByUserName", User.class);
	
	query.setParameter("uname", username);
	List<User> users = query.getResultList();
	if (users.size()==1)
		{
		return users.get(0);
		}
	else 
		return null;
	}
	
	public User findById(int id){
		EntityManager em = dao.getEntityManager();
		return em.find(User.class, id);
		
	}
	
	public List<User> findAll(){
		EntityManager em = dao.getEntityManager();
		TypedQuery<User> query = em.createNamedQuery("user.findAll", User.class);
		
		return query.getResultList();
		
	}
	
	
	
	
}
