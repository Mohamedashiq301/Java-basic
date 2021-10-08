package overRidingDemo;

class Car
{
	public void Start()
	{
		System.out.println("Car is started");
	}
	public void Accelerate()
	{
		System.out.println("Car is Accelerated");
	}
	public void changeGear()
	{
		System.out.println("Gear is changed");
	}
}
class LuxuaryCar extends Car
{
	public void Start()
	{
		System.out.println("Luxuarycar is started");
	}
	public void Accelerate()
	{
		System.out.println("Luxuary Car is accelerated");
	}
	public void changeGear()
	{
		System.out.println("Luxuarycar gear is changed");
	}
	public void openRoof()
	{
		System.out.println("Sun roof os opened");
	}
}
public class overRidingTest3 {

	public static void main(String[] args) {
		Car c=new Car();
		c.Start();
		c.Accelerate();
		c.changeGear();
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$");
		LuxuaryCar lc = new LuxuaryCar();
		
		lc.Start();
		lc.Accelerate();
		lc.changeGear();
		lc.openRoof();
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$");
		Car c1=new LuxuaryCar();
		c1.Start();
		c1.Accelerate();
		c1.changeGear();
	
		//Here the c1 is reference of super and object is subclass method...
		//So the openRoof method is not able called.. LuxuaryCar is inherited form car
		
	}
}
