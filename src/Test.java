
public class Test {
	public static void main(String[]args)
	{
		String s1="mom";
		String res="";
		for(int i=s1.length()-1;i>=0;i--)
		{
				res=res+s1.charAt(i);
		}
		System.out.println(res);
		if(s1.equalsIgnoreCase(res))
		{
			System.out.println("string is palindrom");
		}
		else {
			System.out.println("string is not palindrom ");
		}
}
}