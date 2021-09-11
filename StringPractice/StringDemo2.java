package StringPractice;

public class StringDemo2 {
	public static void main(String[] args) {

		int b=10100100;
		String str=String.valueOf(b);
		
		System.out.println(str.matches("[01]+"));
		
		
		String str2="224AB";
		System.out.println(str2.matches("[0-9A-F]+"));
		
		
		String f="01/12/2000";
		System.out.println(f.matches("[0-1][0-9]/[0-1][0-9]/[0-9]{4}"));
		
		String str1="a@B$c%1!@*";
		System.out.println(str1.replaceAll("[^a-zA-Z0-9]", ""));
		
		
		String str3="abc     cd     ef     gh";
		System.out.println(str3.replaceAll("\\s+", ""));
		
		
		String str4="     abcdefgh      ";
		System.out.println(str4.trim());
	}
}
