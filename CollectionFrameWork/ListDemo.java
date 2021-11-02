package CollectionFrameWork;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> al1=new ArrayList<Integer>(20);
		
		ArrayList<Integer> al2 =new ArrayList<Integer>(List.of(50, 60, 70, 80, 90));
		
		al1.add(10);
		al1.add(0, 5);
		
		al1.addAll(1,al2);
		al1.add(5, 70);
		
		System.out.println(al1.contains(50));
		
		System.out.println(al1.indexOf(70));
		
		System.out.println(al1.size());
		
		System.out.println(al1);
		
		for(int i=0;i<al1.size();i++)
		{
			System.out.println(al1.get(i));
		}
	}
}
