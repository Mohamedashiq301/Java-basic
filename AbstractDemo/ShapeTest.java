package AbstractDemo;

abstract class Shape
{
	abstract double perimeter();
	abstract double area();
}
class Circle extends Shape
{
	int radius;
	@Override
	public double perimeter()
	{
		return 2*Math.PI*radius;
	}
	public double area()
	{
		return Math.PI*radius*radius;
	}
}
class Rectangle extends Shape
{
	int length;
	int breadth;
	
	@Override
	public double perimeter()
	{
		return 2*(length*breadth);
	}
	public double area()
	{
		return length*breadth;
	}
}
public class ShapeTest {

	public static void main(String[] args) {
		
		Circle c=new Circle();
		c.radius=10;
		
		Shape s=c;
		System.out.println("Area of Circle: "+s.area());
		System.out.println("Perimeter of Circle: "+s.perimeter());
		
		
		
		System.out.println("-------------------------");
		Rectangle r=new Rectangle();
		r.length=10;
		r.breadth=5;
		
		//Shape s1=r;
		
		System.out.println("Area of Rectangle: "+r.area());
		System.out.println("Perimeter of Rectangle: "+r.perimeter());
	}
}
