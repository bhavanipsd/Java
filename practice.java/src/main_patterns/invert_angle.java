package main_patterns;

public class invert_angle {

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
				if(r==1||r==x||x==rows)
				System.out.print("* "); 
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}

}
