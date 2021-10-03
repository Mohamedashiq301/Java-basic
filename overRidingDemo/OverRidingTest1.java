package overRidingDemo;

class Parent
{
	public void display()
	{
		System.out.println("Hello");
	}
}
class Child extends Parent
{
	public void display()
	{
		System.out.println("Hello Welcome");
	}
}
public class OverRidingTest1 {
	// Object of child method is called eventhou object of reference of parent method is not called
	//Reference of super class and object of sub class
	//Method Dispatch method
	public static void main(String[] args) {
		Parent p=new Child();
		p.display();
	}
}
