package MethodsDemo;

public class MethodPractice5 {
//Addition is done by Pass by value
	static int add (int x,int y)
	{
		int z=x+y;
		return z;
	}
	public static void main(String[] args) {
		int a=10,b=5,c;
		
		c=add(a,b);
		System.out.println("Addition is: "+c);
	}
}
