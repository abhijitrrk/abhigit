package constructor;

public class constructorDemo {

	public constructorDemo()
	{
		System.out.println("Constructor is execucted");
		System.out.println("I am in a constructr lecture 1");
		int a =1;
		int b =2;
		int c=a+b;
		System.out.println(c);
	}
	
	public constructorDemo(int a, int b)
	{
		System.out.println("I am in a paramaterized constructor");
	}
	
	public void getdate()
	{
		System.out.println("I am the method!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	constructorDemo	a = new constructorDemo();
	constructorDemo b = new constructorDemo(2,3);
	a.getdate();
	b.getdate();
	
	}

}
