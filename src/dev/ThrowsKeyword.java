
package dev;

public class ThrowsKeyword {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		dostuff(); 

	}
	public static void dostuff()throws InterruptedException
	{
	domorestuff();	
	}
	
	public static void domorestuff()throws InterruptedException
	{
		Thread.sleep(1000);
		System.out.println("dev");
	}

}
