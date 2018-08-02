package dev;

import java.util.*;

public class ProrityQueueDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue q = new PriorityQueue();
		q.offer("A");
		q.offer("Z");
		q.offer("K");
		q.offer("L");
		q.offer("M");
		System.out.println(q);

	}

}
class MyComparator implements Comparator
{

	@Override
	public int compare(Object arg0, Object arg1) {
		// TODO Auto-generated method stub
		String s1=(String)arg0;
		String s2=arg1.toString();
		return s2.compareTo(s2);
	}
	
}