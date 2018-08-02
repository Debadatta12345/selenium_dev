package dev;

public class CloneDemo implements Cloneable{
	int i=10;
	int j=20;

	public static void main(String[] args) throws CloneNotSupportedException   {
		// TODO Auto-generated method stub
		CloneDemo t1=new CloneDemo();
		CloneDemo t2=(CloneDemo)t1.clone();
		t2.i=888;
		t2.i=999;
		System.out.println(t1.i+         +t1.j );
	}

}
