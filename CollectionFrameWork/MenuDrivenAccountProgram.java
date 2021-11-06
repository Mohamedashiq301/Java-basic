package CollectionFrameWork;

import java.io.*;

import java.util.*;


@SuppressWarnings("serial")
class Account implements Serializable
{
	String accno;
	String name;
	double balance;
	Account(){}
	
	Account(String a,String n,double b) {
		accno=a;
		name=n;
		balance=b;
	}
	
	public String toString()
	{
		return "Account No:\"+accno+\"\nName :\"+name+\"\nBalance :\"+balance+\"\n";
	}
	
	
}
public class MenuDrivenAccountProgram {

	public static void main(String[] args) throws Exception {
		
		Scanner sc=new Scanner(System.in);
		HashMap<String, Account> hm1=new HashMap<String, Account>();
		
		Account acc=null;
		
		try {
			FileInputStream fis2=new FileInputStream("c:/TestFiles/Account.txt");
			ObjectInputStream ois=new ObjectInputStream(fis2);
			
			int count=ois.readInt();
			for(int i=0;i<count;i++)
			{
				acc=(Account)ois.readObject();
				System.out.println(acc);
				
			}
		} 
		catch (FileNotFoundException e) {
			System.out.println(e);
		}
		
		FileOutputStream fos2=new FileOutputStream("c:/TestFiles/Account.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos2);
		
		System.out.println("Menu");
		
		int choice = 0;
		String accno, name;
		double balance;
		
		sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		do
		{
			System.out.println("1.Create Account");
			System.out.println("2.Delete Account");
			System.out.println("3.View Account");
			System.out.println("4.View All Account");
			System.out.println("5.Save Account");
			System.out.println("6.Exit");
			
			switch(choice)
			{
			case 1:System.out.println("Enter Account no,Name,Balance");
			accno=sc.nextLine();
			name=sc.nextLine();
			balance=sc.nextDouble();
			acc=new Account(accno,name,balance);
			hm1.put(accno, acc);
			System.out.println("Account created for "+name);
			break;
			
			case 2:System.out.println("Enter Account number");
			accno=sc.nextLine();
			hm1.remove(accno);
			break;
			
			case 3:System.out.println("Enter Account no");
			accno=sc.nextLine();
			hm1.get(accno);
			System.out.println(accno);
			break;
			
			case 4:
				for(Account a:hm1.values())
					System.out.println(a);
				break;
				
			case 5:
			case 6:oos.writeInt((hm1.size()));
			
			for(Account a:hm1.values())
				oos.writeObject(a);
			break;
			}
		}
		while(choice!=6);
		oos.flush();
		oos.close();
		
		fos2.close();
		
		sc.close();
		
		
	}
}
