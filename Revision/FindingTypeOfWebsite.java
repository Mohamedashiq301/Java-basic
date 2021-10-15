package Revision;

import java.util.Scanner;

public class FindingTypeOfWebsite {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Website");
		
		String URL=sc.nextLine();
		
		String Protocol=URL.substring(0,URL.indexOf(":"));
				
		if (Protocol.equals("http"))
		{
			System.out.println("HyperText Transfer Protocol");
		}
		else if (Protocol.equals("ftp"))
		{
			System.out.println("File Transfer Protocol");
		}
		
		String ext=URL.substring(URL.lastIndexOf(".")+1);
		
		if (ext.equals("com"))
		{
			System.out.println("COmmercial site");
		}
		else if (ext.equals("org"))
		{
			System.out.println("Organisation site");
		}
		else if(ext.equals("in"))
		{
			System.out.println("Indian site");
		}
		sc.close();
	}
}
