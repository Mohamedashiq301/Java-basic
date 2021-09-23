package OopsDemo;

class circle1
	{
		public double radius;
		
		public double area()
		{
			return Math.PI*radius*radius;
		}
		
		public double perimeter()
		{
			return 2*Math.PI*radius;
		}
		
		public double circumference()
		{
			return perimeter();
		}
	}
	public class Circle {
		
	public static void main(String[] args) {
		
		circle1 c1=new circle1();
		circle1 c2=new circle1();
		
		c1.radius=7;
		c2.radius=14;
		
		System.out.println("Area: "+c1.area());
		System.out.println("Perimeter: "+c1.perimeter());
		System.out.println("Circumference: "+c1.circumference());
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@");
		
		System.out.println("Area2: "+c2.area());
		System.out.println("Perimeter2: "+c2.perimeter());
		System.out.println("Circumference2: "+c2.circumference());
	}
}
