package in.sp.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String args[]) {
		
		String config= "configuration.xml";
		ApplicationContext con = new ClassPathXmlApplicationContext(config);
		
		Student st = (Student)con.getBean("StudId");
		st.show();
	}
}
