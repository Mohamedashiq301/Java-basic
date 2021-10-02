package Loops;

public class Nestedloop {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for (int j=0;j<=5;j++)
			{
				System.out.print("("+i+","+j+") " );
			}
			System.out.println("");
		}
		
		for(int k=1;k<=5;k++)
		{
			for (int l=1;l<=k;l++)
			{
				System.out.print(l+" ");
			}
			System.out.println("----");
		}
	}
}
