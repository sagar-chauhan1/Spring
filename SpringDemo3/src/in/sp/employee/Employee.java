package in.sp.employee;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	private int id;
	private String name;
	private double salary;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void show() {
		System.out.println("emp_id : "+id);
		System.out.println("emp_name : "+name);
		System.out.println("emp_salary : "+salary);
	}
	
}
