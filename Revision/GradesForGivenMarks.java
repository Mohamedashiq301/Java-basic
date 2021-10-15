package Revision;

import java.util.Scanner;

public class GradesForGivenMarks {

	public static void main(String[] args) {

		int m1, m2, m3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks");

		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();

		int avg = (m1 + m2 + m3) / 3;

		if (avg >= 70) 
		{
			System.out.println("A Grade");
		}
		else if (avg < 70 && avg >= 60) 
		{
			System.out.println("B Grade");
		}
		else if (avg < 60 && avg >= 50) 
		{
			System.out.println("C Grade");
		}
		else if (avg < 50 && avg >= 40) 
		{
			System.out.println(" D Grade");
		}
		else
		{
			System.out.println("F Grade");
		}
	sc.close();
	}
}
