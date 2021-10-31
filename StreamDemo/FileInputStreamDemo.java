package StreamDemo;

import java.io.*;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		try 
		{
			FileInputStream fis =new FileInputStream("c:/TestFiles/MyTest");
			
			byte b[]=new byte[fis.available()];
			
			fis.read(b);
			
			String str=new String(b);
			
			System.out.println(str);
			
			fis.close();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
