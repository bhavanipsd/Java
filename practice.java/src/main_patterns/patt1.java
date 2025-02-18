package main_patterns;

public class patt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5;
		for(int r=rows;r>0;r--)
		{
			
			for(int c=r;c>=1;c--)
			{
				if(r==1||c==1||r==c||r==rows)
					System.out.print("# ");
				else
					System.out.print("& ");
			}
			
			System.out.println();
		}
	}

}
