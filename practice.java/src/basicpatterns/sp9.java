package basicpatterns;

public class sp9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=3,col=6,val=65;
		for(int r=1;r<=rows;r++)
		{
			val=65;
			for(int c=1;c<=col;c++,val++)
			{
				System.out.print((char)val+" ");
				
			}
			System.out.println();
		}
	}

}
