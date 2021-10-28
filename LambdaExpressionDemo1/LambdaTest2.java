package LambdaExpressionDemo1;

interface LambdaMy
{
	public void display();
}

class my1
{
	public void callLambda(LambdaMy lm)
	{
		lm.display();
	}
}

class MyDemo1
{
	public void method1()
	{
		my1 m1=new my1();
		m1.callLambda(()->{System.out.println("Hello");});
	}
}
public class LambdaTest2 {

	public static void main(String[] args) {
		MyDemo1 md=new MyDemo1();
		md.method1();
	}
}
