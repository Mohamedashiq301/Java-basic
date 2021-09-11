package Practice2;

public class Stringpractice {
	public static void main(String[] args) {
		String str1="Java";
		str1=str1.toLowerCase();
		String str2="Java program";
		
		char c[]= {'H','e','l','l','o'};
		String str3=new String(c);
		
		byte b[]= {65,66,67,68};
		String str4= new String (b);
		
		byte b1[] = {69,70,71,72};
		String str5 = new String(b1,1,3);
		
		String str6="Java";
				
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str1==str6);
		
		int str7=str2.length();
		System.out.println(str7);
		
		String str8=str3.toUpperCase();
		System.out.println(str8);
	}

}
