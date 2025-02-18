package interview;

public class fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3=0;
		
		for(int x=0;x<=10;x++)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n2);
		}
	}

}
