package Qspider.java;

public class ReverseNumber {
	public int reverse(int n)
	{
		int res=0;
		while(n>0)
		{
			int r=n%10;
			res=res*10+r;
			n=n/10;
			
		}
		return res;
	}

}

