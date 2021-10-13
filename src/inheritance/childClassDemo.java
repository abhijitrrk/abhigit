package inheritance;

public class childClassDemo extends parentclass {

	
	  public void audiosystems() { System.out.println("New Audio Systems!");
	  
	  }
	 
	public void engine() {
		System.out.println("New Engine");
	}

	public void color() {
		System.out.println(color);
	}

	/*
	 * public void getdata(int a) { System.out.println(a); }
	 * 
	 * 
	 * public void getdata(String a) { System.out.println(a); }
	 * 
	 * public void getdata(int a, int b) { System.out.println(b+" "+a); }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		childClassDemo car = new childClassDemo();
		car.color();
		car.audiosystems();
		car.brakes();
		car.gear();

		/*
		 * car.getdata(2); car.getdata("Honda Civic"); car.getdata(5,1);
		 */

	}

}
