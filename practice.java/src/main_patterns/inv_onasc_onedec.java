package main_patterns;

public class inv_onasc_onedec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		for(int r=1;r<=rows;r++) {
			for(int c=1;c<r;c++)
			{
				System.out.print("  ");
			}
			for(int z=rows;z>=r;z--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int r=1;r<=rows;r++) {
			for(int c=rows;c>r;c--)
			{
				System.out.print("  ");
			}
			for(int z=1;z<=r;z++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
