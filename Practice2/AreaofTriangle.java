package Practice2;

import java.util.Scanner;

public class AreaofTriangle {
	public static void main(String[] args) {
		/*
		 * 
		float base, height, area;
		System.out.println("Enter base and height");
		Scanner sc =new Scanner(System.in);
		base=sc.nextInt();
		height= sc.nextInt();
		area=(base*height)/2;
		System.out.println("Area of Triangle : "+area);
		*/
		
		int a,b,c;
		double s,area;
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter 3 sidesof triangle ");
		
		a=sc1.nextInt();
		b=sc1.nextInt();
		c=sc1.nextInt();
		
		s = (a+b+c)/2f;
		
	
		area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("AreaofTriangle : "+area);
	}
}
