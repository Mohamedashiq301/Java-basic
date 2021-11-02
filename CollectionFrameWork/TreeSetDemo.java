package CollectionFrameWork;

import java.util.List;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts=new TreeSet<Integer>(List.of(10,20,30,40,50,10));
		
		ts.add(25);
		
		System.out.println(ts);
	}
}
