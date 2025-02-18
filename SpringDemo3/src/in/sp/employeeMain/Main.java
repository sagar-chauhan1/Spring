package in.sp.employeeMain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.employee.Employee;

public class Main {
	
	public static void main(String args[]) {
		
		String congi = "/in/sp/configuration/configurationFile.xml";
		ApplicationContext con = new ClassPathXmlApplicationContext(congi);
		
		Employee s1 = (Employee) con.getBean("employee");
		s1.setId(8);
		s1.setName("hardik");
		s1.setSalary(34000);
		s1.show();
	}
}
