package com.test.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        
        Student st = new Student();
        st.setId(102);
        st.setName("Mihirr");
        st.setCity("Mahad");
        
        Session session = factory.openSession();
        
        Transaction tx = session.beginTransaction();
        
        session.save(st);
        
        tx.commit();
        
        session.close();
        
        System.out.println(st);
    }

	
}
