package MethodsDemo;

import java.util.Scanner;

public class MethodPractice2 {

	int max(int x,int y) {
		if (x>y)
			return x;
		else 
			return y;
	}
	public static void main(String[] args) {
		{
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter 2 numbers");
			
			int a=sc.nextInt();
			int b=sc.nextInt();
			
			MethodPractice2 mp=new MethodPractice2();
			System.out.println(mp.max(a,b));
		}
	}
}
