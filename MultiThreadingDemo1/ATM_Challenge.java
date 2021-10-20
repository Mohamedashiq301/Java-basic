package MultiThreadingDemo1;

class ATM
{
	void checkBalance(String name)
	{
		synchronized(this)
		{
		System.out.println(name+" Balance");
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			
		}
		}
		//System.out.println("Balance");
	}
	public void Withdraw(String name, int amount)
	{
		synchronized(this)
		{
		System.out.println(name+", "+amount+", "+"Amount withdraw");
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			
		}
		}
		//System.out.println("Withdraw");
	}
}
class Customer extends Thread
{
	ATM atm;
	String name;
	int amount;
	
	Customer(ATM atm,String name,int amount)
	{
		this.atm=atm;
		this.name=name;
		this.amount=amount;
	}
	public void useATM()
	{
		atm.checkBalance(name);
		atm.Withdraw(name, amount);
	}
	public void run()
	{
		useATM();
	}
}
public class ATM_Challenge
{
	public static void main(String[] args) {
		ATM a=new ATM();
		
		Customer c1=new Customer(a,"Smith",100);
		Customer c2=new Customer(a,"John",200);
		
		c1.start();
		
		c2.start();
	}
}