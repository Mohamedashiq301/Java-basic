package ExceptionDemo;

public class ExceptionTest2 {

	public static void main(String[] args) {
		int A[]= {30,20,10,0};
		try
		{
		int r=A[0]/A[3];
		System.out.println(r);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Denominator should not ne Zero,try again");
		}
		try
		{
			System.out.println(A[4]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			//Here you can also handle this exception with your own term
			System.out.println(e);
			//System.out.println("Index is invalid");
		}
		System.out.println("Bye");
	}
}
