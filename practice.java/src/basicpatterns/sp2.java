package basicpatterns;

public class sp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=4,col=4;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=col;c++)
			{
				if(r==1 && c==3 || r==3 && c==2)
					System.out.print("$ ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}

}
