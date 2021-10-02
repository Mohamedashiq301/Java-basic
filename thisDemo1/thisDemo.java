package thisDemo1;

class Rectangle
{
	int length;
	int breadth;
	
	public Rectangle(int l,int b)
	{
		this.length=l;
		this.breadth=b;
	}
	void display()
	{
		System.out.println("Lenght: "+this.length);
		System.out.println("Breadth: "+this.breadth);
	}
}
public class thisDemo {

	public static void main(String[] args) {
		Rectangle r=new Rectangle(10,5);
		r.display();
	}
}
