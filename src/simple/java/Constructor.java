package simple.java;

public class Constructor {
	public static void main(String[] args)
	{
		Constructor c = new Constructor();
		Constructor c1 = new Constructor(10);
		Constructor c2 = new Constructor(10.5);
	}


	Constructor() {

		System.out.println("no-arg constructor");

	}

	Constructor(int i) {
		System.out.println("int-arg constructor");
	}

	Constructor(double d) {
		System.out.println("double-arg constructor");
	}

	
	
}
