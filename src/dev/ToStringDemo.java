package dev;

import java.util.ArrayList;

public class ToStringDemo {
	public String toString()
	{
	return "ToStringDemo";	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("durga");
		System.out.println(s);
		Integer i=new Integer(100);
		System.out.println(i);
		ArrayList l=new ArrayList();
		l.add("a");
		l.add("b");
		System.out.println(l);
		ToStringDemo t=new ToStringDemo();
		System.out.println(t);

	}

}
