package com.cf;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class EmployeeSal{
	 private String name;
	 private int id;
	 private double salary;
	public EmployeeSal(String name, int id, double salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeSal [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	 
}

class HighPay implements Comparator<EmployeeSal>{

	@Override
	public int compare(EmployeeSal o1, EmployeeSal o2) {
		if(o1.getSalary()>o2.getSalary()) {
			return 1;
		}
		else if(o1.getSalary()<o2.getSalary()) {
			return -1;
		}else {
			return 0;
		}
	}
	
}
public class Empsal {
	public static void main(String[] args) {
		List list=new ArrayList();
		EmployeeSal emp1=new EmployeeSal("raju",123,15000);
		EmployeeSal emp2=new EmployeeSal("kaju",113,18000);
		EmployeeSal emp3=new EmployeeSal("saju",103,25000);
		EmployeeSal emp4=new EmployeeSal("praju",173,46000);
		EmployeeSal emp5=new EmployeeSal("teju",133,100000);
		EmployeeSal emp6=new EmployeeSal("netaju",143,180000);
		EmployeeSal emp7=new EmployeeSal("jiju",153,218000);
		HighPay hp=new HighPay();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.add(emp6);
		list.add(emp7);
		
		Collections.sort(list,hp);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println("3 highest salary are");
		for(int i=0;i<3;i++) {
			System.out.println(list.get(i));
		}
	}

}
