package Revision;

import java.util.Scanner;

public class GeometricProgresionSeries {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter number for a,r,n");
		
		int a=sc.nextInt();
		int r=sc.nextInt();
		int n=sc.nextInt();
		
		int term=a;
		for (int i=0;i<n;i++)
		{
			System.out.print(term+" ");
			term=term*r;
		}
		sc.close();
	}
}
