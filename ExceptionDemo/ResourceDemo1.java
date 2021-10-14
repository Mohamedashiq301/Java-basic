package ExceptionDemo;

import java.io.FileInputStream;
import java.util.Scanner;

public class ResourceDemo1 {

	//static FileInputStream fi;
	static Scanner sc;
	
	static void Divide() throws Exception
	{
		try (FileInputStream fi=new FileInputStream("C:\\Users\\Ashiq\\eclipse-workspace\\Java Project\\src\\Test.txt")) {
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		System.out.println(a/b);
		}

	}
	public static void main(String[] args) throws Exception {
		Divide();
	}
}
