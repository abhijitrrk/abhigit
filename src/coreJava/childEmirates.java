package coreJava;

public class childEmirates extends ParentAirCraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childEmirates a = new childEmirates();
		a.bodyColor();
		a.safetyGuidelines();
		a.engine();

	}

	@Override
	public void bodyColor() {
		// TODO Auto-generated method stub
		System.out.println("Blue color of the body");
	}
	
	

}
