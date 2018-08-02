package Child;

import simple.java.Parent;

public class Test{

	public static void m1() {
		System.out.println("child");
	}
}

class Test1 extends Test {
	public static void main(String[] args) {
		Parent p = new Parent();
		//p.m1();

	}
}

