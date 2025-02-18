package basics;
import java.util.Scanner;
public class ExtractionFact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter any number : ");
		int num=s.nextInt(),t=num,fact=1,sum=0;
		for(;num>0;)
		{
			int rem=num%10;
			num=num/10;
			fact=1;
			for(;rem>0;rem--)
			{
				fact=rem*fact;
			}
			sum=fact+sum;
			System.out.println(sum+" is the sum");
		}
		if(sum==num)
		System.out.println("Strong number");
		else
			System.out.println("not a strong number");
	}

}
