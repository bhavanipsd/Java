package basicpatterns;

public class sp4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=3,col=3;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=col;c++)
			{
				if(r%2==0)
					System.out.print("# ");
				else
					System.out.print("$ ");
			}
			System.out.println();
		}
	}

}
