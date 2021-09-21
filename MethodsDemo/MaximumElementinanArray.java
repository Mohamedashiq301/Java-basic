package MethodsDemo;

public class MaximumElementinanArray {
	static String name ="Ashiq";
	static int find (int [] a)
	{
		int max=0;
		System.out.println(name);
		for (int i=0;i<a.length;i++)
		{
			max=a[i];
		if (a[i]>max)
				max=a[i];
		}
		return max;
	}
	public static void main(String[] args) {
		int A[]= {2,4,5,6,7,9,10,12,15};
			
		//for (int i=0;i<A.length;i++)
			
		System.out.println(find(A));
		System.out.println(name);
	}
}
