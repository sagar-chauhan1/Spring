package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class ConfigurationFile {
	
	@Bean
	public DriverManagerDataSource source() {
		
		DriverManagerDataSource dataSou = new DriverManagerDataSource();
		dataSou.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSou.setUrl("jdbc:mysql://localhost:3306/mydb");
		dataSou.setUsername("root");
		dataSou.setPassword("Sagar");
		
		return dataSou;
	}
	
	@Bean
	public JdbcTemplate Temp() {
		
		JdbcTemplate template = new JdbcTemplate();
		template.setDataSource(source());
		
		return template;
	}
}
