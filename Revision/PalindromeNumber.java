package Revision;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		
		int n=sc.nextInt();
		
		int m=n;
		int r;
		int rev=0;
		
		while (n>0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(m==rev)
		{
			System.out.println("Number Palindrome");
		}
		else 
		{
			System.out.println("Not a palindrome");
		}
		sc.close();
	}
}
