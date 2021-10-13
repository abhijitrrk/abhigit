package hashMapExample;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer,String> ht= new Hashtable<Integer,String>();
		ht.put(1, "Abhi");
		ht.put(2, "Tanuja");
		ht.put(3, "Shubham");
		ht.put(4, "India");
		ht.put(5, "Canada");
		ht.remove(5);
		System.out.println(ht);
		ht.put(5, "Mumbai");
		System.out.println(ht);
		Set sn1 = ht.entrySet();
		Iterator it1= sn1.iterator();
		
		while(it1.hasNext()) 
		{
			 Map.Entry mp1= (Map.Entry) it1.next();
			 System.out.println(mp1.getKey());
			 System.out.println(mp1.getValue());
		}
		

	}

}
