package LambdaExpressionDemo;

@FunctionalInterface
interface My
{
	public void display();
}
public class MyLambda {

	public static void main(String[] args) {
		
	
	My m=()->{System.out.println("Hello world");};
	m.display();
}
}
