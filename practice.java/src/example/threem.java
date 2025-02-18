package example;
import java.util.Arrays;

public class threem {

	public static void main(String[] args) {
    int[] a=new int[] {12,10,9,5,3,7};
    Arrays.sort(a);
    for(int temp:a)
    System.out.print(temp+" ");
    int min=a[0];
    for(int x=0;x<a.length;x++) {
    	if(a[x]<min) {
    		min=a[x];
    	}
    } 
	System.out.println();
	System.out.println(min);

	}

}
