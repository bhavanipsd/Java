package arrrays;


public class sorting {

	public static void main(String[] args) {
		int []a = new int[] {9,6,4,2,3,5,1,7,8};
		
		
		for(int x=0;x<a.length;x++)
		{
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]>a[y])
				{
					int t=a[x];
					a[x]=a[y];
					a[y]=t;
				}
			}
			System.out.print(a[x]+" ");
		}
			System.out.println();
		for(int x=0;x<a.length;x++)
		{
			for(int y=x+1;y<a.length;y++)
			{
				if(a[x]<a[y])
				{
					int t=a[x];
					a[x]=a[y];
					a[y]=t;
				}
			}
			System.out.print(a[x]+" ");
		}
//		dec obj=new dec();
//		obj.descen(a);
//		
	}

}
