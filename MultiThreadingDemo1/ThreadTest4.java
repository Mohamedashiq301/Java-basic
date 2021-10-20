package MultiThreadingDemo1;

//Deamon thread and join thread demo
class Test extends Thread
{
	public void run()
	{
	int count=1;
	while(true)
	{
		System.out.println(count++);
	}
	}
}
public class ThreadTest4 {

	public static void main(String[] args) throws InterruptedException {
		Test t=new Test();
		t.setDaemon(true);
		t.start();
		Thread mainThread=Thread.currentThread();
		mainThread.join();
	}
}
