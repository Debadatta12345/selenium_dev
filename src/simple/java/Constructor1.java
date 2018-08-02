package simple.java;

public class Constructor1 {
	static int count = 0;
	{
		count++;

	}

	public Constructor1() {
		System.out.println("no-arg constructor");
	}

	Constructor1(int i) {
		System.out.println("int-arg constructor");
	}

	Constructor1(double d) {
		System.out.println("double-1arg constructor");
	}

	public static void main(String[] args) {
		Constructor1 c = new Constructor1();
		Constructor1 c1 = new Constructor1(10);
		Constructor1 c2 = new Constructor1(10.5f);
		System.out.println(count);

	}
}
