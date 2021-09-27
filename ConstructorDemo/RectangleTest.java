package ConstructorDemo;

class Rectangle
{
	private double length;
	private double breadth;
	// Non parameterized constructor
	public Rectangle()
	{
		length=1;
		breadth=1;
	}
	//Parameterized constructor
	public Rectangle(double l,double b)
	{
		length=l;
		breadth=b;
	}
	public Rectangle(double s)
	{
		length=breadth=s;
	}
	public double area()
	{
		return length*breadth;
	}
}
public class RectangleTest {

	public static void main(String[] args) {
		//Rectangle r=new Rectangle();
		
		//System.out.println(r.area());
		
		Rectangle r=new Rectangle(10,5);
		System.out.println(r.area());
		
		//Rectangle r=new Rectangle(10);
		//System.out.println(r.area());
	}
}
