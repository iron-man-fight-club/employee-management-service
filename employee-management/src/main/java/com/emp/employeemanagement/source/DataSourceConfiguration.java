package com.emp.employeemanagement.source;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.emp.employeemanagement.utils.EmployeManagementUtils;

@Configuration
@PropertySource("classpath:hibernate.application.properties")
public class DataSourceConfiguration {
	
	private static final Logger logger = LoggerFactory.getLogger(DataSourceConfiguration.class);
	
	@Value("${sql.database}")
    private String database;
	
	@Value("${sql.url}")
    private String url;
	
	@Value("${sql.username}")
    private String username;
	
	@Value("${sql.password}")
    private String password;
	
	@Bean
	public DataSource getDataSource() {
		return DataSourceBuilder.create()
				.driverClassName(getDatabase())
				.url(getUrl())
				.username(getUsername())
				.password(getPassword()).build();
	}
	
	public String getPassword() {
		return EmployeManagementUtils.decrypt(password);
	}
	
	public String getUrl() {
		return EmployeManagementUtils.decrypt(url);		
	}
	
	public String getDatabase() {
		return EmployeManagementUtils.decrypt(database);
	}
	
	public String getUsername() {
		return EmployeManagementUtils.decrypt(username);
	}
	
	
	
	
	
}