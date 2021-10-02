package ConditionalStatement;

import java.util.Scanner;
//Find person is young or not young
public class Person_is_young_or_not {
	public static void main(String[] args) {
		int age;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the age of a person");
		
		age=sc.nextInt();
		
		
		if(age>=14 && age<=35) 
		{
			System.out.println("The person is young");
		}
		else
		{
			System.out.println("The person is not young");
		}
	}
}
