package SingletonDemo;

import java.util.Date;

class Student
{
	private String rollno;
	
	private static int count=1;
	
	private String assignRollno()
	{
		Date d=new Date();
		@SuppressWarnings("deprecation")
		String rno="Univ-"+(d.getYear()+1900)+"-"+count;
		count++;
		return rno;
	}
	Student()
	{
		rollno=assignRollno();
	}
	public String getrollno()
	{
		return rollno;
	}
}
public class StudentRollNO {

	public static void main(String[] args) {
		Student s1 =new Student();
		Student s2=new Student();
		Student s3=new Student();
		
		System.out.println(s1.getrollno());
		System.out.println(s2.getrollno());
		System.out.println(s3.getrollno());
	}
}
