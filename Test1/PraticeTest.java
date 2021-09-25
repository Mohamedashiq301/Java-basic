package Test1;

class Array {

	public int arr (int A[])
	{
		int sum=0;
		for (int i=0;i<A.length;i++)
			sum=sum+A[i];
		return sum;
	}
}

public class PraticeTest {

	public static void main(String[] args) {
		int A[]= {1,2,3};
		
		Array a=new Array();
		System.out.println("sum:"+a.arr(A));
	}
}
