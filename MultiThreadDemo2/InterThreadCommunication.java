package MultiThreadDemo2;

class MyData {
	int value = 0;
	boolean flag = true;

	synchronized void set(int v) {
		while (flag != true) 
			try {
				wait();
			} catch (InterruptedException e) {

			}
			value = v;
			flag = false;
			notify();
		
	}

	synchronized int get() {
		int x = 0;
		while (flag != false) 
			try {
				wait();
			} catch (InterruptedException e) {

			}

			x = value;

			flag = true;
			notify();

		
		return x;
	}
}

class Producer extends Thread {
	MyData d;
	int i = 1;

	Producer(MyData dat) {
		this.d = dat;
	}

	public void run() {
		while (true) {
			d.set(i);
			System.out.println("Producer " + i);
			i++;
		}
	}
}

class Consumer extends Thread {
	MyData d;
	int value;

	Consumer(MyData dat) {
		this.d = dat;
	}


	public void run() {
		while (true) {
			value = d.get();

			System.out.println("Consumer " + value);
		}
	}
}

public class InterThreadCommunication {

	public static void main(String[] args) {
		MyData m = new MyData();
		Producer p = new Producer(m);
		Consumer c = new Consumer(m);

		p.start();
		c.start();
	}
}
