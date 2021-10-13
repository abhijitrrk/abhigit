package AbhiProject;

import java.util.ArrayList;

public class ArrayListExample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<String>();
		a.add("Abhi");
		a.add("Tanuja");
		a.add("Canada");
		a.add("Canada");
		System.out.println(a);
		a.remove("Canada");
		System.out.println(a);
		System.out.println(a.contains("Abhi"));
		System.out.println(a.clone());
		try {
		System.out.println(a.get(2));
		}

		catch(ArrayIndexOutOfBoundsException et)
		{
			System.out.println("This is an Index out of bound exceptions");
		}
		catch(Exception e){
		System.out.println("This is an exception");	
		}
		finally {
			System.out.println("Close the program");
		}
	}
}
