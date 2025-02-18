package interview;

public class dup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[] {1,2,3,4,23,45,1,2,3};
		int sum=0;
		for(int x=0;x<a.length;x++)
		{
			int count=0;
			for(int y=x;y<a.length;y++)//y=0 unique repeated vastay
			{
				if(a[x]==a[y])
				{
					count++;
				}
			}
			if(count>1)
			{
			System.out.println(a[x]);
			sum=sum+a[x];
		}
			 }
		System.out.println("sum = "+sum);
	}

}
