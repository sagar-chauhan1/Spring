package configuration;

import org.springframework.context.annotation.Bean;

public class SpringConfigurationFile {
	
	@Bean(name="student")
	public Student stdId() {
		Student s1 = new Student();
		s1.setRollNo(12);
		s1.setName("sagar");
		
		return s1;
	}
}
