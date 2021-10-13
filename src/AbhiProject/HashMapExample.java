package AbhiProject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(0, "Abhi");
		hm.put(1, "Tanuja");
		hm.put(2, "Canada");
		System.out.println(hm);
		System.out.println(hm.get(2));
		Set s =hm.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext())
		{
		 
			 Map.Entry mp=(Map.Entry)i.next();
			 System.out.println(mp.getKey());
			 System.out.println(mp.getValue());
		
	}

	}
}
