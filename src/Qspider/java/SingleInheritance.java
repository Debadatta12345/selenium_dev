package Qspider.java;

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cusion c = new Cusion();
		System.out.println(c.i);
		System.out.println(c.k);
		Child c1 = new Child();
		System.out.println(c1.i);
		System.out.println(c1.j);
		Parent p = new Parent();
		System.out.println(p.i);

	}

}

class Parent {
	int i = 10;

}

class Child extends Parent {
	int j = 20;
}

class Cusion extends Parent {
	int k = 30;
}