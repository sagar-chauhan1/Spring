package in.sp.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.configuration.ConfigurationDemo;
import in.sp.dependency.Student;

public class Main {
	
	public static void main(String args[]) {
		
		ApplicationContext con = new AnnotationConfigApplicationContext(ConfigurationDemo.class);
		
		Student s1 = con.getBean(Student.class);
		s1.show();
	}
}
