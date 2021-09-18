package Array;
//Reverse copying an array
public class ReversinganArray {

	public static void main(String[] args) {
		int A[]= {8,6,9,10,9,2,15,7,13,14,11};
		
		int B[]=new int[10];
		
		for (int i=0;i<A.length;i++)
			System.out.print(A[i]+",");
		System.out.println(" ");
		/*
		for (int i=A.length-1,j=0;i>=0;i--,j--)
		{
			B[j]=A[i];
			
		}
		
		*/
		for (int i=A.length-1;i>=0;i--)
		{
			System.out.print(A[i]+",");
		}
	}
}
