package in.sp.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.dependency.Address;
import in.sp.dependency.Student;

@Configuration
public class ConfigurationDemo {
	
	@Bean
	public Address addrId() {
		
		int house = 123;
		String city = "Vanpari";
		int pincode = 360110;
		
		Address addr = new Address(house,city,pincode);
	
		return addr;
	}
	
	@Bean
	public Student studId() {
		
		int id = 4;
		String name = "dharmik";
		Address address = addrId();		//manually DI
		
		Student stu = new Student(id, name, address);
		
		return stu;
	}
}
