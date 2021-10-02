package Array;
//Sorting array of String
public class SortingArrayofString {

	public static void main(String[] args) {
		String str[]= {"Java","Python","Pascal","Smalltalk","ada","Basic"};
		java.util.Arrays.sort(str);
		for (String x:str)
		{
			System.out.println(x);
		}
	}
}
