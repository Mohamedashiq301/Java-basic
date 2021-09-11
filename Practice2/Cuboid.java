package Practice2;

import java.util.Scanner;

public class Cuboid {
public static void main(String[] args) {
	int lenght,height,breath;
	float area,volume;
	
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the valu of lenght, breath and height...");
	lenght=sc.nextInt();
	breath=sc.nextInt();
	height=sc.nextInt();
	
	
	area=2*((lenght*height)+(breath*height)+(lenght*breath));
	volume =lenght*breath*height;
	
	System.out.println("Area of cubiod "+area);
	System.out.println("Volume of cubiod "+volume);
}
}
