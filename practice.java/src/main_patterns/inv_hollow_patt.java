package main_patterns;

public class inv_hollow_patt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<r;c++)
			{
				System.out.print("  ");
			}
			for(int x=rows;x>=r;x--)
			{
				if(r==1||x==r||x==rows)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
				System.out.println();
		}
		for(int r=1;r<=rows;r++)
		{
			for(int c=rows;c>r;c--)
			{
				System.out.print("  ");
			}
			for(int x=1;x<=r;x++)
			{
				if(x==r||r==rows||x==1)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
