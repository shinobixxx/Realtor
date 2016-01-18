package Real_Estate_Pack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HomesDB {
	public static void main(String [] args)
	{
		Owner owner = new Owner("Chris", "Alexandris", "+30 2310 690690");
		Property property1 = new Property( 2, 1, 80, "flat", "Vasileos Georgiou 16", owner);
		Property property2 = new Property( 4, 3, 180, "House", "Vasileos Georgiou 16", owner);
		Property property3 = new Property( 0, 0, 18000, "Parcel", "Halkidiki", owner);

		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        

        session.save(owner);
        session.save(property1);
        session.save(property2);
        session.save(property3);
        tx.commit(); 
        
        
        session.close();
        factory.close();
        System.out.println(" Objects saved successfully!");
	}
}
