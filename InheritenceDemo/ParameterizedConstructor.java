package InheritenceDemo;
class Parent1 
{
	public Parent1()
	{
		System.out.println("Non Param Parent Constructor");
	}
	public Parent1(int x)
	{
		System.out.println("Param Parent Constructor");
	}
}
class Children extends Parent1
{
	public Children()
	{
		System.out.println("Non Param Child Constructor");
	}
	public Children(int y)
	{
		System.out.println("Param Child Constructor");
	}
}
public class ParameterizedConstructor {

	public static void main(String[] args) {
		Parent1 p1=new Children();
		p1.getClass();
	}
}
