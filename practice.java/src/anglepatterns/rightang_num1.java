package anglepatterns;

public class rightang_num1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5,col=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=r;c++)
			{
				
//				if(c%2==0)
//					System.out.print(0+" ");
//				else
//					System.out.print(1+" "); 
				if(r%2==0)
					System.out.print(0+" ");
				else
					System.out.print(1+" ");
			}
			System.out.println();
	}

	}}
