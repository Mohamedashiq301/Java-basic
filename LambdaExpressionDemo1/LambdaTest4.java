package LambdaExpressionDemo1;

interface LambdaMy4
{
	public int display(String str1,String str2);
}
public class LambdaTest4 {

	public static void main(String[] args) {
		
		LambdaMy4 lm4=String::compareTo;
		System.out.println(lm4.display("hello", "hello"));
	}
}
