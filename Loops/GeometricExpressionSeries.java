package Loops;

import java.util.Scanner;

//Display GP series
public class GeometricExpressionSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter numbers of n, a, and r");
		int n=sc.nextInt();
		int a=sc.nextInt();
		int r=sc.nextInt();
		
		int term=a;
		for(int i=0;i<n;i++)
		{
			System.out.print(term+",");
			term=term*r;
		}
	}
}
