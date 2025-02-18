package main_patterns;

public class hollow_right_arrow {

	public static void main(String[] args) {
		int rows=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=r;c++)
			{
				if(c==1||r==c)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=rows-r;c++)
			{
				if(c==1||c==rows-r)
				System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}
