package simple.java;

public class Hidding {
	public static void main(String[] args) {
		Hidding h = new Hidding();
		h.m1();
		dev d = new dev();
		d.m1();
		Hidding h1 = new dev();
		h1.m1();
	}

	public void m1() {
		System.out.println("dev");
	}
}

class dev extends Hidding {
	public void m1() {
		System.out.println("raj");
	}
}