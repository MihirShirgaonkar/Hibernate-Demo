package FetchDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import HibernateAnotiations.Address;

public class FetchDemoFirst {

	public static void main(String[] args) {
		
		
		//Fetch data from database
		
		//get
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		Session session = sf.openSession();
		
		Address ad = session.get(Address.class, 1);		
		
		System.out.println(ad);
		
		
		session.close();
		sf.close();

	}

}
