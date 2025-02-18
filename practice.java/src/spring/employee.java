package spring;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class employee {

	public static void main(String[] args) {
	student student=new student();
	student.setName("bhavani");
	student.setRoll(45);
	System.out.println(student);
	int a[]=new int[] {1,2,3};
	List<Integer> list=new ArrayList<>(Arrays.asList(12,13,14));
	product product=new product(101,"bhavani",a,list);
	System.out.println(product);
	}

}
