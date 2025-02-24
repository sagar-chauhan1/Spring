package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import autoWiring_Anno.Student;
import configuration.ConfigurationDemo;

public class Main {
	
	public static void main(String args[]) {
		
		ApplicationContext con = new AnnotationConfigApplicationContext(ConfigurationDemo.class);
		
		Student stu = con.getBean(Student.class);
		stu.show();
	}
}
