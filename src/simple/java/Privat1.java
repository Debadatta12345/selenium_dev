package simple.java;

public class Privat1
{
	public static void main(String[]args)
	{
		Privat1 p=new Privat1();
		p.additionalof();
		
	}
	private void additionalof() 
	{
		System.out.println("dev");

	}
	}
class Demo extends Privat1
{
	void m1()
	{
	System.out.println("raj");
	}
}
