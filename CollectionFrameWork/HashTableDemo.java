package CollectionFrameWork;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
		
		ht.put(1, "A");
		ht.put(2, "B");
		ht.put(3, "C");
		ht.put(4, "D");
		ht.put(5, "E");
		
		Enumeration <String> e=ht.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		ht.computeIfAbsent(7,(k)->"Z"+k);
		System.out.println(ht);
	}
}
