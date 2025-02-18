package interview;

public class bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {6,1,9,7,3,4,5};
		//descending
		for(int x=0;x<a.length;x++)//index
		{
			for(int y=0;y<a.length-1;y++)//all elements
			{
				if(a[y]>a[y+1])//x>y ascending
				{
				int temp=a[y];
				a[y]=a[y+1];
				a[y+1]=temp;
				}
			}
			System.out.print(a[x]+" ");
		
	}

}}
