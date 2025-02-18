package basicpatterns;

public class sp7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=3,col=6,val=65;
		for(int r=1;r<=rows;r++,val++)
		{
			for(int c=1;c<=col;c++)
			{
				System.out.print((char)val+" ");
				
			}
			System.out.println();
		}
	}

}
