package CollectionFrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Scanner;

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
	}
}
