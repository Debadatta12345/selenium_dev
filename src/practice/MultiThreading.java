package practice;

public class MultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mythread t=new Mythread();
		t.run();
		for(int i=0;i<=10;i++)
		{
			System.out.println("main thread");
		}

	}

}
class Mythread extends Thread
{
	public void run() {
		for(int i=0;i<=10;i++)
		{
			System.out.println("child thread");
		}
	}
}
