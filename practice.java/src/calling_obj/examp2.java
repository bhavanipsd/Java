package calling_obj;
import java.util.Scanner;

class c
{
	void one(int a)
	{
		System.out.println(a);
	}
}

class b
{
	void m1(int n,String string)
	{
		if(n>0)
			System.out.println(string);
	}
}

public class examp2 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter any interger");
		
		int a=s.nextInt();
		
		b p2=new b();
		p2.m1(10," this is what i");
		
		c p1=new c();
		p1.one(a);
	}

}
