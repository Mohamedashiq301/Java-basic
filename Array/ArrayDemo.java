package Array;

public class ArrayDemo {

	//Just a sample for array
	public static void main(String[] args) {
		int A[]=new int [10];
		
		int B[]= {1,2,3,4,5};
		
		for (int i=0;i<A.length;i++)
		{
			System.out.println(A[i]);
			
			
		}
		B[2]=15;
		for (int j=0;j<B.length;j++)
		{
			System.out.print(B[j]+",");
		}
	}
}
