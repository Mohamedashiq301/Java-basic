package ConstructorDemo;

class Cylinder
{
	private double radius;
	private double height;
	// Parameterized constructor
	public Cylinder(double r,double h)
	{
		radius=r;
		height=h;
	}
	
	// Getter and setter method
	//Get method
	public double getRadius()
	{
		return radius;
	}
	public double getHeight()
	{
		return height;
	}
	
	//Set method
	public void setRadius(double r)
	{
		if (r>=0)
		{
			radius=r;
		}
		else 
		{
			radius=0;
		}
	}
	public void setHeight(double h)
	{
		if (h>=0)
		{
			height=h;
		}
		else 
		{
			height=0;
		}
	}
	public double lidArea()
	{
		return Math.PI*radius*radius;
	}
	public double totalArea()
	{
		return 2*lidArea()+Circumference();
	}
	public double Circumference()
	{
		return 2*Math.PI*radius;
	}
	public double drumArea()
	{
		return 2*lidArea()+Circumference()+height;
	}
	public double volume()
	{
		return lidArea()+height;
	}
}
public class CylinderTest {

	public static void main(String[] args) {
		
		Cylinder c=new Cylinder(6,10);
		System.out.println(c.lidArea());
		System.out.println(c.Circumference());
		System.out.println(c.totalArea());
		System.out.println(c.drumArea());
		System.out.println(c.volume());
	}
}
