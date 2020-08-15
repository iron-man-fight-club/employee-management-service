package com.emp.employeemanagement.source;

import java.io.IOException;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import sun.misc.BASE64Decoder;

@Configuration
@PropertySource("classpath:hibernate.application.properties")
public class DataSourceConfiguration {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Value("${sql.database}")
    private String database;
	
	@Value("${sql.url}")
    private String url;
	
	@Value("${sql.username}")
    private String username;
	
	@Value("${sql.password}")
    private String password;
	
	private BASE64Decoder decode = new BASE64Decoder();

//	@Value("${spring.datasource.driverClassName}")
//    private String database;
//	@Value("${spring.datasource.url}")
//    private String url;
//	@Value("${spring.datasource.username}")
//    private String username;
//	@Value("${spring.datasource.password}")
//    private String password;
	
	@Bean
	public DataSource getDataSource() {
		
		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
		dataSourceBuilder.driverClassName(getDatabase());
        dataSourceBuilder.url(getUrl());
        dataSourceBuilder.username(getUsername());
        dataSourceBuilder.password(getPassword());
        return dataSourceBuilder.build();
	}
	
	public String getPassword() {
		String decodePassword = null;
		logger.info("class @DataSourceConfiguration method @getPassword EncryptPassword {}",password);
		try {
			decodePassword = new String(decode.decodeBuffer(password));
			logger.info("class @DataSourceConfiguration method @getPassword DecryptPassword {}",decodePassword);
		} catch (IOException e) {
			logger.error("Error class @DataSourceConfiguration method @getPassword",e);
			e.printStackTrace();
		}
		return decodePassword;
	}
	
	public String getUrl() {
		String decodeUrl = null;
		logger.info("class @DataSourceConfiguration method @getUrl EncryptUrl {}",url);
		try {
			decodeUrl = new String(decode.decodeBuffer(url));
			logger.info("class @DataSourceConfiguration method @getUrl DecryptUrl {}",decodeUrl);
		} catch (IOException e) {
			logger.error("Error class @DataSourceConfiguration method @getUrl",e);
			e.printStackTrace();
		}
		return decodeUrl;		
	}
	
	public String getDatabase() {
		String decodeDatabase = null;
		logger.info("class @DataSourceConfiguration method @getDatabase EncryptDatabase {}",database);
		try {
			decodeDatabase = new String(decode.decodeBuffer(database));
			logger.info("class @DataSourceConfiguration method @getDatabase DecryptDatabase {}",decodeDatabase);
		} catch (IOException e) {
			logger.error("Error class @DataSourceConfiguration method @getDatabase",e);
			e.printStackTrace();
		}
		return decodeDatabase;
	}
	
	public String getUsername() {
		String decodeUsername = null;
		logger.info("class @DataSourceConfiguration method @getUsername EncryptUsername {}",username);
		try {
			decodeUsername = new String(decode.decodeBuffer(username));
			logger.info("class @DataSourceConfiguration method @getUsername DecryptUsername {}",decodeUsername);
		} catch (IOException e) {
			logger.error("Error class @DataSourceConfiguration method @getUsername",e);
			e.printStackTrace();
		}
		return decodeUsername;
	}
	
	
	
	
	
}