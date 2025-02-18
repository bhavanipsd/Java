package main_patterns;

public class diamond_hollow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=r;c<rows;c++)
			{
				System.out.print(" ");
			}
			for(int x=1;x<=r;x++)
			{
				if(r==x||x==1)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for(int r=rows-1;r>=1;r--)
		{
			for(int c=r;c<rows;c++)
			{
				System.out.print(" ");
			}
			for(int x=1;x<=r;x++)
			{
				if(x==1||x==r)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
