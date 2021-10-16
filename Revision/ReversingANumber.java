package Revision;

import java.util.Scanner;

public class ReversingANumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		int r;
		int rev=0;
		
		while(n>0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		System.out.println(rev);
		sc.close();
	}
}
