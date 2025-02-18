package basics;
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number: ");
		int num=s.nextInt(),prod=1;
		for(;num>0;num--)
		{
			prod=num*prod;
		}
		
		System.out.println(prod);
		
	}

}
