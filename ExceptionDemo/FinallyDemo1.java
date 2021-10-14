package ExceptionDemo;

public class FinallyDemo1 {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		//Here when you are using catch block then there is no need of finally block,eventally it will work..
		finally{
			System.out.println("final message");
		}
	}
}
