package InheritenceDemo1;

class Rectangle
{
	int length;
	int breadth;
	
	public Rectangle()
	{
		length=breadth=1;
	}
	public Rectangle(int l,int b)
	{
		length=l;
		breadth=b;
	}
}
class Cuboid extends Rectangle
{
	int height;
	
	public Cuboid() 
	{
		height = 1;
	}
	public Cuboid(int h)
	{
		height=h;
	}
	public Cuboid (int l,int b,int h)
	{
		super(l,b);
		height=h;
	}
	int volume()
	{
		return length*breadth*height;
	}
}
public class InheritenceOfRectangle_Cuboid {

	public static void main(String[] args) {
		//Volume without Parameter
		Cuboid c=new Cuboid();
		System.out.println(c.volume());
		
		//Volume with Parameter of height
		Cuboid c1=new Cuboid(10);
		System.out.println(c1.volume());
		
		//vloume with parameter of length,breadth,height
		Cuboid c2=new Cuboid(5,3,10);
		System.out.println(c2.volume());
	}
}
