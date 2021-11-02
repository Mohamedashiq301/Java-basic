package CollectionFrameWork;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll1=new LinkedList<Integer>();
		
		LinkedList<Integer> ll2=new LinkedList<Integer>(List.of(50,60,70,80,90));
		
		ll1.add(10);
		ll1.add(0, 5);
		ll1.addAll(1, ll2);
		
		System.out.println(ll1.contains(60));
		
		System.out.println(ll1);
		
		System.out.println(ll1.getFirst());
		System.out.println(ll1.getLast());
		
	
		
	}
}
