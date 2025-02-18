package arrrays;
import java.util.Scanner;

public class using_scan {

	public static void main(String[] args) {
	int a[]=new int[5];
	Scanner s=new Scanner(System.in);
	System.out.println(" enter any values ");
	for(int x=0;x<a.length;x++)
	{
		a[x]=s.nextInt();
	}
	for(int x=0;x<a.length;x++)
	{
		System.out.print(a[x]);
	}
	}

}
