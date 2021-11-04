package CollectionFrameWork;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		
		String Data="Name=Vijay;Address=Delhi;Country=India;Dept=CSE";
		
		StringTokenizer stk=new StringTokenizer(Data,"=;");
		
		String s;
		
		while(stk.hasMoreElements())
		{
			s=stk.nextToken();
			System.out.println(s);
		}
	}
}
