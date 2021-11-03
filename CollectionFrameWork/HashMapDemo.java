package CollectionFrameWork;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm=new HashMap<Integer, String>(Map.of(0,"A",1,"B",2,"c",3,"D"));
		
		hm.put(4, "E");
		hm.put(5, "F");
		
		System.out.println(hm.get(1));
		
		System.out.println(hm);
	}
}
