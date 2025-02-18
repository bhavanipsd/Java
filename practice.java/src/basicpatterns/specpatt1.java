package basicpatterns;

public class specpatt1 {

	public static void main(String[] args) {
		// start with 3x3
		int rows=4,col=6;
		for(int i=1;i<=rows;i++)
		{
			for(int x=1;x<=col;x++)
			{
				if(i==1&&x==6)
					System.out.print("& ");
				else if(i==2&&x==3)
					System.out.print("# ");
				else if(i==3&&x==5)
					System.out.print("$ ");
				else
					System.out.print("@ ");
			}
			System.out.println();
		}
		
	}

}
