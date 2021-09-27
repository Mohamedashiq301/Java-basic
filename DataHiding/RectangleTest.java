package DataHiding;

class Rectangle
{
	private int length;
	private int breadth;
	
	public int getLength()
	{
		return length;
	}
	public void setLength(int l)
	{
		length=l;
	}
	public int setBreadth()
	{
		return breadth;
	}
	public void setBreadth(int b)
	{
		breadth=b;
	}
	public int Area()
	{
		return length*breadth;
	}
	public int perimeter()
	{
		return 2*length*breadth;
	}
	public boolean isSquare()
	{
		if (length==breadth)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}
public class RectangleTest {

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		
		r.setLength(10);
		r.setBreadth(5);
		
		System.out.println("Area:"+r.Area());
		System.out.println("Perimeter:"+r.perimeter());
		System.out.println("Is it square: "+r.isSquare());
	}
}
