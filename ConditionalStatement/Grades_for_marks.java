package ConditionalStatement;

import java.util.Scanner;
//FInd grades for given marks
public class Grades_for_marks {
	public static void main(String[] args) {
		int m1,m2,m3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks");
		
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
		
		float avg=(m1+m2+m3)/3;
		
		
		if(avg>=70)
		{
			System.out.println("The grade is A");
		}
		else if(avg>=60 && avg<70)
		{
			System.out.println("The grade is B");
		}
		else if(avg>=50 && avg<60)
		{
			System.out.println("The grade is C");
		}
		else if(avg>=40 && avg<50)
		{
			System.out.println("The grade is D");
		}
		else
		{
			System.out.println("The grade is F");
		}
	}
}
