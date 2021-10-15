package Revision;

import java.util.Scanner;

public class MenuDrivenProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Menu");
		System.out.println("====");
		System.out.println("ADD");
		System.out.println("SUB");
		System.out.println("MUL");
		System.out.println("DIV");
		
		System.out.println("Enter to two numbers");
		
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter Option in words");
		String option =sc.nextLine();
		switch (option)
		{
		case "ADD": System.out.println(x+y);
		break;
		case "SUB": System.out.println(x-y);
		break;
		case "MUL": System.out.println(x*y);
		break;
		case "DIV": System.out.println(x/y);
		break;
		default: System.out.println("Invalid Input");
		}
		sc.close();
	}
}
