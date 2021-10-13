package superKeyword;

public class childDemo extends parentDemo {
	
	//String name="QAClickAcademy";
	public void getStringdata()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
	public void getData()
	{
		super.getData();
		System.out.println("I am child Class");
	}
	
	public childDemo()
	{
		super();
		System.out.println("I am Child Class constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		childDemo cd = new childDemo();
		cd.getStringdata();
		cd.getData();
		*/
		childDemo cd1=new childDemo();
		
	}

}
