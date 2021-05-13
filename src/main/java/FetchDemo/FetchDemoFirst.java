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
		Address ad1 = session.load(Address.class, 2);		

		System.out.println(ad);
		System.out.println(ad1);
		
		
		session.close();
		sf.close();

	}

}
