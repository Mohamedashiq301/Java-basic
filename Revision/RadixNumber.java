package Revision;

import java.util.Scanner;

public class RadixNumber {

	public static void main(String[] args) {
		
		String num;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number");
		
		num=sc.nextLine();
		
		if (num.matches("[01]+"))
		{
			System.out.println("Binary Number Radix 2");
		}
		else if (num.matches("[0-7]+"))
		{
			System.out.println("Octal Number Radix 8");
		}
		else if (num.matches("[0-9]+"))
		{
			System.out.println("Decimal Number Radix 10");
		}
		else if (num.matches("[0-9A-F]+"))
		{
			System.out.println("HexaDecimal Number Radix 16");
		}
		else
		{
			System.out.println("Invalid Number");
		}
		sc.close();
	}
}
