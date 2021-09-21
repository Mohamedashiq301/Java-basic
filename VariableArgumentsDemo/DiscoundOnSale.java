package VariableArgumentsDemo;

public class DiscoundOnSale {

	static double discount(double ...p)
	{
		double s=0;
		for (int i=0;i<p.length;i++)
			s=s+p[i];
		if (s>500)return s*0.10;
		else if (s<500&&s>1000)return s*0.15;
		else return s*0.20;
	}
	
	
	public static void main(String[] args) {
		System.out.println(discount(200,350,450,100));
	}
}
