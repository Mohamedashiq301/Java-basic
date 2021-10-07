package StaticPracticeDemo;

class Test
{
	static 
	{
		System.out.println("Block 1");
	}
	static 
	{
		System.out.println("Block 2");
	}
}
public class StaticBlock2 {

	public static void main(String[] args) {
		
		Test t=new Test();
		System.out.println("Main");
		//Here you can print test object after the main also............
	}
}
