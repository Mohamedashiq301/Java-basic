package CollectionFrameWork;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> lhm=new LinkedHashMap<Integer, String>(5,0.75f,true){
			protected boolean  removeEldestEntry(Map.Entry e) {
				return size()>5;
			}
		};
		
		lhm.put(0, "A");
		lhm.put(1, "B");
		lhm.put(2, "C");
		lhm.put(3, "D");
		lhm.put(4, "E");
		
		String s=lhm.get(2);
		s=lhm.get(5);
		s=lhm.get(1);
		
		lhm.put(6, "G");
		System.out.println(lhm);
		
		
		lhm.forEach((k,v)->System.out.println(k+" "+v));
	}
}
