package nestedinner;

class outer {
	int x = 10;

	class inner {
		int y = 20;

		void innerdisplay() {
			System.out.println(x);
			System.out.println(y);
		}
	}

	void outerdisplay() {
		inner i = new inner();
		i.innerdisplay();
		System.out.println(i.y);
	}
}

public class NestedInnedTest {

	public static void main(String[] args) {
		outer o = new outer();
		o.outerdisplay();
		System.out.println(o.x);
	}
}
