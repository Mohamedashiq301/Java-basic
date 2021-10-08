package AbstractDemo;

abstract class Hospital
{
	abstract void Emergency();
	abstract void Appointment();
	abstract void Admit();
	abstract void Billing();
}

class MyHospital extends Hospital
{
	public MyHospital()
	{
		System.out.println("My Hospital Constructor");
	}
	@Override
	public void Emergency()
	{
		System.out.println("Emergency ward");
	}
	public void Appointment()
	{
		System.out.println("Appointment Done");
	}
	public void Admit()
	{
		System.out.println("Patient admitted");
	}
	public void Billing()
	{
		System.out.println("Bill done");
	}
}
public class HospitalTest {

	public static void main(String[] args) {
		Hospital h=new MyHospital();
		h.Emergency();
		h.Appointment();
		h.Admit();
		h.Billing();
	}
}
