package variables;

public class staticVar {
	
	String name; //instance variables
	String address;
	String city;
	static String country="Canada";
	int i=0;
	
	staticVar(String name, String address, String city)
	{ // local variables
		//System.out.println("this is a constructor");
		this.name = name;
		this.address=address;
		this.city=city;
		i++;
		System.out.println(i);
		//System.out.println(name+" "+address+" "+city);
		
	}
	public void getAddress()
	{
		System.out.println(address +" "+country + " "+i);
	}
	public static void getCountry()
	{
		System.out.println(country);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticVar ob1 = new staticVar("Abhi","Cougarstone","Calgary");
		staticVar ob2 = new staticVar("Joyil","Pembina","Winnipeg");
		staticVar ob3 = new staticVar("Hrish","someroad","Bunaby");
		ob1.getAddress();
		ob2.getAddress();
		ob3.getAddress();
		staticVar.getCountry();
		staticVar.getCountry();
		
	}

}
