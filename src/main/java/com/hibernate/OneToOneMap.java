package com.hibernate;



import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

public class OneToOneMap {
		public static void main(String[] args) {
			
			SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	        Session openSession = factory.openSession();
	        openSession.beginTransaction();
	        
			
			  Question q2 = new Question(); q2.setQuestionId(8);
			  q2.setQuestion("what is java");
			  
			  Answer a2 = new Answer(50,"java is a programming language");
			  
			  q2.setAnswer(a2); openSession.save(q2); openSession.save(a2);
			  openSession.getTransaction().commit();
			 
	        
	        
	        
	        openSession.close();;
			factory.close();
		}
}
