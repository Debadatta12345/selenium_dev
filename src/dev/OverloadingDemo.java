package dev;

public class OverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingDemo l = new OverloadingDemo();
		l.m1(10);
		l.m1(22.5);
		l.m1();
		l.m1(55.5f);

	}

	public void m1() {
		System.out.println("no arg method");
	}

	public void m1(int i) {
		System.out.println("int arg method");
	}

	public void m1(double d) {
		System.out.println("double arg method");
	}
}
