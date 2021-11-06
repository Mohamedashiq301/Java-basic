package CollectionFrameWorkDemo1;

import java.io.*;
import java.util.*;

class bankaccount implements Serializable
{
	String accno;
	String name;
	double balance;
	
	bankaccount(){}
	
	bankaccount(String a,String n,double b)
	{
		accno=a;
		name=n;
		balance=b;
	}
	public String toString()
	{
		return "Account no: "+accno+"\n Name:"+name+"\n Balance: "+balance+"\n";
	}
}
public class MenuDrivenProgram {

	public static void main(String[] args) throws Exception{
		
		Scanner sc=new Scanner(System.in);
		
		bankaccount acc1=null;
		HashMap<String , bankaccount> hm2=new HashMap<String, bankaccount>();
		
		try {
			FileOutputStream fos2=new FileOutputStream("c:/TestFile/AccountTest2");
			ObjectOutputStream oos2 =new ObjectOutputStream(fos2);
			
		} catch (Exception e) {
			
		}
	}
}
