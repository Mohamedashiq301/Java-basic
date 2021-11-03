package CollectionFrameWork;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs =new LinkedHashSet<String>(10);
		
		lhs.add("A");
		lhs.add("C");
		lhs.add("E");
		lhs.add("K");
		lhs.add("B");
		lhs.add("G");
		lhs.add("B");
		
		lhs.forEach(System.out::println);
		/*Iterator<String> itr=lhs.iterator();
		{
			while(itr.hasNext())
			{
				System.out.println(itr.hasNext());
			}
		}*/
	}
}
