package Loops;

import java.util.Scanner;

//Finding a number is Armstrong or Not
public class ArmstrongorNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		
		int n=sc.nextInt();
		
		int m=n;
		int r;
		int sum=0;
		
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+r*r*r;
			
		}
		if (sum==m)
			System.out.println("Number entered is Armstrong number");
		else
			System.out.println("Number entered is not Armstrong number");
	}
}
