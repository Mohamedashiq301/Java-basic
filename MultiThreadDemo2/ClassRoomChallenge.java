package MultiThreadDemo2;

class WhiteBoard
{
	String text;
	int noofStudents=0;
	int count=0;
	
	public void attendence() {
		noofStudents++;
	}
	synchronized void write(String t)
	{
		System.out.println("Teacher is writing "+text);
		while(count!=0)
			try {
				wait();
			} catch (Exception e) {
				
			}
		text=t;
		count=noofStudents;
		notifyAll();
	}
	synchronized public String read()
	{
		while(count==0)
			try {
				wait();
			} catch (Exception e) {
				
			}
		String t=text;
		count--;
		if (count==0)
			notifyAll();
		return t;
	}
	
}

class Teacher extends Thread
{
	WhiteBoard wb;
	
	String note[]= {"It is Java Language","It is Simple","It is Robust","It supports Thread","End"};
	
	public Teacher(WhiteBoard w)
	{
		this.wb=w;
	}
	
	public void run()
	{
		for (int i=0;i<note.length;i++)
			wb.write(note[i]);
	}
}
class Student extends Thread
{
	WhiteBoard wb;
	
	String name;
	public Student(String n,WhiteBoard w) 
	{
		name=n;
		this.wb=w;
	}
	public void run()
	{
		String text;
		wb.attendence();
		
		do {
			text=wb.read();
			System.out.println(name+"Readin "+text);
			System.out.flush();
		}while(!text.equals("End"));
	}
}
public class ClassRoomChallenge {

	public static void main(String[] args) {
		WhiteBoard wb=new WhiteBoard();
		Teacher t=new Teacher(wb);
		
		Student s1=new Student("John",wb);
		Student s2=new Student("Smith",wb);
		Student s3=new Student("Pal",wb);
		Student s4=new Student("Mon",wb);
		
		t.start();
		
		s1.start();
		s2.start();
		s3.start();
		s4.start();
		
	}
}
