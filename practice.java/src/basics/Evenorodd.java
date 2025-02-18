package basics;
import java.util.Scanner;
public class Evenorodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner s=new Scanner(System.in);
//		System.out.println("enter any number above 0 : ");
//		int num=s.nextInt();
		int i=1;
//		if(num>=0)
//		{
//			if(num%2==0)
//				System.out.println("even number "+num);
//			else
//				System.out.println("odd num "+num);
//		
//		}
		while(i>=10)
		{
			if(i%2==0)
				System.out.println(i+" even ");
			else
				System.out.println(i+" odd");
			i--;
		}
		for(int o=1;o<=20;o++)
		{
			if(o%2==0)
				System.out.println(o+" even ");
			else
				System.out.println(o+" odd");
		}
	}

}
