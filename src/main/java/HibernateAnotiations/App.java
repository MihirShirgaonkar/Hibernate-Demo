package HibernateAnotiations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		FileInputStream fis;
		byte[] data = null;
		try {
//			fis = new FileInputStream("src/main/java/HibernateAnotiations/pic.jpg");
//			
//			data = new byte[fis.available()];
//			fis.read();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		Address add = new Address("sector 17","Nerul",false,12.123,new Date(),data);
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(add);
		
		tx.commit();
		
		session.close();
		
		
		
		

	}

}
