package arrrays;
class another_way
{
	int a[]=new int[] {9,8,7,6,5,4};
	int b[]=new int[a.length];
	
	void rev()
	{
		System.out.println();
		for(int x=0,y=a.length-1;x<a.length;x++,y--)
			b[x]=a[y];
		for(int q: b)
			System.out.print(q+" ");
		
	}
	
}
public class reve_copy {

	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,4,5,6,7};
		int b[]=new int[a.length];
		System.out.println(a.length);

		for(int x=0;x<=a.length-1;x++)
			{
				b[(b.length-1)-x]=a[x];
				
			}
		
		for(int x:a)
			System.out.print(x+" ");
		System.out.println();
		
		for(int d:b)
			System.out.print(d+" ");
		
		another_way ob=new another_way();
		ob.rev();
		
	}

}
