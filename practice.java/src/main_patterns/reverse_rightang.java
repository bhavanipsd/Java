package main_patterns;

public class reverse_rightang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// without num normal pattern
		
		int rows=5,num=1;
		for(int r=rows;r>0;r--)
		{
			
			for(int c=1;c<=r;c++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		// alphabets
		
//		int rows=5,val=65;
//		for(int r=rows;r>0;r--,val++)
//		{
//			
//			for(int c=1;c<=r;c++)
//			{
//				System.out.print((char)val +" ");
//			}
//			System.out.println();
//		}
		// numbers from 1to 5
		
//		int rows=5,num=5;
//		for(int r=rows;r>0;r--)
//		{
//			num=rows;
//			for(int c=1;c<=r;c++,num--)
//			{
//				System.out.print(num +" ");
//			}
//			System.out.println();
//		}
	}

}
