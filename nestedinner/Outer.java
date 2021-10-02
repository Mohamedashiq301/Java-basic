package nestedinner;

public class Outer {
	int x=10;
	class Inner {
		int y=20;
		public void innerDisplay{
			System.out.println(x+" "+y);
		}
	}
	public void outerDisplay()
	{
		Inner i =new Inner();
		i. outerDisplay();
	}
}

	pubilic class Nestedinner {
		public static void main(String[] args) {
			Outer o =new Outer();
			o. innerDisplay();
			
		}
		
	}