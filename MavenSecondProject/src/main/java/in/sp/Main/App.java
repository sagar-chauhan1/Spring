package in.sp.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.sp.resources.SpringConfiguration;

public class App 
{
    public static void main( String[] args )
    {	
    	int id = 20;
    	String name = "sagar";
    	int salary = 20000;
       ApplicationContext con = new AnnotationConfigApplicationContext(SpringConfiguration.class);
       
       JdbcTemplate template = con.getBean(JdbcTemplate.class);
       
       String query = "INSERT INTO sagar VALUES(?,?,?)";
       
       int count = template.update(query,id,name,salary);
       
       if(count>0) {
    	   System.out.println("insertion success");
       }else {
    	   System.out.println("insertion failed");
       }
    }
}
