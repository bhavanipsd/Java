package arrrays;

class e
{
	int a[]=new int[] {1,4,5,5,8,32,45};
	int s=0;
	
	void even()
	{
		
		for(int x=0;x<a.length;x++)
		{
			if(a[x]%2==0)
			{
			System.out.println(a[x]+" its even element");
			System.out.println(x+" is the index of the element");
			}
		}
	}
	
	void sum()
	{
		for(int x=0;x<a.length;x++)
		{
	
			s=a[x]+s;
		}
		System.out.println(" sum = "+ s);
	}
	
	void sum_ind()
	{
		//even indexed
		s=0;
		for(int x=0;x<a.length;x++)
		{
			if(x%2==0)
			{
				s=a[x]+s;
				System.out.print(a[x]+" ");
			}
		}
		System.out.println(" sum of even indexed = "+ s);
	}
}

public class even_ele {

	public static void main(String[] args) {
		e obj1=new e();
		
		obj1.even();
		obj1.sum();
		obj1.sum_ind();
		}
		
	}
