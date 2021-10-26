package LambdaExpressionDemo;

@FunctionalInterface
interface my2
{
	public int add (int x,int y);
}
public class MyLambda2 {

	public static void main(String[] args) {
		my2 m2=(a,b)->a+b;
		
		System.out.println(m2.add(10, 20));
	}
}
