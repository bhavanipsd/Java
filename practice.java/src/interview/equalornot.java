package interview;

public class equalornot {

	public static void main(String[] args) 
	{
		int a[]=new int[] {6,1,9,7,3,4,5};
		int b[]=new int[] {6,1,9,7,3,4,5,0};
		int count=0;
		if(a.length==b.length)
		{
		for(int x=0;x<a.length;x++)
		{
			for(int y=x;y<=x;y++)
			{
				if(a[x]==b[x])
					count++;
			}
			
		}
		}
		if(count==a.length)
			System.out.println("equal");

	    
		else
		{
			System.out.println("not");
}
	}}
