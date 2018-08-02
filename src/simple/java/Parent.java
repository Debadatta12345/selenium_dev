package simple.java;

public class Parent {
	
	public static void main(String[] args) {
		Test t=new Child();
		t.marry();
		
	}
	
	
}

class Test {
	

	public void property() {
		System.out.println("cash"+"land");
	}

	public void marry() {
		System.out.println("sita"+"gita"+"rita");
	}
}
	class Child extends Test {
		public void marry() {
			System.out.println("rani");
		}
	}

		
