package basics;

public class Prob1 {

	public static void main(String[] args) {
		// TODO Auto-generated method
		int num=10,sum=0,odd=0;
		for(int i=1;i<=num;i++)
		{
			
			if(i%2==0)
			{
				
				sum=i+sum;
			}
			else
			{
				odd=i+odd;
				
			}
		}
		System.out.println("this is even = "+sum);
		System.out.println("this is odd = "+odd);
		if(sum>odd)
			System.out.println("even is big");
		else
			System.out.println("odd is big");
	}

}
