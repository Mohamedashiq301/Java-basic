package practice1;

public class SumOfAnArray {

	public static void main(String[] args) {
		int A[]= {10,20,30,40,50,60,70,80,90,100};
		
		int sum=0;
		for(int i=0;i<A.length;i++)
		{
			sum=sum+A[i];
		}
		System.out.println("Sum is: "+sum);
	}
}
