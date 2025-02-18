package main_patterns;

public class inv_triangle_hollow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		for(int r=rows;r>=1;r--)
		{
			for(int c=r;c<rows;c++)
			{
				System.out.print(" ");
			}
			for(int x=1;x<=r;x++)
			{
				if(x==r||x==1||r==rows)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
