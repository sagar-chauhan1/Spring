package in.sp.employeeMain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.configuration.ConfigurationFile;
import in.sp.employee.Employee;

public class Main {
	
	public static void main(String args[]) {
		
		ApplicationContext con = new AnnotationConfigApplicationContext(ConfigurationFile.class);
		
		Employee e1 = (Employee)con.getBean(Employee.class);
		e1.show();
	}
}
