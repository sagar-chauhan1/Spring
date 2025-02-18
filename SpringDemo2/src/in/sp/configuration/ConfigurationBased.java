package in.sp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class ConfigurationBased {
	
	@Bean
	public Student studId() {
		
		Student std = new Student();
		std.setId(8);
		std.setName("krupal");
		return std;
	}
}
