package interview;

public class secmin {

	public static void main(String[] args) {
		int a[]=new int[] {2,6,4,23,45};
		int small=Integer.MAX_VALUE;
		int ss=0;
		for(int x=0;x<a.length;x++)
		{
			if(a[x]>small)
			{
				ss=small;
				small=a[x];
			}
			else if(a[x]<ss&&a[x]!=small)
				ss=a[x];
		}
		System.out.println("second min num = "+ss);
	
	}

}
