package com.bin.spring.beans.properties;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	
	public static void main(String[] arg) throws SQLException{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans-properties.xml") ;
		
		DataSource dataSource =  (DataSource) context.getBean("dataSource") ;
		
		System.out.println(dataSource.getConnection());
	}

}
