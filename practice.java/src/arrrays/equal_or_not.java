package arrrays;

public class equal_or_not {

	public static void main(String[] args) {
		int []a = new int[] {1,5,3,4,6,7,9};
		int []b = new int[] {1,5,3,4,6,7,9};
		int count=0;
		for(int x=0;x<a.length;x++)
		{
			if(a.length==b.length)
			{
				if(a[x]==b[x])
				
					count++;
			
		}			
		}
		if(count==a.length)
		{
			System.out.println("equal arrays");
			for(int x: a)
				System.out.print(x+" ");
			System.out.println();
			for(int y: b)
				System.out.print(y+" ");
				;
		}
			else	
			System.out.println("not equal ");
	}

}
