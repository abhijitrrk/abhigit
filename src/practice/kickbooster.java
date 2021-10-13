package practice;

public class kickbooster implements contactDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("This is a Kickbooster class");
		System.out.println("We will now implement an interface for the Kick booster class");
		
		contactDetails b= new kickbooster();
		b.address();
		b.employees();
		b.projects();
	}

	@Override
	public void address() {
		// TODO Auto-generated method stub
		System.out.println("Kickbooster is also locate at fultz blvd ");
		
	}

	@Override
	public void employees() {
		// TODO Auto-generated method stub
		System.out.println("Kickbooster EMployees are also Awesome");
	}

	@Override
	public void projects() {
		// TODO Auto-generated method stub
		System.out.println("Kickbooster has a lot of crowdfunding projects");
	}

}
