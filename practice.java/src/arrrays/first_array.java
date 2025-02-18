package arrrays;
import java.util.*;


class arr{
	int ar[]= {1,2,3,5,6,4,5};
	
	void m1()
	{
		System.out.println(ar.length);
	}
	void m2()
	{
		for(int x=0;x<=ar.length-1;x++)
		{
			//elements or values
			System.out.print(ar[x]+" ");
		}
	}
	
	void m3()
	{
		System.out.println();
		for(int x=0;x<ar.length;x++)
		{
			//index numbers 
			System.out.print(x+" ");
		}
	}
	
	void reverse()
	{
		System.out.println();
		for(int x=ar.length-1;x>=0;x--)
		{
			System.out.print(x+" ");
	
		}
		System.out.print("reverse index values ");
		System.out.println();
		for(int x=ar.length-1;x>=0;x--)
		{
			System.out.print(ar[x]+" ");
	
		}
		System.out.print("reverse values ");
	}
}
public class first_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[]{1,2,3,4,5,6};
		System.out.println(a.length);
		
		arr obj1=new arr();
		obj1.m1();
		obj1.m2();
		obj1.m3();
		obj1.reverse();
	}

}
