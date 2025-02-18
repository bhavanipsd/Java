package spring;

import java.util.Arrays;
import java.util.List;

public class product {
	int roll;
	String name;
	int[] a;
	List<Integer> list;
	student student;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getA() {
		return a;
	}
	public void setA(int[] a) {
		this.a = a;
	}
	public List<Integer> getList() {
		return list;
	}
	public void setList(List<Integer> list) {
		this.list = list;
	}
	public student getStudent() {
		return student;
	}
	public void setStudent(student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "product [roll=" + roll + ", name=" + name + ", a=" + Arrays.toString(a) + ", list=" + list
				+ ", student=" + student + "]";
	}
	public product(int roll, String name, int[] a, List<Integer> list) {
		super();
		this.roll = roll;
		this.name = name;
		this.a = a;
		this.list = list;
		
	}
	
	
	

}
