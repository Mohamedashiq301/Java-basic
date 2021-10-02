package Loops;

import java.util.Scanner;

public class Factorialofnumbers {
//Find factorial of a numbers
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		long fact=1;
		for (int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial number is "+fact);
	}
}
