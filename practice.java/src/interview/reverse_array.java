package interview;
import java.util.*;
public class reverse_array 
{
	public static void main(String [] args)
	{
		
int a[]=new int[3];
int b[]=new int[a.length];
System.out.println("size of the array is "+a.length);
Scanner s=new Scanner(System.in);
System.out.println("enter the array");
for(int x=0;x<a.length;x++)
{
	a[x]=s.nextInt();
}
for(int t:a)
	System.out.print(t+" ");
System.out.println();
System.out.println("this is b array");
for(int i=a.length-1;i>=0;i--)
{
	b[i]=a[i];
	System.out.print(b[i]+" ");
}
System.out.println();
//sum of even indexed
for(int x=0;x<a.length;x++)
{
	if(x%2==0)
		System.out.println(a[x]+" even");
	else
		System.out.println(a[x]+" odd indexed");
}
	}
	
	}
