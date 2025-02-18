package calling_obj;


class project{
	int a,b;
	String name;
	float f;
	
	void add()
	{
		System.out.println(a+b+" "+ name);
	}
	
	void sub()
	{
		System.out.println(a-b);
	}
}

class marks
{
	int m,s,ss;
	float percentage;
	
	void add()
	{
		System.out.println(m+s+ss+" :total");
	}
}

public class basic_example {

	public static void main(String[] args) {
		// creating classes
		project p=new project();
		marks m1=new marks();
		p. a = 10;
		p.b=12;
		p. name="bhavani";
		
		m1.m=20;
		m1.s=22;
		m1.ss=23;
		//calling methods using object
		
		p.add();
		p.sub();
		
		m1.add();
	}

}
