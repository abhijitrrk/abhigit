package hashMapExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HasMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<Integer,String>();
		hm.put(1, "Abhi");
		hm.put(2, "Tanuja");
		hm.put(3, "Shubham");
		hm.put(4, "Rachana");
		hm.put(5, "Canada");
		System.out.println(hm.get(2));
		System.out.println(hm.values());
		System.out.println(hm.remove(5));
		System.out.println(hm.get(5));
		Set sn= hm.entrySet();
		//System.out.println(sn);
		Iterator it= sn.iterator();
		
		while(it.hasNext())
		{
			Map.Entry mp=(Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
			
		}
	}

}
