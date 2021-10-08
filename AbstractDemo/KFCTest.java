package AbstractDemo;

abstract class KFC
{
	public KFC()
	{
		System.out.println("KFC Constructor");
	}
	public void makeItems()
	{
		System.out.println("Fried Chicken");
		System.out.println("Chicken Lolipop");
		System.out.println("Starters");
	}
	abstract void Billing();
	abstract void Offer();
}
class MyKFC extends KFC
{
	public MyKFC()
	{
		System.out.println("MyKFC Constructor");
	}
	@Override
	public void Billing()
	{
		System.out.println("Billing Done");
	}
	public void Offer()
	{
		System.out.println("50% Offer for all items");
	}
	public void FestivalOffer()
	{
		System.out.println("Festival offer for Diwali");
	}
}
public class KFCTest {

	public static void main(String[] args) {
		KFC k=new MyKFC();
		System.out.println("----------------------");
		k.makeItems();
		k.Billing();
		k.Offer();
		System.out.println("-----------------------");
		MyKFC mk =new MyKFC();
		mk.FestivalOffer();
	}
}
