package SingletonDemo;

class CoffeeMachine
{
	private float CoffeeQty;
	private float WaterQty;
	private float MilkQty;
	private float SugarQty;
	
	private static CoffeeMachine My=null;
	
	private CoffeeMachine()
	{
		CoffeeQty=1;
		WaterQty=1;
		MilkQty=1;
		SugarQty=1;
	}
	public void fillwater(float Qty)
	{
		WaterQty=Qty;
	}
	public void fillsugar(float Qty)
	{
		SugarQty=Qty;
	}
	public float getCoffee()
	{
		return 0.015f;
	}
	
	static CoffeeMachine getInstance()
	{
		if (My==null)
			My=new CoffeeMachine();
		return My;
	}
}
public class CoffeeMachineDemo {

	public static void main(String[] args) {
		CoffeeMachine c1=CoffeeMachine.getInstance();
		CoffeeMachine c2=CoffeeMachine.getInstance();
		CoffeeMachine c3=CoffeeMachine.getInstance();
		
		System.out.println(c1+"         "+c2+"          "+c3);
		if (c1==c2 && c1==c3)
			System.out.println("Same");
	}
}
