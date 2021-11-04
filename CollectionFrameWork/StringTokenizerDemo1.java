package CollectionFrameWork;

import java.io.FileInputStream;
import java.util.StringTokenizer;

public class StringTokenizerDemo1 {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis1=new FileInputStream("c:/TestFiles/Student.txt");
		
		byte b[]=new byte [fis1.available()];
		
		fis1.read();
		
		String s=new String(b);
		
		StringTokenizer stk1=new StringTokenizer(s);
		
		while(stk1.hasMoreTokens());
		{
			s=stk1.nextToken();
			System.out.println(s);
		}
		fis1.close();
	}
}
