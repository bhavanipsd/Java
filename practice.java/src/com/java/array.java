/*package com.java;

import java.util.*;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[] =new int[] {1,11,12,4,5,6,11,1};
        Arrays.sort(a);
        
        int first=0,last=a.length-1,search=111,mid=0;
        for(int temp:a) 
        {
        System.out.print(temp+" ");
        }
        System.out.println("  ");
        while(first<=last){
        	{
        		mid=(first+last)/2;
        		if(a[mid]<search)
        			first=mid+1;
        		else if(a[mid]==search)
        		{
        			System.out.println("element found "+mid);
        		    break;
        		}
        		else
        			last=mid-1;
        	}
        	if(first>last)
        		System.out.println("element not found   ");
        }
        
	}

}*/

package com.java;
public class array {

	public static void main(String[] args) {
	array obj=new array();
	obj=null;
	System.gc();
	System.out.println("obj destroyed");
	}
	@Override
	protected void finalize()
	{
		System.out.println("finalize");
	}
	}




















