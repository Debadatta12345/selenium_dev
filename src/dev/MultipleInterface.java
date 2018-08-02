package dev;

public class MultipleInterface {

	public static void main(String[] args) {
		A a1 = new A();
		a1.run();
		B b1 = new B();
		b1.run();
		System.out.println(b1.i);
		C c1 = new C();
		c1.run();
		c1.wish();
		D d1 = new D();
		d1.wish();
		d1.run();
		System.out.println(d1.j);
		E e1 = new E();
		e1.fly();
		System.out.println(e1.j);
		e1.wish();
		e1.run();

	}

}

class A {
	public void run() {
		System.out.println("run method");
	}
}

class B extends A {
	int i = 10;
}

class C extends A {
	public void wish() {
		System.out.println("wish method");
	}

}

class D extends C {
	int j = 20;
}

class E extends D {
	public void fly() {
		System.out.println("fly method");
	}

}
