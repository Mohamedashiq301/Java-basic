package MultiThreadingDemo1;

class MyTest extends Thread
{
	public void run()
	{
		int count=1;
		while (true)
		{
			System.out.println(count+++"My thread");
		}
	}
}
public class ThreadTest5 {

	public static void main(String[] args) {
		
		MyTest m=new MyTest();
		m.start();
		
		int count=1;
		while (true)
		{
			System.out.println(count+++"Main");
			Thread.yield();
		}
	}
}
