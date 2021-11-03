package CollectionFrameWork;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>(Map.of(0,"A",1,"B",2,"c",3,"D"));
		
		tm.put(4, "E");
		tm.put(5, "F");
		
		 Entry<Integer,String> e=tm.firstEntry();
	        
	        System.out.println(e.getKey()+" "+e.getValue());
	        
		System.out.println(tm.ceilingEntry(4).getValue());
		
		System.out.println(tm);
	}
}
