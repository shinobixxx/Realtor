package Real_Estate_Pack;

/* 
 *  O controller analamvanei thn dhmiourgia, diagrafh klp antikeimenon toy montelou (Owner & Property)
 *  kai apothikefsi sthn vasi
 */

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Controller {
	private Owner tempO;
	private Property tempP;
	
	public Controller(){	
	}
		
	public Owner createOwner(String _name, String _lastname, String _phone){
		tempO =  new Owner(_name, _lastname, _phone);
		return (tempO);
	}
	
	public Property createProperty(String _type, String _address, int _size, int _bedrooms, int _bathrooms, Owner _owner)
	{
		tempP = new Property(_bedrooms, _bathrooms, _size, _type, _address, _owner);
		return (tempP);
	}
	
	public void saveProperty(Owner owner, Property property) {
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        session.save(owner);
        session.save(property);
        
        tx.commit(); 
        session.close();
        factory.close();
        System.out.println("Done");
	}

}
