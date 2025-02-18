package anglepatterns;

public class hollowp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=4,col=4;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=col;c++)
			{
				if(r==1||r==rows||c==1||c==col )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
