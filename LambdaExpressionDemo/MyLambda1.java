package LambdaExpressionDemo;

@FunctionalInterface
interface my1
{
	public void display(String str);
	
}
public class MyLambda1 {

	public static void main(String[] args) {
		my1 m1=(s)->{System.out.println(s);};
		m1.display("Hello World");
	}
}
