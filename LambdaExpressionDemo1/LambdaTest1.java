package LambdaExpressionDemo1;

interface MyLambda
{
	public void display();
}

class MyTest
{
	public void method1() {
		MyLambda ml=()->{System.out.println("Hello");};
		ml.display();
	}
}

public class LambdaTest1 {

	public static void main(String[] args) {
		MyTest mt=new MyTest();
		mt.method1();
	}
}
