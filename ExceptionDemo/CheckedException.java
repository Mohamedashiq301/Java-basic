package ExceptionDemo;

class MinBalanceException extends Exception
{
	@Override
	public String toString()
	{
		return "Balance Should not be below 5000,so try agin with some lesser amount";
	}
}
public class CheckedException {

	static void balance()
	{
		try 
		{
			throw new MinBalanceException();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		balance();
	}
}
