package com.pc.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	SessionFactory sessionFactory =null;
	
	public static SessionFactory getSessionFactory(){
		Configuration cfg = new Configuration().configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		return sessionFactory;
		
		
	}
	

}
