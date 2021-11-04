package CollectionFrameWork;

import java.util.Arrays;

public class ComparatorDemo {

	public static void main(String[] args) {
		
		int a[]= {2,4,6,8,1,3,5,7};
		int b[]= {2,4,6,8,1,3,5};
		
		
		int c[]=Arrays.copyOf(a, a.length);
		
		for(int x:c)
		System.out.println(x);
		
		System.out.println("%%%%%%%%%%%%%%");
		System.out.println(Arrays.compare(a, b));
	}
}
