package Loops;

import java.util.Scanner;

//Display AP Series
public class ArithmaticProgressionSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Displaying Arithmatic Progression Series");
		System.out.println("Enter numbers for n, a, d");
		
		int n=sc.nextInt();
		int a=sc.nextInt();
		int d=sc.nextInt();
		
		int term=a;
		
		for(int i=0;i<n;i++)
		{
		System.out.print(term+",");
		term=term+d;
		
		}
	}
}
