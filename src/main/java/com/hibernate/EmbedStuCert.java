package com.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;


public class EmbedStuCert {
		public static void main(String[] args) {
			
			SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	        Session openSession = factory.openSession();
	        //Transaction tx = openSession.beginTransaction();
	        
	        Student student = openSession.get(Student.class, 1);
	        
	        System.out.println(student.toString());
	        
	        //openSession.getTransaction();
	        //tx.commit();
	        openSession.close();;
			factory.close();
		}
}

