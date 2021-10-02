package Practice2;
class Outer{
	int x=10;
	static int y=20;
	static class My{
		public void show () {
			System.out.println(y);
		}
	}
	
}
public class localinner {
	public static void main(String[] args) {
	
		Outer.My a=new Outer.My();
		a.show();
	
		
	}

}
