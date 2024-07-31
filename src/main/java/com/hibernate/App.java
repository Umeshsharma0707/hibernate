package com.hibernate;




import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )// throws IOException
    {
        System.out.println( "project started" );
        
        
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session openSession = factory.openSession();
        
        
        
        //openSession.beginTransaction();
        Employee emp = openSession.get(Employee.class, 1);
        System.out.println("emp name : " + emp.getName());
        System.out.println(emp);
        //openSession.getTransaction().commit();
        
        //System.out.println("address saved");
        
        
        
       /* SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        
        // creating employee
        
        Employee emp = new Employee("rohit","dotnet developer",50000.500);
        System.out.println(emp.toString());
        
        Session session = factory.openSession();
        
        session.beginTransaction();
        int save = (Integer)session.save(emp);
        session.getTransaction().commit();
        System.out.println("employee inserted at id : " + save);
        */
    }
}
