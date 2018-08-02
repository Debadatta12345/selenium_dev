package Qspider.java;

public class Employe {
	String ename;
	int eid;
	Employe(String ename,int eid)
	{
		this.ename=ename;
		this.eid=eid;
		System.out.println(ename);
		System.out.println(eid);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employe e=new Employe("dev",122);
		Employe e1=new Employe("raj",155);
		

	}

}
