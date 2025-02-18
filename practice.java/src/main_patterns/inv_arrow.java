package main_patterns;

public class inv_arrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=rows;c>r;c--)
			{
				System.out.print("  ");
			}	
			for(int x=1;x<=r;x++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<r;c++)
			{
				System.out.print("  ");
			}
			for(int x=rows;x>=r;x--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
