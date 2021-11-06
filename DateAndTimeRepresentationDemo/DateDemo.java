package DateAndTimeRepresentationDemo;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		
		Date d=new Date();
		System.out.println(d);
		//System.out.println(d.getDate());
		//Here the is deprecated...
		System.out.println(d.getTime());
		System.out.println(d.after(d));
		//System.out.println(d.getYear()+1900);
	}
}
