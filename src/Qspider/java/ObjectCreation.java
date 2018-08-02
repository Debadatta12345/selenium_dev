package Qspider.java;

public class ObjectCreation {

	String empname;

	public static void main(String[] args) {
		Test t = new Test();
		t.empname = "dev";
		System.out.println(t.empname);

		Test t1 = new Test();
		t1.empname = "hitten";
		System.out.println(t1.empname);

	}

}
