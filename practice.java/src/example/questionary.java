package example;
import java.util.*;

public class questionary {

 /*   chap 3
  * public static void main(String[] args) {
    
        int a[] = new int[]{23, 4, 6, 1, 99, 7};
        int b[] = new int[a.length];
        
        for (int i = 0; i <= a.length-1; i++)
        {
            b[i] = a[i];
            System.out.print(b[i] + " ");
        }
        System.out.println();  
        for (int y=0;y<a.length;y++)
        {
        	if(a[y]%2==0)
        	{
        	Arrays.sort(a);
        	System.out.print(a[y]+" even ");
        	}}
        System.out.println();
        for(int x=a.length-1;x>=0;x--)
        {
            if(a[x]!=0)
        	{
        		Arrays.sort(a);
        		System.out.print(a[x]+" odd ");
        	}
        	}
       
            
        
    }
	    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        System.out.println("Enter the size of the array:");
	        int size = s.nextInt();
	        int count=0;
	        
	        int[] a = new int[size];
	        
	        System.out.println("Enter the elements of the array:");
	        for (int x = 0; x < a.length; x++)
	        {
	            a[x] = s.nextInt();
	        }

	        System.out.println("The elements of the array are:");
	        for (int x = 0; x < a.length; x++)
	        {
	            System.out.print(a[x] + " ");
	        }
	        System.out.println("enter the number");
	        int num=s.nextInt();
	        for(int t:a)
	        {
	        	if(num==t)
	        	{
	        	
	        		count++;
	        		
	        	}}
	        if(count>=1)
	        	System.out.println(" given number is present");
	        else
	        	System.out.println(" number not found");
	        System.out.println(count+ " is the count");*/
	        
    public static void main(String[] args) {
    		Scanner s=new Scanner(System.in);
    		System.out.println(" enter the array size");
    		int size = s.nextInt();
    		int count=0,c1=0;
    		int a[]=new int[size];
    		System.out.println("enter the elements");
    		for(int x=0;x<a.length;x++)
    			a[x]=s.nextInt();
    		for(int t:a)
    			System.out.print(t+" ");
    		//search array
    		System.out.println(" find the array");
    		int search=s.nextInt();
    		for(int x=0;x<a.length;x++)
    		{
    			if(search==x)
    			{
    				System.out.println(a[x]);
    				count++;
    			}			
    		}
    		if(count>0)
    			System.out.println(count+" is the count");
	        
            else
            	System.out.println();
    		

}}
	    
	


