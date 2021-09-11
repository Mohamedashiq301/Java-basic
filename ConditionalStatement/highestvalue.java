package ConditionalStatement;

import java.util.Scanner;

public class highestvalue {
	public static void main(String[] args) {
		int a, b, c;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the values for a, b, c");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if (a>b&&a>c)
		{
			System.out.println("The value a is high");
			
		}
		else if (b>c)
		{
			System.out.println("The value of b is high");
			
		}
		else
		{
			System.out.println("The value of c is high");
		}
	}
}
