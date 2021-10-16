package Revision;

import java.util.Scanner;

public class ArithmeticProgressionSeries {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter numbers for a,d,n");
		int a=sc.nextInt();
		int d=sc.nextInt();
		int n=sc.nextInt();
		
		int term=a;
		
		for (int i=0;i<n;i++)
		{
			System.out.println(term);
			term=term+d;
		}
		sc.close();
	}
}
