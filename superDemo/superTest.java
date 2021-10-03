package superDemo;

class Rectangle
{
	int length;
	int breadth;
	int x=10;
	
	public Rectangle(int l,int b)
	{
		this.length=l;
		this.breadth=b;
	}
}
class Cuboid extends Rectangle
{
	int height;
	int x=20;
	public Cuboid(int l, int b,int h) {
		super(l, b);
		height=h;
	}
	void display()
	{
		System.out.println("x of Cuboid: "+super.x);
		System.out.println("x of Rectangle: "+x);
		System.out.println("Volume: "+volume());
	}
	public int volume()
	{
		return length*breadth*height;
	}
	
}
public class superTest {

	public static void main(String[] args) {
		Cuboid c=new Cuboid(5,3,10);
		c.display();
		c.volume();
	}
}
