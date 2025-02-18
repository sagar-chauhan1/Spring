package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentMain {
	
	public static void main(String args[]) {
		
		ApplicationContext con = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		Student stud = (Student) con.getBean("student");
		
		System.out.println(stud);
	}
}
