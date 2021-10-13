package practice;

public class boldCommerce implements contactDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("This is the BoldCommerce Main Class");
		System.out.println("We will now use an interface & also an abstract class");
		contactDetails a=new boldCommerce();
		a.address();
		a.employees();
		a.projects();
	}

	@Override
	public void address() {
		// TODO Auto-generated method stub
		System.out.println("Address fro Bold Commerce is 50 Fultz, Winnipeg");
		
	}

	@Override
	public void employees() {
		// TODO Auto-generated method stub
		System.out.println("Bold Commerce employees are Awesome!!");
	}

	@Override
	public void projects() {
		// TODO Auto-generated method stub
		System.out.println("Project are to develop the best Checkout Experience.");
	}

}
