package com.pc.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pc.model.Registration;
import com.pc.util.HibernateUtil;

public class RegisterDao {
	
	public void saveuserinfo(Registration register){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.save(register);
		
		transaction.commit();
		session.close();
		
	}
	public List<Registration> getAllUsers(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("From Registration");
		List<Registration> registerlist = query.list();
		return registerlist;
		
	}
	
	public int  deleteuser(long id){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("delete From Registration where id=:id");
		query.setParameter("id", id);
		//session.delete(id);
		int deleted = query.executeUpdate();
		transaction.commit();
		session.close();
		return deleted;
	
		
	}
	public Registration getuserbyid(long id){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Query query = session.createQuery("From Registration where id=:id");
		query.setParameter("id", id);
		Registration registerdata = (Registration)query.uniqueResult();
			
		
		return registerdata;
		
	}
	public void updateuser(Registration register){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(register);
		transaction.commit();
		session.close();
		
		
		
		
	}

}
