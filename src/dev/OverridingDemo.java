package dev;

public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Child c=new Child();
		//c.marry();
		//c.property();
		Parent c1=new Parent();
		c1.marry();
		
	}

}
class Parent
{
	public void property()
	{
		System.out.println("cash+land+car");
	}
	public void marry()
	{
	System.out.println("sita+gita+rita"); 		
	}
}
class Child extends Parent
{
	public void marry()
	{
		System.out.println("some one special");
	}
}