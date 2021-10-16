package Revision;

public class NestedForLoopPattern8 {

	public static void main(String[] args) {

		for(int i=1;i<=5;i++)
		{
			for (int j=1;j<=5;j++)
			{
				if(i+j>5)
				{
					System.out.print(j+" ");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int k=1;k<=i-1;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println(" ");
		}
	}
}
