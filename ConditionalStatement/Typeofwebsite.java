package ConditionalStatement;

import java.util.Scanner;

public class Typeofwebsite {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the website address");
		String url=sc.nextLine();
		
		String protocol=url.substring(0,url.indexOf(":"));
		
		if (protocol.equals("http"))
			System.out.println("Hypertext transfer protocol");
		else if (protocol.equals("ftp"))
			System.out.println("File transfer protocol");
		
		String ext=url.substring(url.lastIndexOf(".")+1);
		
		if (ext.equals("com"))
			System.out.println("Commercial site");
		else if (ext.equals("org"))
			System.out.println("Organisation site");
		else if (ext.equals("in"))
			System.out.println("Indian site");
		
	}
}
