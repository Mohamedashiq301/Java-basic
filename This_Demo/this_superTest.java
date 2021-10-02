package This_Demo;

class Rectangle
{
	int length;
	int breadth;
	
	public Rectangle(int l,int b)
	{
		this.length=l;
		this.breadth=b;
	}
}
class Cuboid extends Rectangle
{
	int height;
	
	public Cuboid(int l,int b,int h)
	{
		super (l,b);
		height=h;
	}
	public int volume()
	{
		return length*breadth*height;
	}
}
public class this_superTest {

	public static void main(String[] args) {
		Cuboid c=new Cuboid(5,3,10);
		System.out.println(c.volume());
	}
}
