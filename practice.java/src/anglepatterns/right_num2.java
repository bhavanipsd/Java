package anglepatterns;

public class right_num2 {

	public static void main(String[] args) {
//		 reverse iterate
//		int rows=5,col=5;
//		for(int r=1;r<=rows;r++)
//		{
//			int num=r;
//			for(int c=1;c<=r;c++)
//			{
//				System.out.print(num--+" ");
//			}
//			System.out.println();
//		}
		int rows=5,col=5;
		for(int r=1;r<=rows;r++)
		{
			int n=r;
			for(int c=1;c<=r;c++)
			{
				System.out.print(n++ +" ");
			}
			System.out.println();
		}
		
	}

}
