package StaticPracticeDemo;

public class StaticBlock1 {

	static 
	{
		System.out.println("Block1");
	}
	public static void main(String[] args) {
		System.out.println("Main");
		//Here the main will be printed after the static only...
	}
	//Even there is nothing inside the block but it is printing the static
	//Before having somthing in the main block
	static
	{
		System.out.println("Block 2");
	}
}
