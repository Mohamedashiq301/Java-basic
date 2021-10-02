package OopsDemo;

class cylinder
{
	public double radius;
	public double height;
	
	public double lidArea()
	{
		return Math.PI*radius*radius;
	}
	public double totalSurfaceArea()
	{
		return 2*lidArea()+Circumference();
	}
	public double Circumference()
	{
		return 2*Math.PI*radius;
	}
	public double Volume()
	{
		return lidArea()*height;
	}
}
public class CylinderTest {

	public static void main(String[] args) {
		
		cylinder c1=new cylinder();
		
		c1.radius=7;
		c1.height=12;
		
		System.out.println("Area:"+c1.lidArea());
		System.out.println("Total Surface Area:"+c1.totalSurfaceArea());
		System.out.println("Volume: "+c1.Volume());
	}
}
