package InheritenceDemo;

class parent
{
	public parent() {
	System.out.println("Parent Constructor");
	}
}
class Child extends parent
{
	public Child()
	{
		System.out.println("Child Constructor");
	}
}
class GrandChild extends Child
{
	public GrandChild()
	{
		System.out.println("Grand Child Constructor");
	}
}
public class InheritenceConstructorDemo {

	public static void main(String[] args) {
		GrandChild gc=new GrandChild();
		gc.getClass();
	}
}
