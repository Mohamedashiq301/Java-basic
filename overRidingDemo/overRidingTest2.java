package overRidingDemo;

class TV
{
	public void switchOn()
	{
		System.out.println("Tv is Switched On");
	}
	public void changeChannel()
	{
		System.out.println("Tv Channel is changed");
	}
}
class SmartTV extends TV
{
	public void switchOn()
	{
		System.out.println("SmartTv is Switched On");
	}
	public void changeChannel()
	{
		System.out.println("SmartTv Channel is changed");
	}
	public void browsing()
	{
		System.out.println("SmartTv is browsing");
	}
}
public class overRidingTest2 {

	public static void main(String[] args) {
		//Object of same class refering same method
		TV t=new TV();
		t.switchOn();
		t.changeChannel();
		
		System.out.println("####################");
		//Object of same class refering same object
		SmartTV st=new SmartTV();
		st.switchOn();
		st.changeChannel();
		st.browsing();
		
		System.out.println("#############");
		
		TV t1=new SmartTV();
		t1.switchOn();
		t1.changeChannel();
	}
}
