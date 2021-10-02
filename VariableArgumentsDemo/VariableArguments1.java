package VariableArgumentsDemo;

public class VariableArguments1 {

	static void show(int ...A)
	{
		for (int x:A)
			System.out.println(x);
	}
	
	public static void main(String[] args) {
		
		show();
		show(10,20,30);
		show(new int[] {10,20,30,40});
	}
}
