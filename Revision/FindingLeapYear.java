package Revision;

import java.util.Scanner;

public class FindingLeapYear {

	public static void main(String[] args) {
		int year;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a year");
		year=sc.nextInt();
		
		if(year%4==0)
		{
			if (year%100==0)
			{
				if (year%400==0)
				{
					System.out.println("Leap year");
				}
				else
				{
					System.out.println("Not a Leap Year");
				}
			}
			else
			{
			System.out.println("Leap year");
			}
		}
		else 
		{
			System.out.println("Not a Leap year");
		}
		sc.close();
	}
}
