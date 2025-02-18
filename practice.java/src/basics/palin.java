package basics;
import java.util.Scanner;
public class palin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number : ");
		int num=s.nextInt(),sum=0,rev=0,t=num;
		for(;num>0;)
		{
			rev=0;
			rev=num%10;//121%10 1, 12%10 2
			sum=sum*10+rev;// 0*10+1=1, 1*10+2 12,
			num=num/10;//121/10 12 12/10 1 
		}
		if(sum==t)
			System.out.println("it is a palindrome number");
		else
			System.out.println("not a opakisoidghoiusd");
	}

}
