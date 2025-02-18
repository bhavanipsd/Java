package calling_obj;
import java.util.Scanner;

class student
{
	int d;
	void m1(String a,int b ,int c)
	{
		System.out.println(a+" " +b+ " "+ c);
	}
	
	void m2()
	{
		System.out.println(d);
	}
}

public class using_string {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println(" enter any sentence ");
		String a=s.nextLine();
		int c=s.nextInt();
//		int a=10;
		student p1=new student();
		p1.m1(a,10,c);
		p1.d=40;
		p1.m2();
	}

}
