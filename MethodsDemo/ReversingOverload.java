package MethodsDemo;

import java.util.Scanner;

public class ReversingOverload {

	static int reverse (int n) {
	int rev=0;
	while (n>0)
	{
		rev=rev*10+n%10;
		n=n/10;
	}
	return rev;
	}
	
	static int[] reverse (int A[])
	{
		int B[]=new int [A.length];
		
		for(int i=A.length-1,j=0;i>=0;i--,j++)
		
			B[j]=A[i];
		
		return B;
	}
	static int[] reverse (String A)
	{
		int B[]=new int [A.length];
		
		for(int i=A.length-1,j=0;i>=0;i--,j++)
		
			B[j]=A[i];
		
		return B;
	}
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter a number");
		
		//int a =sc.nextInt();
		
		System.out.println(reverse(234));
		int A[]= {1,2,3,4,5,6,7,8,9,11};
		int C[]=reverse(A);
		for(int i=0;i<C.length;i++)
		{
		System.out.println(C[i]);
		}
		
	}
}
