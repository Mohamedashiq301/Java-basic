package InheritenceDemo1;
class Parent
{
	public Parent()
	{
		System.out.println("Non Param Parent Constructor");
	}
	public Parent(int x)
	{
		System.out.println("Param Parent Constructor");
	}
}
class Child extends Parent
{
	public Child()
	{
		System.out.println("Non Param Child Constructor");
	}
	public Child(int y)
	{
		System.out.println("Param Child Constructor");
	}
	public Child (int x,int y)
	{
		super (x);
		System.out.println("2 Param Constructor");
	}
}
public class ParameterizedConstructor {

	public static void main(String[] args) {
		//child c=new Child();
		Child c=new Child(10,20);
		
	}
}
