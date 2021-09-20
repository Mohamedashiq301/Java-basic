package MethodsDemo;

public class MaximumElementinanArray {
	
	static int find (int a)
	{
		for (int i=0;i<a;i++)
		{
		int max=a;
		if (a>max)
				max=a;
		}
		return a;
	}
	public static void main(String[] args) {
		int A[]=new int [10];
			A[0]=3;
			A[1]=6;
			A[2]=9;
			A[3]=12;
			A[4]=13;
			A[5]=15;
			A[6]=4;
			A[7]=1;
			A[8]=8;
			A[9]=10;
		for (int i=0;i<A.length;i++)
			System.out.print(A.length);
		//System.out.println(find(a));
	}
}
