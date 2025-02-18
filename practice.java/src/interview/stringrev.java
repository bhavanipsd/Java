package interview;
import java.util.*;
public class stringrev {

	public static void main(String[] args) {
		String s="hello";
		char[] c=s.toCharArray();
		Arrays.sort(c);
		for(char t:c)
			System.out.println(t);
		for(int x=s.length()-1;x>=0;x--)
		{
			System.out.println(s.charAt(x));
		}
		for(int i=0;i<s.length();i++)
		{
			if(c[i]%2==0)
			{
				
			}
				
		}
	}

}
