package Revision;

import java.util.Scanner;

public class PersonisYoungOrNotYoung {

	public static void main(String[] args) {
		
		int n;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a number");
		n=sc.nextInt();
		
		if(n>=14 &&n<=30)
		{
			System.out.println("Person is Young");
		}
		else
		{
			System.out.println("Person is not Young");
		}
		sc.close();
	}
}
