package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Regvo;

@Repository
public class Regdao {
	@Autowired
	SessionFactory sessionFactory;
	
	public void insert(Regvo v)
	{
		try{
			Session session=sessionFactory.openSession();
			
			Transaction transaction=session.beginTransaction();
			
			session.save(v);
			
			transaction.commit();
			
			session.close();
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
	}
	
	

	
}
