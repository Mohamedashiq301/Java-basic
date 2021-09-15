package Loops;

import java.util.Scanner;

//Display Fibonacci Series
public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		int a=0,b=1,c;
		System.out.println(a+" "+b);
		for (int i=0;i<n-2;i++)
		{
			c=a+b;
			System.out.print(c+",");
			a=b;
			b=c;
		
			
		}
	}
}
