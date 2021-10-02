package Switchcase;

import java.util.Scanner;

public class Typeofwebsite {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a URL");
		String url = sc.nextLine();

		String ext = url.substring(url.lastIndexOf((".") + 1));

		switch (ext) {
		case "com":
			System.out.println("Commercial");
			break;
		case "org":
			System.out.println("Organisation");
			break;

		case "gov":
			System.out.println("Government");
			break;
		case "net":
			System.out.println("Network");
			break;
		// default:System.out.println("Invalid site");
		// break;
		}
	}
}
