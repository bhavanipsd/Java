package interview;

public class seclargest {

	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,4,23,45};
		int big=Integer.MIN_VALUE;
		int sl=Integer.MIN_VALUE;
		for(int x=0;x<a.length;x++)
		{
			if(a[x]>big)
			{
				sl=big;
				big=a[x];
			}
			else if(a[x]>sl&&a[x]!=big)
				sl=a[x];
		}
		System.out.println("second largest num = "+sl);
	
	}

}
