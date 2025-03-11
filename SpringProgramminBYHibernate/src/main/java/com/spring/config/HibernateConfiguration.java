package com.spring.config;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement // Enables annotation-driven transaction management (e.g., @Transactional).
@ComponentScan("com.spring.dao")
@PropertySource(value = { "classpath:application.properties" }) // Path of the properties file
public class HibernateConfiguration {

    @Autowired
    private Environment environment; // Responsible for pulling values from properties file

    @Bean // LocalSessionFactoryBean: Creates SessionFactory instance inside Spring
    public LocalSessionFactoryBean sessionFactory() {
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setDataSource(dataSource()); // DB configurations
        sessionFactory.setPackagesToScan(new String[] { "com.spring.model" });

        Properties p = new Properties();
        p.put("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
        p.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
        p.put("hibernate.format_sql", environment.getRequiredProperty("hibernate.format_sql"));
        p.put("hibernate.hbm2ddl.auto", environment.getRequiredProperty("hibernate.hbm2ddl.auto"));

        sessionFactory.setHibernateProperties(p);
        return sessionFactory;
    }

    @Bean
    public DriverManagerDataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driverClassName"));
        dataSource.setUrl(environment.getRequiredProperty("jdbc.url"));
        dataSource.setUsername(environment.getRequiredProperty("jdbc.username"));
        dataSource.setPassword(environment.getRequiredProperty("jdbc.password"));
        return dataSource;
    }

    @Bean //ensures automatic transaction management
    public HibernateTransactionManager transactionManager(SessionFactory s) {
        HibernateTransactionManager txManager = new HibernateTransactionManager();
        txManager.setSessionFactory(s);
        return txManager;
    }
}
