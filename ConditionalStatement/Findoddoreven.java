package ConditionalStatement;

import java.util.Scanner;
//Find a number is odd or even
public class Findoddoreven {
	public static void main(String[] args) {
		int a;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		
		a=sc.nextInt();
		if (a%2==0)
		{
			System.out.println("Number you entered is Even number");
		}
		else
		{
			System.out.println("Number you entered is odd number");
		}
	}
}
