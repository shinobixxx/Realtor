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
	
	public Controller(){
		
	}
		
	public Owner createOwner(String _name, String _lastname, String _phone){
		return (new Owner(_name, _lastname, _phone));
	}
	
	public Property createProperty(String _type, String _address, int _size, int _bedrooms, int _bathrooms, Owner _owner)
	{
		return (new Property(_bedrooms, _bathrooms, _size, _type, _address, _owner));
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
