package in.sp.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.dependency.Student;

public class Main {
	
	public static void main(String args[]) {
		
		String config = "/in/sp/configuration/configurationFile.xml";
		ApplicationContext con = new ClassPathXmlApplicationContext(config);
		
		Student s1 = (Student) con.getBean("studId");
		s1.show();
	}
}
