package main_patterns;

public class right_arrow1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int r=1;r<=rows;r++)
		{
			for(int c=r+1;c<=rows;c++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
