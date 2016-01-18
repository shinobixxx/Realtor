package Real_Estate_Pack;

public class Property {

	private int id;
	private int bedrooms;
	private int wc;
	private int size;
	private String type;
	private String address;
	private Owner owner;
	
	public Property(){}
	
	public Property(int thebedrooms, int thewc, int thesize, String thetype, String theaddress, Owner theowner)
	{
		bedrooms = thebedrooms;
		wc = thewc;
		size = thesize;
		type = thetype;
		address = theaddress;
		owner = theowner;
	}
}
