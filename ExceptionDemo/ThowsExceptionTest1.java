package ExceptionDemo;

public class ThowsExceptionTest1 {

	static int meth2(int a,int b) throws Exception
	{
		int c=a/b;
		return c;
	}
	static void meth1() throws Exception
	{
		int r =meth2(10,2);
		System.out.println(r);
	}
	public static void main(String[] args) {
		try {
		meth1();
		}
		catch (Exception e) {
			System.out.println("Denominator should not be Zero");
		}
	}
}
