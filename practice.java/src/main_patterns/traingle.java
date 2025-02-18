package main_patterns;

public class traingle {

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
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
