package practice;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		System.out.println(10/2);
		String s=null;
		System.out.println(s.length());
		System.out.println(10/0);
		
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException");
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}

}
}
