package OopsDemo;

class rectangle1
{
	public double length;
	public double breadth;
	
	public double area()
	{
		return length*breadth;
	}
	
	public double perimeter()
	{
		return 2*(length+breadth);
	}
	
	public boolean isSquare()
	{
		if (length==breadth)
			return true;
		else
			return false;
	}
}
public class Rectangle {

	public static void main(String[] args) {
		
		rectangle1 r1=new rectangle1();
		rectangle1 r2=new rectangle1();
		
		r1.breadth=3;
		r1.length=6;
		
		r2.length=8;
		r2.breadth=4;
		
		System.out.println("Area:"+r1.area());
		System.out.println("Perimeter:"+r1.perimeter());
		System.out.println("IsSquare:"+r1.isSquare());
		
		System.out.println("Area:"+r2.area());
		System.out.println("Perimeter:"+r2.perimeter());
		System.out.println("IsSquare:"+r2.isSquare());
	}
}
