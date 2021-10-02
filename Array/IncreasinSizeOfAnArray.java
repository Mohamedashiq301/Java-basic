package Array;
//Increasin size of an array
public class IncreasinSizeOfAnArray {

	public static void main(String[] args) {
		int A[]= {8,6,10,9,2};
		
			System.out.println("Length of A: "+A.length);
		
		
		int B[]=new int[2*A.length];
		
		
		for (int i=0;i<A.length;i++)
		{
			B[i]=A[i];
		}
		A=B;
		
		
			System.out.println("Length of A: "+A.length);
	}
}
