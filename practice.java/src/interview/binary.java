package interview;

import java.util.Arrays;

public class binary {

	public static void main(String[] args) {
		int a[] =new int[] {1,5,9,3,66,69,45};
		int f=0,l=a.length-1,m=0,s=888;
		Arrays.sort(a);
		for(int t:a)
			System.out.print(t+" ");
		System.out.println();
		while(f<=l)
		{
			m=(f+l)/2;
			if(m<s)
			{
				f=m+1;
			}
			else if(m==s)
			{
				System.out.println("found");
				break;
			}
			else
				l=m-1;
			if(f>l)
				System.out.println("not found");
		}
		
	}

}
