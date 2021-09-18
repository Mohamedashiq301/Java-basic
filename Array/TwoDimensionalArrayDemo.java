package Array;

//Two dimensional array demo
public class TwoDimensionalArrayDemo {

	public static void main(String[] args) {
		int A[][] = { { 1, 2, 3 }, { 2, 4, 6 }, { 1, 3, 5 } };
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println("################");
		int B[][] = { { 1, 2, 3 }, { 2, 4, 6 }, { 1, 3, 5 } };
		
		for(int x[]:B)
		{
			for (int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println("");
		}
	}
}
