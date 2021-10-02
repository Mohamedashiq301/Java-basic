package MethodsDemo;

public class MethodPractice3 {

	static void inc (int x) {
		x++;
		System.out.println(x);
	}
	public static void main(String[] args) {
		{
			int a=10,b=15;
			inc (a);
			System.out.println(a);
			System.out.println(b);
		}
	}
}
