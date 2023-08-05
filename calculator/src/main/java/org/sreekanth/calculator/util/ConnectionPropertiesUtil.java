package org.sreekanth.calculator.util;

import java.util.Properties;

public class ConnectionPropertiesUtil {
		
	public static Properties getMysqlDbProperties() {
		
		Properties properties = new Properties();
		properties.setProperty("hibernate.connection.driver_class", "com.mysql.cj.jdbc.Driver");
		properties.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/sreekanth");
		properties.setProperty("hibernate.connection.username", "root");
		properties.setProperty("hibernate.connection.password", "password");
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		return properties;
	}
	
}
