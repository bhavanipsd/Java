package arrrays;
import java.util.Scanner;

class m1
{
	void m1(int a[],int o,Scanner s)
	{
		System.out.println("enter array");
	for(int x=0;x<a.length;x++)
	{
		a[x]=s.nextInt();
	}
	for(int x:a)
	System.out.print(x+" ");
	System.out.println("enter any number ");
	int num=s.nextInt();
	for(int x:a)
	{
		
		if(num==x)
			o=1;
	}
	if(o==1)
		System.out.println("given number is there");
}

	void m2()
	{
		int a[]=new int[] {1,2,5,4,9,8,6,3,7};
		int num=4;
		for(int x=0;x<a.length;x++)
		{
			if(a[x]==num)
				System.out.println(x+" is the index of the num");
		}
	}
}

public class problem_1 {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		
		int[]a=new int[5];
		int o=0;
		
		m1 obj1=new m1();
//		obj1.m1(a, o, s);
		
		obj1.m2();
	}

}
