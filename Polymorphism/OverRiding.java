package Polymorphism;

class Super
{
	public void display()
	{
		System.out.println("Super Display");
	}
}
class Sub extends Super
{
	public void display()
	{
		System.out.println("Sub Display");
	}
}
public class OverRiding {

	public static void main(String[] args) {
		Super sup=new Super();
		sup.display();
		
		Sub sb=new Sub();
		sb.display();
		
		Super s=new Sub();
		s.display();
	}
}
