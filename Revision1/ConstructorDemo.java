package Revision1;

class Cylinder
{
	private int radius;
	private int height;
	
	public Cylinder(int r,int h)
	{
		radius=r;
		height=h;
	}
	public int getRadius()
	{
		return radius;
	}
	public int getHeight()
	{
		return height;
	}
	public void setRadius(int r)
	{
		if(r>=0)
		{
			radius=r;
		}
		else
		{
			radius=0;
		}
	}
	public void setHeight(int h)
	{
		if(h>=0)
		{
			height=h;
		}
		else 
		{
			height=0;
		}
	}
	public double lidarea()
	{
		return Math.PI*radius*radius;
	}
	public double totalsurfaceArea()
	{
		return 2*lidarea()+circumference();
	}
	public double circumference()
	{
		return 2*Math.PI*radius*radius;
	}
	public double volume()
	{
		return 2*lidarea()*height;
	}
	
}
public class ConstructorDemo {

	public static void main(String[] args) {
		Cylinder c=new Cylinder(10,5);
		System.out.println(c.lidarea());
		System.out.println(c.circumference());
		System.out.println(c.getHeight());
	}
}
