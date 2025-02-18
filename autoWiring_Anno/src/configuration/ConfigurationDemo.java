package configuration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import autoWiring_Anno.Address;
import autoWiring_Anno.Student;
import autoWiring_Anno.Subjects;

@Configuration
public class ConfigurationDemo {
	
	@Bean
	public Address addrId() {
		
		Address addr = new Address();
		addr.setHouse(123);
		addr.setCity("Rajkot");
		addr.setPincode(360110);
		
		return addr;
	}
	
	@Bean
	public Subjects subId() {
		
		Subjects sub = new Subjects();
		
		List <String> sub_list = new ArrayList();
		sub_list.add("java");
		sub_list.add("c");
		sub_list.add("sql");
		
		sub.setSubject(sub_list);
		return sub;
	}
	
	@Bean
	public Student studId() {
		
		Student stu = new Student();
		stu.setId(8);
		stu.setName("sagar");
		
//		stu.setAddress(addrId());   //manually DI
//		stu.setSubjects(subId());	//manually DI
		
		return stu;
	}
}
