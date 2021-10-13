package AbhiProject;

import java.util.HashSet;
import java.util.Iterator;

public class hashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hashset, tree set and linked hash set implements Set Interface
		//Set interface does not accept duplicate value
		//no guarantee elements stored in sequential order
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Abhi");
		hs.add("Tanuja");
		hs.add("Canada");
		hs.add("Canada");
		hs.add("India");
		System.out.println(hs);
		
		Iterator<String> i = hs.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
	}

}
