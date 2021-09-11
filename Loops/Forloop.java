package Loops;

public class Forloop {

	public static void main(String[] args) {
		for(int i=0;i<=10;i++) 
		{
		System.out.println(i);	
		}
		
		System.out.println("################");
		for(int j=10;j>=0;j--)
		{
			System.out.println(j);
		}
		
		
		System.out.println("###############");
		
		for(int a=0,b=1;  a<=10; a++,b=b*2)
		{
			System.out.println(a+" "+b);
		}
	}
}
