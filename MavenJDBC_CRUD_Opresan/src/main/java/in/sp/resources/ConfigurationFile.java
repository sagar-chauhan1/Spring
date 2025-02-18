package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class ConfigurationFile {
	
	@Bean
	public DriverManagerDataSource dataSource() {
		
		DriverManagerDataSource source = new DriverManagerDataSource();
		source.setDriverClassName("com.mysql.cj.jdbc.Driver");
		source.setUrl("jdbc:mysql://localhost:3306/mydb");
		source.setUsername("root");
		source.setPassword("Sagar");
		
		return source;
	}
	
	@Bean
	public JdbcTemplate template() {
		
		JdbcTemplate temp = new JdbcTemplate();
		temp.setDataSource(dataSource());
		
		return temp;

	}
}
