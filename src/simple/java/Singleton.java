package simple.java;

public class Singleton 
{
	public static int add(int a, int b) 
	{
		int c = a + b;
		return c;

	}

	public static void main(String[] args) 
	{
		//int d = add(10, 20);
		System.out.println(add(10, 20));
	}

}
