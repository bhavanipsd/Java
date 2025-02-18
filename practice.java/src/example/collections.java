package example;
import java.util.*;
public class collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<student> al=new ArrayList<student>();
		student s1=new student(10);
		student s2=new student(11);
		student s3=new student(12);
		student s4=new student(13);
//		Comparator.sort(al, new SortByRoll());
		
//		al.add(s1);
//		al.add(s2);
//		al.add(s3);
//		al.add(s4);
//		System.out.println(al);
//		 Set<student> set=new LinkedHashSet<student>();
//		 set.addAll(al);
//		 System.out.println("hashset" + set);
//		 Set<student> tree=new TreeSet<student>();
//		 tree.addAll(al);
//		 System.out.println("tree set");
//		 System.out.println(tree);

	}

}
class student
{
	int roll;
	//String name;
	/*public student(int roll) {
		super();
		this.roll = roll;
		//this.name = name;
	}*/
	public student(int roll) {
		super();
		this.roll = roll;
	}
	/*@Override
	public String toString() {
		
		return "student [roll=" + roll + ", name=" + name + "]";
	}*/
	@Override
	public String toString() {
		return "student [roll=" + roll + "]";
	}
	class SortByRoll implements Comparator<student>
	{

		@Override
		public int compare(student o1, student o2) {
			// TODO Auto-generated method stub
			return Integer.compare(o1.roll, o2.roll);
		}
	}
}
