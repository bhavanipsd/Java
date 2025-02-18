package anglepatterns;

public class hollowdiagp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5,col=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=col;c++)
			{
				if(r==1||r==rows||c==1||c==col||r==c||r+c==rows+1)
					System.out.print("*");
				else
					System.out.print(" ");
				
				
			}
			System.out.println();
		}
	}

}
