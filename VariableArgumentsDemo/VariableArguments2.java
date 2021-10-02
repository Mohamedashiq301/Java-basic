package VariableArgumentsDemo;

public class VariableArguments2 {

	static void showList (String ...A)
	{
		for (int i=0;i<A.length;i++)
			System.out.println(i+1+". "+A[i]);
	}
	public static void main(String[] args) {
		
		showList("John","Maria","Ahamed","Suresh","Ashiq");
	}
}
