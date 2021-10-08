package Polymorphism;
class Test
{
	public int max (int a,int b)
	{
		if (a>b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	public int max (int a,int b,int c)
	{
		if (a>b&a>c)
		{
			return a;
		}
		else if (b>c)
		{
			return b;
		}
		else 
		{
			return c;
		}
	}
}
public class Overloading {

	public static void main(String[] args) {
		Test t=new Test();
		t.max(10, 5);
		//t.max(10, 15, 5);
		
	}
}
