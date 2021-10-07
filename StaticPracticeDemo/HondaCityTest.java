package StaticPracticeDemo;

class HondaCity
{
	static long price=10;
	int a,b;
	
	static double OnRoadPrice(String City)
	{
		switch (City){
		case "Delhi":
			return price+price*0.1;
		
		case "Mumbai":
			return price+price*0.09;
		
		}
		return price;
	}
}
public class HondaCityTest {

	public static void main(String[] args) {
		
		//Here we can access the Static price of an HondaCity car by creating an object also
		HondaCity h1=new HondaCity();
		HondaCity h2=new HondaCity();
		System.out.println(h1.price);
		System.out.println(h2.price);
		//---------------------------------------------------
		System.out.println("-------------------");
		
		System.out.println(HondaCity.OnRoadPrice("Delhi"));
		
		//Here you can know the price of an HondaCity without creating an object
		System.out.println(HondaCity.price);
	}
}
