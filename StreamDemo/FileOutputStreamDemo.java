package StreamDemo;

import java.io.*;
public class FileOutputStreamDemo {

	public static void main(String[] args) {
		try
		{
			FileOutputStream fos=new FileOutputStream("c:/TestFiles/MyTest");
			
			String str="Learn Java Programming";
			
			byte b[]=str.getBytes();
			
			fos.write(b);
			fos.close();
		}
		catch (Exception e){
		System.out.println(e);
		}
		
	}
}
