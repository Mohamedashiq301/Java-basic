package Loops;

import java.util.Scanner;

public class DisplayNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		
		int n=sc.nextInt();
		while (n>0) {
			int r=n%10;
			n=n/10;
			System.out.println(r);
		}
		System.out.println(n);
	}
}
