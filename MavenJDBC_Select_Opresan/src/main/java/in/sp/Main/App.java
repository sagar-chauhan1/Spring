package in.sp.Main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.sp.resources.ConfigurationFile;
import in.sp.student.Student;
import in.sp.student.StudentRowMapper;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext con = new AnnotationConfigApplicationContext(ConfigurationFile.class);
        
        JdbcTemplate temp = con.getBean(JdbcTemplate.class);
        
        String quer = "SELECT * FROM sagar";
        
        List<Student> std_list = temp.query(quer, new StudentRowMapper());
        
        for(Student stu : std_list) {
        	
        	System.out.println("Id  : "+stu.getId());
        	System.out.println("Name  : "+stu.getName());
        	System.out.println("Salary  : "+stu.getSalary());
        	System.out.println("-------------------");
        }
         
        //One row select
        
//        int id = 1;
//        String quer = "SELECT * FROM sagar where id=?";
//        		
//        List<Student> std_list = temp.query(quer, new StudentRowMapper(),id);
//        
//        for(Student stu : std_list) {
//        	
//        	System.out.println("Id : "+stu.getId());
//        	System.out.println("Name : "+stu.getName());
//        	System.out.println("Salary :"+stu.getSalary());
//        }
    }
}
