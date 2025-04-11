package com.Ajay;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {  
    	
    	Student stu = new Student(101,"Ajay",28,"Male","Mumbai","9326994905");
    	
    	Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory = cfg.buildSessionFactory(); 
    	Session session = factory.openSession();
    	
    	Transaction tx = session.beginTransaction();
    	
    	session.save(stu);
    	tx.commit();
    	session.close();
    	System.out.println( "Record Save Succesfully" );
    	
    	
        
    }
}
