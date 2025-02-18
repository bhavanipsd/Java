package basics;
import java.util.Scanner;
public class Fibbo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number : ");
		
//		int a=0,b=1,c=0;
//		for(int i=0;i<=10;i++)
//		{
//			System.out.print(a+" ");
//			c=a+b;
//			a=b;
//			b=c;
//		}
		int a=s.nextInt(),b=a++,c=0;
		System.out.print(a+" "+b+" ");
		for(int i=1;i<=10;i++)
			{
				
				c=a+b;
				a=b;
				b=c;
				System.out.print(c+" ");
			}
	}

}
