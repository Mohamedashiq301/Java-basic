package overRidingDemo;

class Super
{
	public void display()
	{
		System.out.println("Hello");
	}
}
class Sub extends Super
{
	public void display() 
	{
		System.out.println("Hello Welcome");
	}
}
public class OverRidingTest {

	public static void main(String[] args) {
		Super su=new Super();
		su.display();
		Sub sb=new Sub();
		sb.display();
		//Method dispatch method
		Super su1=new Sub();
		su1.display();
	}
}
