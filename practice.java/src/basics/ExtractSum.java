package basics;
import java.util.Scanner;
public class ExtractSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter any number: ");
		int num=s.nextInt(),sum=0;
		for(;num>0;num=num/10)
		{
			int t=num%10;
			sum=t+sum;
		}
		System.out.println(sum);
	}

}
