package EmbedingAno;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		
		Faculty fac = new Faculty("Computer Science","SYCS");
		
		FacultyStudent fs = new FacultyStudent("Mihir",fac);
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(fs);
		
		tx.commit();
		
		session.close();
	}

}
