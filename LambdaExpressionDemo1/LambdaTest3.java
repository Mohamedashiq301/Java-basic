package LambdaExpressionDemo1;

interface LambdaMy2
{
	public void display(String str);
}
public class LambdaTest3 {

	public static void reverse(String str)
	{
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);
	}
	
	public LambdaTest3(String s)
	{
		System.out.println(s.toUpperCase());
	}
	public static void main(String[] args) {
		//LambdaMy2 l2=(()->{System.out.println("Hello World");});
		//l2.display();
		
		//LambdaTest3 l3=new LambdaTest3();
		//Here this not statis method , we have to create an object
		LambdaMy2 lm2=LambdaTest3::reverse;
		lm2.display("Hello");
		
		LambdaMy2 lm3=LambdaTest3::new;
		lm3.display("hello");
		
	}
}
