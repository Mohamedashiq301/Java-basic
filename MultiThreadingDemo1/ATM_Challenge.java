package MultiThreadingDemo1;

class ATM
{
	synchronized void checkBalance(String name)
	{
		
		System.out.print(name+" Checking");
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			
		}
		
		System.out.println(" Balance");
	}
	synchronized void Withdraw(String name, int amount)
	{
		System.out.print(name+", "+"Withdrawing ");
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			
		}
		
		System.out.println(amount);
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