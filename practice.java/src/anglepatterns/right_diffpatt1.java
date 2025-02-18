package anglepatterns;

public class right_diffpatt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5,col=5;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=r;c++)
			{	
				if(r==1||c==1||r==rows||r==c)
					System.out.print("# ");
				else
					System.out.print("& ");
			}
			System.out.println();
		}
	}

}
