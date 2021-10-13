package ExceptionDemo;

public class UncheckedException {
	public static void fun1()
	{
		try 
		{
			System.out.println(10/0);
		}
		catch (Exception e) {
			System.out.println("Denominator should not be Zero");
		}
	}
	public static void fun2()
	{
		fun1();
	}
	public static void fun3()
	{
		fun2();
	}
	public static void main(String[] args) {
		
		fun3();
	}
}
