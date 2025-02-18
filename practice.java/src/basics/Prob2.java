package basics;
import java.util.Scanner;
public class Prob2 {

	public static void main(String[] args) {
		// count num of  factors and super number
		Scanner s=new Scanner(System.in);
		System.out.println("enter any numer: ");
		int num=s.nextInt(),count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
				System.out.println(i);
				
			}
				
		}
		System.out.println(count+" this is count");
		
	}

}
