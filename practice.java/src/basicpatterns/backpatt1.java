package basicpatterns;

public class backpatt1 {

	public static void main(String[] args) {
		// start with 3x3
		int rows=3,col=9;
		for(int i=rows;i>0;i--)
		{
			for(int x=col;x>0;x--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
