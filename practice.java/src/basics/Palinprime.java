package basics;
import java.util.Scanner;
public class Palinprime {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num=s.nextInt(),t=num,rev=0,sum=0,count=0;
		for(int i=1;i<=num;num=num/10)
		{
			
			rev=num%10;
			sum=sum*10+rev;
			
		}
		for(int x=1;x<=t;x++)
		{
			if(t%x==0)
			{
			count++;
		}
			}
			if(count==2&&sum==t)
				System.out.println("palinprime");
			else
				System.out.println("not a palinprime");
	}

}
