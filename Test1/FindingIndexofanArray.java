package Test1;

import java.util.Scanner;

public class FindingIndexofanArray {

	public static void main(String[] args) {
		int A[] = { 1, 2, 3, 4, 8,4};
		boolean found =false;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");
		int match = sc.nextInt();
		sc.close();
		
		for (int i = 0; i < A.length; i++) {
			if(A[i]==match)
			{
				found=true;
				System.out.println("Index of Array"+i);
				break;
			}
		
		}
		if (found==false) {
		System.out.println("Number not found");
		}
	}
}
