package ConditionalStatement;

import java.util.Scanner;
//Finding a leap year

public class LeapYear {
	
	public static void main(String[] args) {
		int year;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a year ");
		year=sc.nextInt();
		
		if(year%4==0)
		{
			if(year%100==0) {
				
				if(year%400==0) {
					System.out.println("Its a leap year");
				}
				else {
					System.out.println("Not a leap year");
				}
				
			}
			else {
				System.out.println("Its a leap year");
			}
		}
		else {
			System.out.println("Not a leap year");
		}
	}

}
