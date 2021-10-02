package InheritenceDemo;

class Account
{
	private String Accno;
	private String name;
	private String address;
	private String phno;
	private String dob;
	protected int balance;
	
	public Account (String Accno,String name,String address,String phno,String dob)
	{
		this.Accno=Accno;
		this.name=name;
		this.address=address;
		this.phno=phno;
		this.dob=dob;
		balance=0;
	}
	
	public String getaccno(){
		return Accno;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getPhno() {
		return phno;
	}
	public String getDob() {
		return dob;
	}
	public int getBalance() {
		return balance;
	}
	public void setAddress(String addr)
	{
		address=addr;
	}
	public void setPhno(String phono)
	{
		phno=phono;
	}
}
class SavingsAccount extends Account
{
	public SavingsAccount(String Accno, String name, String address, String phno, String dob) {
		super(Accno, name, address, phno, dob);
	}
	public void deposit(int amt)
	{
		balance+=amt;
	}
	public void withdraw(int amt)
	{
		balance-=amt;
	}
}
class LoanAccount extends Account
{
	public LoanAccount(String Accno, String name, String address, String phno, String dob) {
		super(Accno, name, address, phno, dob);
	}
	
	public void payEMI(int amt)
	{
		balance -=amt;
	}
	public void rePay(int amt)
	{
		if (balance==amt)
			balance=0;
	}
	
}
public class AccountTest {

	public static void main(String[] args) {
		SavingsAccount sa=new SavingsAccount("1234567890009", "John", "America", "9876543110", "20/12/1998");
		
		sa.deposit(200);
		sa.withdraw(100);
		
		System.out.println("Account no: "+sa.getaccno());
		System.out.println("Name:"+sa.getName());
		System.out.println("Address:"+sa.getAddress());
		System.out.println("Phone No:"+sa.getPhno());
		System.out.println("Date of Birth:"+sa.getDob());
		System.out.println("Balance:"+sa.balance);
		
		System.out.println("^^^^^^^^^^^^^^^^^^^");
		LoanAccount lm=new LoanAccount("1234567890009", "John", "America", "9876543110", "20/12/1998");
		//int amt=10000;
		lm.payEMI(300);
		lm.rePay(300);
		System.out.println("Account no: "+sa.getaccno());
		System.out.println("Name:"+sa.getName());
		System.out.println("Address:"+sa.getAddress());
		System.out.println("Phone No:"+sa.getPhno());
		System.out.println("Date of Birth:"+sa.getDob());
		System.out.println("Loan Amount:"+lm.balance);
		//System.out.println("Repay AMount:"+lm.rePay());
	}
}
