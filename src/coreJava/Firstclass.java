package coreJava;

public class Firstclass {
	int a=5;
	String b="Abhijit";
	public void getdata() {
		
		System.out.println("I am in a method");
		//return "Hello";
	}
	
	public static void main(String[] args) {
		
		Firstclass fn=new Firstclass();
		System.out.println("Hello World!");
		System.out.println("Hello Calgary!");
		//System.out.println(a);
		fn.getdata(); 
		System.out.println(fn.a);
		System.out.println(fn.b);
		
		secondclass sn=new secondclass();
		sn.setData();
	}

}
