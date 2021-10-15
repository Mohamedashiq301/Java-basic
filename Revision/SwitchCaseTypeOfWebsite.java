package Revision;

import java.util.Scanner;

public class SwitchCaseTypeOfWebsite {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Website");
		
		String domain=sc.nextLine();
		
		String ext=domain.substring(domain.lastIndexOf(".")+1);
		
		switch (ext)
		{
			case "com": System.out.println("Commercial Site");
			break;
			case "org": System.out.println("Organisation Site");
			break;
			case "in": System.out.println("Indian Site");
			break;
			default: System.out.println("Invalid Site");
		}
		sc.close();
	}
}
