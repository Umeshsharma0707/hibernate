package com.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OneToMany {
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session openSession = factory.openSession();
        openSession.beginTransaction();
      
		/*
		 * Person p = new Person(); p.setId(12); p.setName("umesh");
		 * 
		 * // address
		 * 
		 * PersonAddress a1 = new PersonAddress(); a1.setId(15); a1.setHouseNo("406");
		 * a1.setCity("delhi"); a1.setPerson(p);
		 * 
		 * PersonAddress a2 = new PersonAddress(); a2.setId(13); a2.setHouseNo("12");
		 * a2.setCity("ahmedabad"); a2.setPerson(p);
		 * 
		 * List<PersonAddress> list = new ArrayList<PersonAddress>(); list.add(a1);
		 * list.add(a2);
		 * 
		 * p.setPersonAddresses(list);
		 * 
		 * openSession.save(p); openSession.save(a1); openSession.save(a2);
		 */       
        
     // get person and his all addresses
        
        Person p = openSession.get(Person.class, 12);
        
        System.out.println("name  : " + p.getName());
        
        for(PersonAddress a : p.getPersonAddresses()) {
        	System.out.println("address : " + a.getCity());
        }
        
        openSession.getTransaction().commit();
        openSession.close();;
		factory.close();
	}
}
