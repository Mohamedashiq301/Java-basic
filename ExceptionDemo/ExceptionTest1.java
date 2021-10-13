package ExceptionDemo;

import java.util.Scanner;

public class ExceptionTest1 {

	public static void main(String[] args) {
		
		int a,b,c;
		//Here the b value should be Zero to carryout the Arithmetic Exception 
		//Because the denominator cannot be Zero
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter two numbers");
		
		a=sc.nextInt();
		b=sc.nextInt();
		
		sc.close();
		try {
			c=a/b;
			System.out.println("Result is "+c);
		}
		catch (ArithmeticException e ) {
			System.out.println("Denominator can't be Zero,try again");
		}
		System.out.println("Bye");
	}
}
