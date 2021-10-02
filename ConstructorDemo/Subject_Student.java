package ConstructorDemo;

class Subject
{
	private String subid;
	private String name;
	private int maxMarks;
	private int marksobtain;
	
	public Subject(String subid,String name,int maxMarks)
	{
		this.subid=subid;
		this.name=name;
		this.maxMarks=maxMarks;
	}
	public String getSubid()
	{
		return subid;
	}
	public String getName()
	{
		return name;
	}
	public int getMaxMarks()
	{
		return maxMarks;
	}
	public int getMarksObtain()
	{
		return marksobtain;
	}
	public void setMaxMarks(int mm)
	{
		maxMarks=mm;
	}
	public boolean getQualified()
	{
		return marksobtain>=maxMarks/10*3;
	}
	public String toString()
	{
		return "Subject Id:"+subid+" \n Subject Name:"+name+" \n Max Marks:"+maxMarks;
	}
}
class Student
{
	private static final Subject[] Subject = null;
	private String rollno;
	private String studentname;
	private String dept;
	private String subjects;
	
	public Student(String rollno,String studentname,String dept,String subjects)
	{
		this.rollno=rollno;
		this.studentname=studentname;
		this.dept=dept;
		this.subjects=subjects;
	}
	public String getRollno()
	{
		return rollno;
	}
	public String getStudentname()
	{
		return studentname;
	}
	public String getDept()
	{
		return dept;
	}
	public Subject[] getSubjects()
	{
		return Subject;
	}
	public void setSubjects(String ss)
	{
		subjects=ss;
	}
	public String toString()
	{
		return "Rollno:"+rollno+"\n Student name:"+studentname+"\n Department"+dept+"\n Subject:"+subjects;
	}
}
public class Subject_Student {

	public static void main(String[] args) {
		Subject sub[]=new Subject[3];
		sub[0]= new Subject("s101","Java",100);
		sub[1]=new Subject("s102","Python",100);
		sub[2]=new Subject("s103","Data Science",100);

		for(Subject x:sub)
		{
			System.out.println(x);
		}
		Student stu[]=new Student[3];
		stu[0]=new Student("A101","John","CS", "Java");
		stu[1]=new Student("A102","Arun","CS", "Java");
		stu[2]=new Student("A103","John","CS", "Java");
		for(Student x:stu)
		{
			System.out.println(x);
		}
	}
}
