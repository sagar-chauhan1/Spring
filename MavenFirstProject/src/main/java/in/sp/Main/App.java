package in.sp.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class App 
{
    public static void main( String[] args )
    {	
    	String config = "/in/sp/resources/applicationContext.xml";
        ApplicationContext con = new ClassPathXmlApplicationContext(config);
        
        Student stu = (Student) con.getBean("StudId");
        stu.show();
    }
}
