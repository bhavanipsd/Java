package arrrays;
import java.util.Random;
class max{
	/////////////////////////////
	void big(int []a,int max)
	{
		for(int x=0;x<a.length;x++)
		{
			if(max<a[x])
				max=a[x];
				
		}
		System.out.println(max);
	}
	///////////////////////////
	void samll(int[]a,int min)
	{
		for(int x=0;x<a.length;x++)
		{
			if(min>a[x])
				min=a[x];
		}
		System.out.println(min);
	}
	/////////////////////////////
	void ran(int b[],Random r){
		
		for(int x=0;x<b.length;x++)
		{
			 b[x]=r.nextInt(1,100);
		}
		
		System.out.println(" this is for each loop");
		
		for(int x: b)
			System.out.print(x+" ");
		
		System.out.println();
		
		System.out.println(" this is normal loop");
		
		for(int x=0;x<b.length;x++)
			System.out.print(b[x]+" ");
	
	}
}
////////////////////////////////////////////////////////
public class max_value {

	public static void main(String[] args) {
		Random r=new Random();
		int []a=new int[] {5,9,8,7,5,6,4,1,10};
		int b[]=new int[5];
		int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
		
		max obj=new max();
		
		obj.big(a, max);
		obj.samll(a, min);
		obj.ran(b, r);
		}

}
