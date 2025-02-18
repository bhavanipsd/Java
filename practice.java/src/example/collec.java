package example;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Vector;


public class collec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l=new ArrayList();
		l.add(10);
		l.add("hello");
		l.add('x');
		l.add(true);
		System.out.println(l.get(1));
		System.out.println(l);
		Queue q=new PriorityQueue();
		q.add(10);
		q.add(12);
		q.add(5);
		System.out.println(q);
		List v=new Vector();
		v.add(10);
		v.add("hey");
		System.out.println(v);
		System.out.println("------------------------");
		for(int x=0;x<l.size();x++)
		{
			System.out.println(l.get(x));
		}
//		     
		
		
		

	}


	


}
