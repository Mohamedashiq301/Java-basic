package OopsDemo;

class student
{
	public int rollno;
	public String name;
	public String course;
	public int m1,m2,m3;
	
	
	public double total()
	{
		return m1+m2+m3;
	}
	public double average()
	{
		return total()/3;
	}
	public char grade()
	{
		if(average()>=60)
		{
			return 'A';
		}
		else 
		{
			return 'B';
		}
	}
	
}
public class StudentStatus {

	public static void main(String[] args) {
		student s1=new student();
		
		s1.rollno=120;
		s1.name="John";
		s1.course="Mathemtics";
		s1.m1=65;
		s1.m2=72;
		s1.m3=81;
		
		System.out.println("Roll no:"+s1.rollno+";"+" Name:"+s1.name+";"+" Course:"+s1.course+";"+" Total:"+s1.total()+";"+" Average:"+s1.average()+";"+" Grade:"+s1.grade());
	}
}
