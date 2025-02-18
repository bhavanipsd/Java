package interview;
import java.util.*;
public class arrays {
	public static void main(String[] args)
	{
 Scanner s=new Scanner(System.in);
 System.out.println("enter the size of array");
 int b=s.nextInt();
 int a[]=new int[b];
 System.out.println("enter the array");
 for(int x=0;x<b;x++)
 {
	 a[x]=s.nextInt();
 }
 for(int f:a)
	 System.out.print(f+" ");
}
}
