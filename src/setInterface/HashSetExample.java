package setInterface;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> a= new HashSet<String>();
		a.add("India");
		a.add("Canada");
		a.add("USA");
		a.add("Australia");
		a.add("Mexico");
		a.add("England");
		a.add("France");
		
		Iterator<String> i = a.iterator();
		System.out.println(i.next());
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		/*System.out.println(a.size());
		a.add("India");
		System.out.println(a);
		System.out.println(a.size());
		a.remove("Canada");
		System.out.println(a.size());
		*/
	}

}
