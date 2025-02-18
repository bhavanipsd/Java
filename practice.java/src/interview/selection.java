package interview;

public class selection {

	public static void main(String[] args) {
		int a[]=new int[] {6,1,9,7,3,4,5};
		for(int x=0;x<a.length-1;x++)
		{
			int s=x;
			for(int y=x+1;y<a.length;y++)
			{
				if(a[s]>a[y])
				{
					s=y;
				}
				
			}
			int t=a[s];
			a[s]=a[x];
			a[x]=t;
			System.out.println(a[x]);
		}

	} 

}
