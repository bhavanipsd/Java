package basics;
import java.util.Scanner;
public class Arms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter any number : ");
		int num=s.nextInt(),count=0,t=num,sum=0;
		for(;num>0;num=num/10) {
			count++;
		}
		num=t;
		for(int i=1;i<=count;i++)
		{
			int rev=num%10;
			int prod=(int)Math.pow(rev, count);
			sum=sum+prod;
			num=num/10;
		}
		if(sum==t)
			System.out.println("armstrong number");
		else
			System.out.println("not a armstrong num");
	}

}
