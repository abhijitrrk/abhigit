package coreJava;

public class stringclassdemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.String Literal
		//2.Object of string
		
		String a ="Java/Training";
		System.out.println(a.charAt(0));
		System.out.println(a.indexOf("a"));
		System.out.println(a.substring(3,6));
		System.out.println(a.substring(5));
		System.out.println(a.concat(" abhijit"));
		System.out.println(a.trim());
		System.out.println(a.length());
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		String arr[]=a.split("/");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(a.replace("/", "**"));
			
		//String ab = new String("Hello");

	}

}
