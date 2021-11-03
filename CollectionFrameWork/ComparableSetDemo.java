package CollectionFrameWork;

import java.util.TreeSet;

class Point implements Comparable<Object>
{
	int x;
	int y;
	
	public Point(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	 public String toString()
	    {
	        return "x="+x+" y="+y;
	    }
	@Override
	public int compareTo(Object o) {
		 Point p=(Point)o;
	        if(this.x<p.x)
	            return -1;
	        else if(this.x>p.x)
	            return 1;
	        else
	        {
	        if(this.y<p.y) 
	            return -1;
	        else if(this.y>p.y)
	            return 1;
	        else 
	            return 0;
	        }
	}
}
public class ComparableSetDemo {

	public static void main(String[] args) {
		
		TreeSet<Point> ts1=new TreeSet<>();
		
		  ts1.add(new Point(1,1));
	        ts1.add(new Point(5,5));
	        ts1.add(new Point(5,2));
	        
	        System.out.println(ts1);
		
	}
}
