package StaticPracticeDemo;

class My
{
	static int x=10;
	int y=20;
	
	//Here the method is static so you can access only the static variable
	static void show()
	{
		System.out.println(x);
	}
	
	//Here the method is non-static so yo can both the static variable and non-static variable
	void display()
	{
		System.out.println(x+" "+y);
	}
	
}
public class StaticPractice {

	public static void main(String[] args) {
		My m=new My();
		m.show();
		m.display();
		
		My m1=new My();
		m1.display();
		m1.x=30;
		m1.y=50;
		//Here the value of x is static so the x value become shaded in m2
		My m2=new My();
		m2.display();
	}
}
