package ConditionalStatement;

import java.util.Scanner;
//Display name of a day based on number
public class Displayday {
	public static void main(String[] args) {
		int day;
		Scanner scan5=new Scanner (System.in);
		
		System.out.println("Enter a day number");
		day=scan5.nextInt();
		
		if (day==1)
		{
		System.out.println("The day is Monday");
		}
		else if (day==2) {
			System.out.println("The day is Tuesday");
		}
		else if (day==3) {
			System.out.println("The day is Wednesday");
		}
		else  if (day==4) {
			System.out.println("The day is Thursday");
		}
		else if (day==5) {
			System.out.println("The day is Friday");
		}
		else if (day==6) {
			System.out.println("The day is Saturday");
		}
		else if (day==7) {
			System.out.println("The day is Sunday");
		}
		else {
			System.out.println("The day number is invalid");
		}
		}
}
