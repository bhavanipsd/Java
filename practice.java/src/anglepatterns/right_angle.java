package anglepatterns;

public class right_angle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows=5,col=5,val=65,num=1;
		for(int r=1;r<=rows;r++,val++)  //for alphabet increasing val in rows
		{
			for(int c=1;c<=r;c++)
			{
				
//					System.out.print("* ");  * pattern
				
				//System.out.print(r+" "); // number pattern
				
				// System.out.print((char)val+" ");
				
				System.out.print(num++ +" ");
				
			}
			System.out.println();
		}
	}

}
