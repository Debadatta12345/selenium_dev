package dev;

public class ToStringDemo1 {

public String toString()
{
	return name+"..."+rollno;
}

	String name;
	int rollno;
	ToStringDemo1(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToStringDemo1 t=new ToStringDemo1("durga",101);
		ToStringDemo1 t1=new ToStringDemo1("ravi",102);
		System.out.println(t);
		System.out.println(t1);
	}

}
