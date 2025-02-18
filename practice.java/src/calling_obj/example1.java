package calling_obj;
import java.util.Scanner;

class a{
	int a,b;
	
	void add()
	{
		int sum = a+b;
		System.out.println(" this is the sum  : "+ sum);
	}
	void sub()
	{
		int sub=a-b;
		System.out.println(" sub : "+ sub);
	}
}


public class example1 {

	public static void main(String[] args)
	{
		int c,d;
		Scanner s=new Scanner(System.in);
		System.out.println("enter variables: ");
		
		c=s.nextInt();
		d=s.nextInt();
		System.out.println(c+d + " this is c and d");
		a p1=new a();
		p1.a=s.nextInt();
		p1.b=s.nextInt();
		
		p1.add();
		p1.sub();
	}

}
