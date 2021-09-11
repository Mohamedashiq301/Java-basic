package ConditionalStatement;

import java.util.Scanner;

//Find Radix of a number 
public class FindingRadixNumber {
	public static void main(String[] args) {
		String num;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
		num=sc.nextLine();
		
		if (num.matches("[01]+"))
		{
			System.out.println("Binary number Radix2");
		}
		else if (num.matches("[0-7]+"))
		{
			System.out.println("octal number Radix8");
		}
		else if (num.matches("[0-9]+"))
		{
			System.out.println("Decimal number Radix 10");
		}
		else if (num.matches("[0-9A-F]+"))
		{
			System.out.println("Hexadecimal number Radix16");
		}
		else 
		{
			System.out.println("Not a number");
		}
	}
}
