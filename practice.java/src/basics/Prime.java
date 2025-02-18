package basics;
import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter any range for loop : ");
		int range=s.nextInt(),count=0,start=0;
		for(int i=1;i<=range;i++)
		{
			count=0;
			for(int n=1;n<=i;n++)
			{
				if(i%n==0)
					count++;
			}
			if(count==2)
			{
				start++;
				System.out.println(i+ " it is a prime number");
				
		}
			
		}
		System.out.println("total number of primes in the range "+range+" = "+start	);
	}

}
