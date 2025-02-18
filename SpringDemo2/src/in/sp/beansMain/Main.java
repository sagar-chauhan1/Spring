package in.sp.beansMain;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Student;
import in.sp.configuration.ConfigurationBased;



public class Main {
	
	public static void main(String args[]) {
		
		ApplicationContext con = new AnnotationConfigApplicationContext(ConfigurationBased.class);
		
	    Student stu	= (Student) con.getBean(Student.class);
	    stu.show();
	}
}
