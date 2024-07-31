package com.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ManyToManyMap {
	public static void main(String[] args) {
		 SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	        
		Session session = factory.openSession();
		session.beginTransaction();
		
		// developers
		Developer d1 = new Developer();
		d1.setDeveloperId(12);
		d1.setDeveloperName("umesh");
		
		Developer d2 = new Developer();
		d2.setDeveloperId(15);
		d2.setDeveloperName("rohit");
		
		// projects
		
		Project p1 = new Project();
		p1.setProjectId(20);
		p1.setProjectName("chat app");
		
		Project p2 = new Project();
		p2.setProjectId(22);
		p2.setProjectName("School management system");
		
		
		// many to many mapping
		// list of developers
		
		List<Developer> developers = new ArrayList<Developer>();
		List<Project> projects = new ArrayList<Project>();
		// adding developers
		developers.add(d1);
		developers.add(d2);
		
		// adding projects 
		projects.add(p1);
		projects.add(p2);
		
		//setting values
		
		d1.setProjects(projects);
		p1.setDevelopers(developers);
		d2.setProjects(projects);
		p2.setDevelopers(developers);
		
		session.save(p1);
		session.save(p2);
		session.save(d1);
		session.save(d2);
		
		session.getTransaction().commit();
		session.clear();
		factory.close();
	}
}
