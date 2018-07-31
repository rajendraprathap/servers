package com.repositroy;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.util.HibernateUtil;
import com.model.Account;

public class AccountDaoImpl implements AccountDao {

	@Override
	public Account login(String username, String password) {
		try{
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		
		Query query=session.createQuery("from Account acc where acc.username=? and acc.password=?");
		query.setParameter(0,username);
		query.setParameter(1,password);
		return (Account)query.uniqueResult();
		
		
		}catch(Exception e){
			
	        return null;
		}
	}

	
	
	public boolean SaveAccount(Account acc) 
	{
		SessionFactory factory=HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		
		Transaction tx=session.beginTransaction();
		try{
		session.save(acc);
		tx.commit();
		
	    System.out.println(" one row inserted---------");
		
	    session.close();
	    return true;
		}catch(Exception ex)
		{
			tx.rollback();
			session.close();
			return false;
		}
	}
}
