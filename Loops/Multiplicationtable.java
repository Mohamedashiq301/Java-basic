package Loops;

import java.util.Scanner;

//Display Multiplication table

public class Multiplicationtable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter a number");
		int m=sc.nextInt();

		for (int i = 1; i <= m; i++) {
			System.out.println(i + "X" + n + "=" + n * i);
		}
	}
}
