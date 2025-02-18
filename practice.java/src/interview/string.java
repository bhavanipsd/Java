package interview;
import java.util.*;
public class string {

	public static void main(String[] args) {
		String s1="hi",s2="hi";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		s1+="all";
		System.out.println(s1.hashCode());
		StringBuffer s3=new StringBuffer("hello");
		StringBuffer s4=new StringBuffer("hello");
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s1.length()+" "+s1);
		System.out.println(s1.toUpperCase());
	
	}

}
