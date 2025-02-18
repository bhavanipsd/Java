package com.java;
import java.util.*;

public class absandinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child c=new child();
		c.add(); 
		c.mul();
	}

}
abstract class gp
{
	abstract void add();//direst closing no implementation
	//we cannot create object for a abstract class because there is no implementation
	//we can access these with child class
	final void mul()
	{
		//abstract class can contain both abstract and normal methods
		System.out.println("this is final class");
	}
}
abstract class parent{
	
}
 class child extends gp
{

	@Override
	void add() {
		// TODO Auto-generated method stub
		System.out.println("hi hello good mrng");
	}
	
		
}
	
