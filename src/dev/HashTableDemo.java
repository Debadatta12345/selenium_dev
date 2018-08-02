package dev;

import java.util.*;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable t=new Hashtable(25);
		
		t.put(new Temp(5),"A");
		t.put(new Temp(2),"B");
		t.put(new Temp(6),"C");
		t.put(new Temp(15),"D");
		t.put(new Temp(23), "E");
		t.put(new Temp(16), "F");
		System.out.println(t);
		
		
	}

}
class Temp
{
	int i;
	Temp(int i)
	{
		this.i=i;
		
	}
	public int hashcode()
	{
		return i % 9;
		
	}
	public String toString()
	{
		return i+" ";
	}
}