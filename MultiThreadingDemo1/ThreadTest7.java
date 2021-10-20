package MultiThreadingDemo1;

class MyData1
{
	void display(String str)
	{
		synchronized(this) {
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}
		}
	}
}
class MyThread3 extends Thread
{
	MyData1 d3;
	MyThread3(MyData1 dat)
	{
		d3=dat;
	}
	public void run()
	{
		d3.display("Hello World");
	}
}
class MyThread4 extends Thread
{
	MyData1 d4;
	MyThread4(MyData1 dat)
	{
		d4=dat;
	}
	public void run()
	{
		d4.display("Welcome");
	}
}
public class ThreadTest7 {

	public static void main(String[] args) {
		MyData1 d1=new MyData1();
		MyThread3 t3=new MyThread3(d1);
		MyThread4 t4=new MyThread4(d1);
		t3.start();
		t4.start();
		
	}
}
