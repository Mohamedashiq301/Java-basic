package DynamicMethodDispatch;

class Super
{
	public void meth1()
	{
		System.out.println("Meth1");
	}
	public void meth2()
	{
		System.out.println("Super Meth2");
	}
}
class Sub extends Super
{
	@Override
	public void meth2()
	{
		System.out.println("Sub Meth2");
	}
	public void meth3()
	{
		System.out.println("Meth3");
	}
}
public class Test {

	public static void main(String[] args) {
		
		//Over riding method
		Super sup=new Super();
		sup.meth1();
		sup.meth2();
		System.out.println("-----------------------");
		//over riding method
		Sub sb=new Sub();
		sb.meth1();
		sb.meth2();
		sb.meth3();
		System.out.println("===================");
		//Dynamic Dispatch Method
		Super s=new Sub();
		//Here reference of super is assigned to method of sub class
		//Method of super class is overriden in sub class
		//so the meth3 is not called...meth2 will be shadowed
		s.meth1();
		s.meth2();
	}
}
