package Revision1;

class Cylinder1
{
	int radius1;
	int height1;
	public Cylinder1(int r1,int h1)
	{
		radius1=r1;
		height1=h1;
	}
	public double liDArea()
	{
		return Math.PI*radius1*radius1;
	}
	public double circumference()
	{
		return 2*Math.PI*radius1;
	}
	public double totalSurafceArea()
	{
		return 2*circumference()*height1;
	}
}
public class CylinderTest {

	public static void main(String[] args) {
		
		Cylinder1 c1=new Cylinder1(10,5);
		System.out.println(c1.liDArea());
		System.out.println(c1.circumference());
		System.out.println(c1.totalSurafceArea());
				
	}
}
