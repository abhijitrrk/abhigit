package arrayList;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a = new ArrayList<String>();
		a.add("Shubham");
		a.add("Abhi");
		a.add("Tanu");
		a.add("Arti");
		a.add("Rohan");
		System.out.println(a);
		System.out.println(a.indexOf("Shubham"));
		a.remove(1);
		System.out.println(a);
		System.out.println(a.contains("Tanu"));
		System.out.println(a.contains("Abhi"));
		System.out.println(a.get(2));
		a.add(1, "Abhi");
		System.out.println(a);
		//ArrayList<String> b = new ArrayList<String>();
		//b=(ArrayList<String>)a.clone();
		System.out.println(a.indexOf("Shubham"));
		System.out.println(a.hashCode());
		System.out.println(a.isEmpty());
		System.out.println(a.size());
	}

}
