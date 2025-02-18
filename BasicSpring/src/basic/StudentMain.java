package basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
	
	public static void main(String args[]) {
		
		String config = "applicationContext.xml";
		ApplicationContext con=new ClassPathXmlApplicationContext(config);
		
		Student stud = (Student) con.getBean("stdId");
		stud.display();
	
	}
	

}
