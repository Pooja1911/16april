package com.cg.config;



import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


@Configuration
@ComponentScan(basePackages="com.cg")
public class ApplicationConfig {
	
	@Bean
    public DataSource dataSource() {
      final  DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver" );
        dataSource.setUrl("jdbc:mysql://localhost:3306/consumer");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        return  dataSource;
    }
 
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        final JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        return jdbcTemplate;
    }


}
