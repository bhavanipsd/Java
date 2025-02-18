package basics;

public class incre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=20,c=30,d,e,f;
		d=a++;
		e=b++;
		System.out.println(a+" "+b+" "+d+" "+e+" ");
		d=a++;
		e=b++;
		System.out.println(" this is second "+a+" "+b+" "+d+" "+e+" ");
		f=++c;
		System.out.println(f);
		System.out.println(c);
	}

}
