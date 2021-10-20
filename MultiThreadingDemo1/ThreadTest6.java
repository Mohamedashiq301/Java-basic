package MultiThreadingDemo1;

//Here by using the word synchronized you can achieve synchronized method on the method itself
//First it call the t1 and t2 should have to wiat in the queue
class MyData
{
	synchronized void display(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
class MyThread1 extends Thread
{
	MyData d1;
	MyThread1(MyData dat)
	{
		d1=dat;
	}
	public void run()
	{
		d1.display("Hello World");
	}
}
class MyThread2 extends Thread
{
	MyData d2;
	
	MyThread2(MyData dat)
	{
		d2=dat;
	}
	public void run()
	{
		d2.display("Welcome");
	}
}
public class ThreadTest6 {

	public static void main(String[] args) {
		MyData d=new MyData();
		MyThread1 t1=new MyThread1(d);
		MyThread2 t2=new MyThread2(d);
		t1.start();
		t2.start();
	}
}
