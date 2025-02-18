package main_patterns;

public class one_ascen_one_dec_hollow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		for(int r=1;r<rows;r++)
		{
			for(int c=rows;c>=r;c--)
			{
				if(r==1||c==r||c==rows)
				System.out.print("* ");
				else
				System.out.print("  ");
			}
			System.out.println();
		}
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=r;c++)			
			{
				if(c==1||r==rows||c==r)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
