package basicpatterns;

public class sp11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=3,col=3,val=65;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=col;c++,val++)
			{
				System.out.print((char)val+" ");
				
			}
			System.out.println();
		}
	}

}
