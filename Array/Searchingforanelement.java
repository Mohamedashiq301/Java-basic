package Array;

import java.util.Scanner;
//Searching for an element
public class Searchingforanelement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int key=sc.nextInt();
		
		int A[]= {3,9,7,8,12,6,15,5,4,10};
		
		for (int i=0;i<A.length;i++)
		{
			if (key==A[i])
			{
				System.out.println(i);
				System.exit(0);
			}
		}
		System.out.println("Not found");
	}
}
