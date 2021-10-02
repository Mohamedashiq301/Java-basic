package MethodsDemo;

public class MethodPractice4 {

	static void change (int A[],int index,int value)
	{
		A[index]=value;
	}
	static void change2(int x,int value)
	{
		x=value;
	}
	public static void main(String[] args) {
		int A[]= {2,3,6,8,10};
		//Here it is done with for loop
		for (int i=0;i<A.length;i++) 
		{
			System.out.print(A[i]+",");
		}
		System.out.println(" ");
		change(A,2,20);
		//it can also done with for each loop
		for (int x:A)
		{
			System.out.print(x+",");
		}
		System.out.println(" ");
		int x=10;
		//Here the primitive value is not change,since value within array only be changed
		change2(x,20);
		System.out.println("Value of primitive: "+x);
	}
}
