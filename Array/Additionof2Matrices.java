package Array;

//Addition of 2 matrices
public class Additionof2Matrices {

	public static void main(String[] args) {
		int A[][] = { { 3, 5, 7 }, { 1, 2, 3 }, { 2, 4, 6 } };
		int B[][] = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
		int C[][] = new int[3][3];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				C[i][j] = A[i][j] * B[i][j];

			}
		}
		for (int x[] : C) {
			for (int y : x) {
				System.out.print(y + " ");
			}
			System.out.println(" ");
		}
	}
}
