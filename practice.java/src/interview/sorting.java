package interview;

public class sorting {

	public static void main(String[] args) {
		int a[]=new int[] {6,1,9,7,3,4,5};
		//descending
		for(int x=0;x<a.length;x++)//index
		{
			for(int y=x+1;y<a.length;y++)//all elements
			{
				if(a[x]<a[y])//x>y ascending
				{
				int temp=a[y];
				a[y]=a[x];
				a[x]=temp;
				}
			}
			System.out.print(a[x]+" ");
		}
		
	}

}
